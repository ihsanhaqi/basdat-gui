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
    private String shift;
    private String jabatan;

    public Satpam(String idPegawai, String namaPegawai, String emailPegawai, String jenisKelamin, String shift, String jabatan) {
        super(idPegawai, namaPegawai, emailPegawai, jenisKelamin);
        this.shift = shift;
        this.jabatan = jabatan;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
