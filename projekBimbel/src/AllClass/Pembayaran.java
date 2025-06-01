/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class Pembayaran {
    private String id_pembayaran;
    private String tgl_bayar;
    private double jumlah_bayar;
    private String metode_bayar;
    private String status;

    // Constructor
    public Pembayaran(String id_pembayaran, String tgl_bayar, double jumlah_bayar,
                      String metode_bayar, String status) {
        this.id_pembayaran = id_pembayaran;
        this.tgl_bayar = tgl_bayar;
        this.jumlah_bayar = jumlah_bayar;
        this.metode_bayar = metode_bayar;
        this.status = status;
    }

    // Getter dan Setter
    public String getIdPembayaran() {
        return id_pembayaran;
    }

    public void setIdPembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public String getTglBayar() {
        return tgl_bayar;
    }

    public void setTglBayar(String tgl_bayar) {
        this.tgl_bayar = tgl_bayar;
    }

    public double getJumlahBayar() {
        return jumlah_bayar;
    }

    public void setJumlahBayar(double jumlah_bayar) {
        this.jumlah_bayar = jumlah_bayar;
    }

    public String getMetodeBayar() {
        return metode_bayar;
    }

    public void setMetodeBayar(String metode_bayar) {
        this.metode_bayar = metode_bayar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
