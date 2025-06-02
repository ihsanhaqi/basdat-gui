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

public class MengikutiDAO {
    public static void simpanMengikuti(List<KelasDipilih> daftar) {
        String sql = "INSERT INTO mengikuti (id_pelajar, id_kelas) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (KelasDipilih k : daftar) {
                stmt.setString(1, k.getIdPelajar());
                stmt.setString(2, k.getIdKelas());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getKelasDiikuti(String idPelajar) {
        List<String> list = new ArrayList<>();
        String sql = "SELECT m.nama_mapel, j.hari, j.jam_mulai, j.jam_selesai, p.nama_pegawai " +
                     "FROM mengikuti ik " +
                     "JOIN kelas k ON ik.id_kelas = k.id_kelas " +
                     "JOIN jadwal j ON k.id_jadwal = j.id_jadwal " +
                     "JOIN mata_pelajaran m ON k.id_mapel = m.id_mapel " +
                     "JOIN pengajar pg ON k.id_pengajar = pg.id_pegawai " +
                     "JOIN pegawai p ON pg.id_pegawai = p.id_pegawai " +
                     "WHERE ik.id_pelajar = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, idPelajar);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String data = rs.getString("nama_mapel") + " - " + rs.getString("hari") + " - " + rs.getString("jam_mulai") + " - " + rs.getString("jam_selesai") + " - " + rs.getString("nama_pegawai");
                list.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}