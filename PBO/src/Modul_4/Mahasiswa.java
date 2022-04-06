package Modul_4;
public class Mahasiswa {
    private String nama, tglLahir, nim;
    private double uts1, uts2, uas;

    public Mahasiswa(String nama, String tglLahir, String nim, double uts1, double uts2, double uas) {
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.nim = nim;
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getUts1() {
        return uts1;
    }

    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    public double getUts2() {
        return uts2;
    }

    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    double nilaiFinal(){
        double nilai;
        nilai = (0.3*uts1)+(0.3*uts2)+(0.4*uas);
        return nilai;
    }
    
    public char konversiNilai(){
        char fnl = 0;
        if (nilaiFinal() <= 100 && nilaiFinal() > 80) {
            fnl = 'a';
        } else if (nilaiFinal() < 80 && nilaiFinal() >= 70) {
            fnl = 'b';
        } else if (nilaiFinal() >= 56 && nilaiFinal() < 70) {
            fnl = 'c';
        } else if (nilaiFinal() >= 45 && nilaiFinal() < 56) {
            fnl = 'd';
        } else if (nilaiFinal() >= 0 && nilaiFinal() < 45) {
            fnl = 'e';
        }
        return fnl;
    }
}
