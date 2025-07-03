package AllClass;

public class KelasDipilih {
    private String namaKelas;
    private String namaMapel;
    private String namaPengajar;
    private String hari;
    private String jamMulai;
    private String jamSelesai;
    private String namaRuangan;
    private int kapasitas;

    public KelasDipilih() {
    }

    public KelasDipilih(String namaKelas, String namaMapel, String namaPengajar,
                        String hari, String jamMulai, String jamSelesai,
                        String namaRuangan, int kapasitas) {
        this.namaKelas = namaKelas;
        this.namaMapel = namaMapel;
        this.namaPengajar = namaPengajar;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
    }

    // Getter & Setter
    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getNamaMapel() {
        return namaMapel;
    }

    public void setNamaMapel(String namaMapel) {
        this.namaMapel = namaMapel;
    }

    public String getNamaPengajar() {
        return namaPengajar;
    }

    public void setNamaPengajar(String namaPengajar) {
        this.namaPengajar = namaPengajar;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(String jamMulai) {
        this.jamMulai = jamMulai;
    }

    public String getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(String jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}
