/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class Admint extends Pegawai {
    private String sesi;
    private String bagian;

    public Admint(String idPegawai, String namaPegawai, String emailPegawai, String jenisKelamin, String sesi, String bagian) {
        super(idPegawai, namaPegawai, emailPegawai, jenisKelamin);
        this.sesi = sesi;
        this.bagian = bagian;
    }

    public String getShift() {
        return sesi;
    }

    public void setShift(String sesi) {
        this.sesi = sesi;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
}
