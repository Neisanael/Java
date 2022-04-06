package Modul_5;
public class Pengarang {
    private String NIK, nama, alamat;

    public Pengarang(String NIK, String nama, String alamat) {
        this.NIK = NIK;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
}
