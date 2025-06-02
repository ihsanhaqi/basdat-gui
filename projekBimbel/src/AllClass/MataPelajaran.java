/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author ASUS
 */
public class MataPelajaran {
    private String id_mapel;
    private String nama_mapel;
    private String kategori;

    // Constructor
    public MataPelajaran(String id_mapel, String nama_mapel, String kategori) {
        this.id_mapel = id_mapel;
        this.nama_mapel = nama_mapel;
        this.kategori = kategori;
    }

    // Getter dan Setter
    public String getIdMapel() {
        return id_mapel;
    }

    public void setIdMapel(String id_mapel) {
        this.id_mapel = id_mapel;
    }

    public String getNama() {
        return nama_mapel;
    }

    public void setNama(String nama) {
        this.nama_mapel = nama_mapel;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
