/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author LENOVO
 */
import java.sql.*;
import java.util.*;

public class KelasDAO {
    private Connection conn;

    public KelasDAO(Connection conn) {
        this.conn = conn;
    }

    public List<Kelas> getAllKelasWithDetail() throws SQLException {
        List<Kelas> list = new ArrayList<>();
        String sql = "SELECT k.id_kelas, k.kuota, p.nama_pegawai, m.nama_mapel, j.hari, j.jam_mulai, j.jam_selesai " +
                     "FROM kelas k " +
                     "JOIN pengajar pg ON k.id_pengajar = pg.id_pegawai " +
                     "JOIN pegawai p ON pg.id_pegawai = p.id_pegawai " +
                     "JOIN mata_pelajaran m ON k.id_mapel = m.id_mapel " +
                     "JOIN jadwal j ON k.id_jadwal = j.id_jadwal";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            // buat objek Kelas atau model yang sesuai
            list.add(new Kelas(
                rs.getString("id_kelas"),
                rs.getInt("kuota"),
                rs.getString("nama_pegawai"),
                rs.getString("nama_mapel"),
                rs.getString("hari"),
                rs.getString("jam_mulai"),
                rs.getString("jam_selesai")
            ));
        }
        return list;
    }
}
