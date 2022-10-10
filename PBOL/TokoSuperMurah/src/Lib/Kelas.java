package Lib;

public class Kelas {

    private String nama;
    private Dosen dosen;
    private Mahasiswa[] mahasiswa;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Mahasiswa[] getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa[] mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
