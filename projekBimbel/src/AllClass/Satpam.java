/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class Satpam extends Pegawai {
    private String sesi;
    private String jabatan;

    public Satpam(String idPegawai, String namaPegawai, String emailPegawai, String jenisKelamin, String sesi, String jabatan) {
        super(idPegawai, namaPegawai, emailPegawai, jenisKelamin);
        this.sesi = sesi;
        this.jabatan = jabatan;
    }

    public String getShift() {
        return sesi;
    }

    public void setShift(String sesi) {
        this.sesi = sesi;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
