/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class Pengajar extends Pegawai {
    private String bidang_keahlian;
    private String id_jadwal; // FK ke jadwal

    public Pengajar(String id_pegawai, String nama_pegawai, String email_pegawai, String jenis_kelamin, String bidang_keahlian, String id_jadwal) {
        super(id_pegawai, nama_pegawai, email_pegawai, jenis_kelamin);
        this.bidang_keahlian = bidang_keahlian;
        this.id_jadwal = id_jadwal;
    }

    public String getBidangKeahlian() {
        return bidang_keahlian;
    }

    public void setBidangKeahlian(String bidang_keahlian) {
        this.bidang_keahlian = bidang_keahlian;
    }
    
    public String getIdJadwal() {
        return id_jadwal;
    }

    public void setIdJadwal(String id_jadwal) {
        this.id_jadwal = id_jadwal;
    }
}
    