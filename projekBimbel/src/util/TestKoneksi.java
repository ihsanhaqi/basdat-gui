/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author LENOVO
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestKoneksi {
    public static void main(String[] args) {
        Connection conn = util.DatabaseConnection.getConnection();
        if (conn != null) {
            System.out.println("Tes koneksi sukses!");
        } else {
            System.out.println("Tes koneksi gagal");
        }
    }
}
