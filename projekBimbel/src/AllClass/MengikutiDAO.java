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
    private Connection conn;

    public MengikutiDAO(Connection conn) {
        this.conn = conn;
    }

    public void insertMengikuti(String idPelajar, String idKelas) throws SQLException {
        String sql = "INSERT INTO mengikuti (id_pelajar, id_kelas) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, idPelajar);
        stmt.setString(2, idKelas);
        stmt.executeUpdate();
    }
}
