/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coba;

/**
 *
 * @author Neisan
 */
public class Buku {

    private String kodeBuku, judul;
    private int tahunTerbit;
    Pengarang[] daftarPengarang;

    public Buku(String kodeBuku, String judul) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setDaftarPengarang(Pengarang[] daftarPengarang) {
        this.daftarPengarang = daftarPengarang;
    }

    public Pengarang[] getDaftarPengarang() {
        return daftarPengarang;
    }
}
