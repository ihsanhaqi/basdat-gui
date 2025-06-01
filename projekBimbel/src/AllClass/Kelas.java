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
    private String id_pengajar; // FK ke pengajar
    private String id_jadwal; // FK ke jadwal
    private String id_mapel; // FK ke mapel

    // Constructor
    public Kelas(String id_kelas, int kuota, String id_pengajar, String id_jadwal, String id_mapel) {
        this.id_kelas = id_kelas;
        this.kuota = kuota;
        this.id_pengajar = id_pengajar;
        this.id_jadwal = id_jadwal;
        this.id_mapel = id_mapel;
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
    
    public String getIdPengajar() {
        return id_pengajar;
    }

    public void setIdPengajar(String id_pengajar) {
        this.id_pengajar = id_pengajar;
    }
    
    public String getIdJadwal() {
        return id_jadwal;
    }

    public void setIdJadwal(String id_jadwal) {
        this.id_jadwal = id_jadwal;
    }
    
    public String getIdMapel() {
        return id_mapel;
    }

    public void setIdMapel(String id_mapel) {
        this.id_mapel = id_mapel;
    }
}
