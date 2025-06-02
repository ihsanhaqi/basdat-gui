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
    public static List<String> getJadwalKelas() {
        List<String> list = new ArrayList<>();
        String sql = "SELECT k.id_kelas, m.nama_mapel, j.hari, j.jam_mulai, j.jam_selesai, p.nama_pegawai " +
                     "FROM kelas k " +
                     "JOIN jadwal j ON k.id_jadwal = j.id_jadwal " +
                     "JOIN mata_pelajaran m ON k.id_mapel = m.id_mapel " +
                     "JOIN pengajar pg ON k.id_pengajar = pg.id_pegawai " +
                     "JOIN pegawai p ON pg.id_pegawai = p.id_pegawai";

        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String baris = rs.getString("id_kelas") + " - " + rs.getString("nama_mapel") + " - " + rs.getString("hari") + " - " + rs.getString("jam_mulai") + " - " + rs.getString("jam_selesai") + " - " + rs.getString("nama_pegawai");
                list.add(baris);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}