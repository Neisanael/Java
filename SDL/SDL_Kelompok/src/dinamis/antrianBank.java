/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinamis;

/**
 *
 * @author natha
 */
public class antrianBank {

    String noAntrian, nama, tanggal;

    public String getNoAntrian() {
        return noAntrian;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public antrianBank(String noAntrian, String nama, String tanggal) {
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        return noAntrian + " : " + nama + " : " + tanggal;
    }
}
