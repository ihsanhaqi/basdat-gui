/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class Jadwal {
    private String id_jadwal;
    private String hari;
    private String jam_mulai;
    private String jam_selesai;
    private String id_kelas; // FK ke Kelas

    // Constructor
    public Jadwal(String id_jadwal, String hari, String jam_mulai, String jam_selesai, String id_kelas) {
        this.id_jadwal = id_jadwal;
        this.hari = hari;
        this.jam_mulai = jam_mulai;
        this.jam_selesai = jam_selesai;
        this.id_kelas = id_kelas;
    }

    // Getter dan Setter
    public String getIdJadwal() {
        return id_jadwal;
    }

    public void setIdJadwal(String id_jadwal) {
        this.id_jadwal = id_jadwal;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJamMulai() {
        return jam_mulai;
    }

    public void setJamMulai(String jam_mulai) {
        this.jam_mulai = jam_mulai;
    }

    public String getJamSelesai() {
        return jam_selesai;
    }

    public void setJamSelesai(String jam_selesai) {
        this.jam_selesai = jam_selesai;
    }

    public String getIdKelas() {
        return id_kelas;
    }

    public void setIdKelas(String id_kelas) {
        this.id_kelas = id_kelas;
    }
}
