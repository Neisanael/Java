/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO1;

/**
 *
 * @author Neisan
 */
public class Mahasiswa {

    private String nama, prodi;
    private int nim;
    private MataKuliah[] daftarMatkul;
    private int nilaiA, nilaiB, nilaiC, nilaiD, nilaiE, nilaiF, nilaiG, ipk;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public MataKuliah[] getDaftarMatkul() {
        return daftarMatkul;
    }

    public void setDaftarMatkul(MataKuliah[] daftarMatkul) {
        this.daftarMatkul = daftarMatkul;
    }

    public int getNilaiA() {
        return nilaiA;
    }

    public void setNilaiA(int nilaiA) {
        this.nilaiA = nilaiA;
    }

    public int getNilaiB() {
        return nilaiB;
    }

    public void setNilaiB(int nilaiB) {
        this.nilaiB = nilaiB;
    }

    public int getNilaiC() {
        return nilaiC;
    }

    public void setNilaiC(int nilaiC) {
        this.nilaiC = nilaiC;
    }

    public int getNilaiD() {
        return nilaiD;
    }

    public void setNilaiD(int nilaiD) {
        this.nilaiD = nilaiD;
    }

    public int getNilaiE() {
        return nilaiE;
    }

    public void setNilaiE(int nilaiE) {
        this.nilaiE = nilaiE;
    }

    public int getNilaiF() {
        return nilaiF;
    }

    public void setNilaiF(int nilaiF) {
        this.nilaiF = nilaiF;
    }

    public int getNilaiG() {
        return nilaiG;
    }

    public void setNilaiG(int nilaiG) {
        this.nilaiG = nilaiG;
    } 
}
