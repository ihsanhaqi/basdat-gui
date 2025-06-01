/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class Admin extends Pegawai {
    private String shift;
    private String bagian;

    public Admin(String idPegawai, String namaPegawai, String emailPegawai, String jenisKelamin, String shift, String bagian) {
        super(idPegawai, namaPegawai, emailPegawai, jenisKelamin);
        this.shift = shift;
        this.bagian = bagian;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
}
