/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;
import java.util.*;
import java.sql.*;
import util.DatabaseConnection;
/**
 *
 * @author LENOVO
 */public class JadwalDAO {
     public static List<KelasDipilih> getAllJadwal() {
        List<KelasDipilih> list = new ArrayList<>();

        String sql = "SELECT k.id_kelas, k.kuota, p.id_pegawai, m.nama_mapel, j.hari, j.jam_mulai, j.jam_selesai "
                   + "FROM kelas k "
                   + "JOIN pengajar p ON k.id_pengajar = p.id_pegawai "
                   + "JOIN mata_pelajaran m ON k.id_mapel = m.id_mapel "
                   + "JOIN jadwal j ON k.id_jadwal = j.id_jadwal";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                KelasDipilih kd = new KelasDipilih();
                kd.setIdKelas(rs.getString("id_kelas"));
                kd.setKuota(rs.getInt("kuota"));
                kd.setIdPegawai(rs.getString("id_pegawai"));
                kd.setNamaMapel(rs.getString("nama_mapel"));
                kd.setHari(rs.getString("hari"));
                kd.setJamMulai(rs.getString("jam_mulai"));
                kd.setJamSelesai(rs.getString("jam_selesai"));

                list.add(kd);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
