/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllClass;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<String> daftarKelas;

    public Keranjang() {
        daftarKelas = new ArrayList<>();
    }

    public void tambahKelas(String idKelas) {
        if (!daftarKelas.contains(idKelas)) {
            daftarKelas.add(idKelas);
        }
    }

    public void hapusKelas(String idKelas) {
        daftarKelas.remove(idKelas);
    }

    public List<String> getDaftarKelas() {
        return daftarKelas;
    }

    public void kosongkan() {
        daftarKelas.clear();
    }

    public boolean isKosong() {
        return daftarKelas.isEmpty();
    }
}
