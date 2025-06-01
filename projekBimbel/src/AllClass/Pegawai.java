/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    protected String id_pegawai;
    protected String nama_pegawai;
    protected String email_pegawai;
    protected String jenis_kelamin;

    // Constructor
    public Pegawai(String id_pegawai, String nama_pegawai, String email_pegawai, String jenis_kelamin) {
        this.id_pegawai = id_pegawai;
        this.nama_pegawai = nama_pegawai;
        this.email_pegawai = email_pegawai;
        this.jenis_kelamin = jenis_kelamin;
    }

    // Getter dan Setter
    public String getIdPegawai() {
        return id_pegawai;
    }

    public void setIdPegawai(String id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public String getNamaPegawai() {
        return nama_pegawai;
    }

    public void setNamaPegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getEmailPegawai() {
        return email_pegawai;
    }

    public void setEmailPegawai(String email_pegawai) {
        this.email_pegawai = email_pegawai;
    }

    public String getJenisKelamin() {
        return jenis_kelamin;
    }

    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
}
