package Modul_5;
public class Buku {
    private String kodeBuku, judul;
    private int tahunTerbit;
    private Pengarang[] karang;

    public Buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public Pengarang[] getKarang() {
        return karang;
    }

    public void setKarang(Pengarang[] karang) {
        this.karang = karang;
    }
    
}
