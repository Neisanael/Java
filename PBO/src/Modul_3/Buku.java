package Modul_3;
public class Buku {
    private String kodeBuku, judul, namaPengarang;
    private penerbit identitas_penerbit;
    public Buku(String kodeBuku, String judul, String namaPengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.namaPengarang = namaPengarang;
    }
//Kode Buku
    public String getKodeBuku() {
        return kodeBuku;
    }
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }
//Judul
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
//Pengarang
    public String getNamaPengarang() {
        return namaPengarang;
    }
    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }
//Identitas
    public penerbit getIdentitas_penerbit() {
        return identitas_penerbit;
    }
    public void setIdentitas_penerbit(penerbit identitas_penerbit) {
        this.identitas_penerbit = identitas_penerbit;
    }
}
