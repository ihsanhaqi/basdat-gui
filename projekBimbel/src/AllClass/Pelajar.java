/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class Pelajar {
    private String id_pelajar;
    private String nama;
    private String tanggal_lahir;
    private String alamat;
    private String email;
    private String nomor_hp;
    private String jenis_kelamin;

    // Constructor
    public Pelajar(String id_pelajar, String nama, String tanggal_lahir,
                   String alamat, String email, String nomor_hp, String jenis_kelamin) {
        this.id_pelajar = id_pelajar;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
        this.email = email;
        this.nomor_hp = nomor_hp; 
        this.jenis_kelamin = jenis_kelamin;
    }

    // Getter dan Setter
    public String getIdPelajar() {
        return id_pelajar;
    }

    public void setIdPelajar(String id_pelajar) {
        this.id_pelajar = id_pelajar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggal_lahir;
    }

    public void setTanggalLahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorHp() {
        return nomor_hp;
    }

    public void setNomorHp(String nomor_hp) {
        this.nomor_hp = nomor_hp;
    }

    public String getJenisKelamin() {
        return jenis_kelamin;
    }

    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
}
