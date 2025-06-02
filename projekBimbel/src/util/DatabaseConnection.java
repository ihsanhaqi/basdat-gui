/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class DatabaseConnection {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String server = "localhost";
                String database = "ProyekBimbel";
                String user = "sa";
                String password = "admin123";
                String url = "jdbc:sqlserver://" + server + ":1300;databaseName=" + database + ";encrypt=false";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }
}
