/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author LENOVO
 */
import AllClass.Keranjang;
import java.sql.*;
import java.math.BigDecimal;
import java.util.List;

public class PembayaranDAO {
    private Connection conn;

    public PembayaranDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean prosesPembayaran(Keranjang keranjang, String metodeBayar, String idPelajar) throws SQLException {
        if (keranjang.isKosong()) {
            throw new IllegalStateException("Keranjang kosong.");
        }

        String idPembayaran = "P" + System.currentTimeMillis();
        int totalBayar = keranjang.getDaftarKelas().size() * 100000;

        try {
            conn.setAutoCommit(false);

            // Insert ke tabel pembayaran
            String sqlPembayaran = "INSERT INTO pembayaran (id_pembayaran, tgl_bayar, jumlah_bayar, metode_bayar, status_pembayaran, id_pelajar) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement psPembayaran = conn.prepareStatement(sqlPembayaran)) {
                psPembayaran.setString(1, idPembayaran);
                psPembayaran.setDate(2, new Date(System.currentTimeMillis()));
                psPembayaran.setBigDecimal(3, new BigDecimal(totalBayar));
                psPembayaran.setString(4, metodeBayar);
                psPembayaran.setString(5, "Lunas");
                psPembayaran.setString(6, idPelajar);
                psPembayaran.executeUpdate();
            }

            // Insert ke tabel mengikuti
            String sqlMengikuti = "INSERT INTO mengikuti (id_pelajar, id_kelas) VALUES (?, ?)";
            try (PreparedStatement psMengikuti = conn.prepareStatement(sqlMengikuti)) {
                for (String idKelas : keranjang.getDaftarKelas()) {
                    psMengikuti.setString(1, idPelajar);
                    psMengikuti.setString(2, idKelas);
                    psMengikuti.addBatch();
                }
                psMengikuti.executeBatch();
            }

            conn.commit();
            keranjang.kosongkan(); // Kosongkan keranjang setelah berhasil
            return true;
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
}