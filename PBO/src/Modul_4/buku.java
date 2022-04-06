package Modul_4;
public class buku {
    private String kodeBuku, judulBuku, tahunTebit, namaPengarang;

    public buku(String kodeBuku, String judulBuku, String tahunTebit, String namaPengarang) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTebit = tahunTebit;
        this.namaPengarang = namaPengarang;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getTahunTebit() {
        return tahunTebit;
    }

    public void setTahunTebit(String tahunTebit) {
        this.tahunTebit = tahunTebit;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }
    
    void display(){
        System.out.println(getKodeBuku()+"\t"+getJudulBuku()+"\t"+getTahunTebit()+"\t"+getNamaPengarang());
    }
    
}
