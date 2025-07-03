package AllClass;

public class Jadwal {
    private String idJadwal;
    private String hari;
    private String jamMulai;
    private String jamSelesai;

    public Jadwal() {
    }

    public Jadwal(String idJadwal, String hari, String jamMulai, String jamSelesai) {
        this.idJadwal = idJadwal;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    public String getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(String idJadwal) {
        this.idJadwal = idJadwal;
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
}
