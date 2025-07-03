/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

import util.DatabaseConnection;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class PelajarDAO {
    public Pelajar getPelajarById(String idPelajar) {
    Pelajar p = null;
    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "SELECT * FROM pelajar WHERE id_pelajar = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, idPelajar);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            p = new Pelajar(
                rs.getString("id_pelajar"),
                rs.getString("nama"),
                rs.getString("tanggal_lahir"),
                rs.getString("alamat"),
                rs.getString("email"),
                rs.getString("nomor_hp"),
                rs.getString("jenis_kelamin"),
                rs.getString("asal_sekolah"),
                rs.getString("angkatan")
            );
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return p;
}
}
