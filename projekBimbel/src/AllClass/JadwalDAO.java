package AllClass;

import util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JadwalDAO {

    public static List<KelasDipilih> getAllJadwal() {
        List<KelasDipilih> list = new ArrayList<>();
        Connection conn = DatabaseConnection.getConnection();

        String sql = "SELECT k.nama_kelas, mp.nama_mapel, pgw.nama_pegawai, " +
                     "j.hari, j.jam_mulai, j.jam_selesai, r.nama_ruangan, r.kapasitas " +
                     "FROM kelas k " +
                     "JOIN mata_pelajaran mp ON k.id_mapel = mp.id_mapel " +
                     "JOIN pengajar p ON k.id_pengajar = p.id_pegawai " +
                     "JOIN pegawai pgw ON p.id_pegawai = pgw.id_pegawai " +
                     "JOIN jadwal j ON k.id_jadwal = j.id_jadwal " +
                     "JOIN berada_di bd ON j.id_jadwal = bd.id_jadwal " +
                     "JOIN ruangan r ON bd.id_ruangan = r.id_ruangan " +
                     "ORDER BY j.hari, j.jam_mulai, k.nama_kelas";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                KelasDipilih kd = new KelasDipilih();
                kd.setNamaKelas(rs.getString("nama_kelas"));
                kd.setNamaMapel(rs.getString("nama_mapel"));
                kd.setNamaPengajar(rs.getString("nama_pegawai"));
                kd.setHari(rs.getString("hari"));
                kd.setJamMulai(rs.getString("jam_mulai"));
                kd.setJamSelesai(rs.getString("jam_selesai"));
                kd.setNamaRuangan(rs.getString("nama_ruangan"));
                kd.setKapasitas(rs.getInt("kapasitas"));
                list.add(kd);
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
