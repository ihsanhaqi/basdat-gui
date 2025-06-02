/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */


public class Kelas {
    private String id_kelas;
    private int kuota;
    private String namaPegawai;
    private String namaMapel;
    private String hari;
    private String jamMulai;
    private String jamSelesai;
    private String level;

    public Kelas(String id_kelas, int kuota, String namaPegawai, String namaMapel, String hari, String jamMulai, String jamSelesai) {
        this.id_kelas = id_kelas;
        this.kuota = kuota;
        this.namaPegawai = namaPegawai;
        this.namaMapel = namaMapel;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    // getter setter jika perlu
    // Constructor
    public Kelas(String id_kelas, int kuota, String level) {
        this.id_kelas = id_kelas;
        this.kuota = kuota;
        this.level = level;
    }

    // Getter dan Setter
    public String getIdKelas() {
        return id_kelas;
    }

    public void setIdKelas(String id_kelas) {
        this.id_kelas = id_kelas;
    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
