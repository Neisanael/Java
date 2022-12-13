/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author admin
 */
public class StockBarang {
    int kode, jumlah;
    String nama;
    double harga_jual, harga_beli;

    public StockBarang(int kode, String nama, double harga_jual, double harga_beli, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga_jual = harga_jual;
        this.harga_beli = harga_beli;
        this.jumlah = jumlah;
    }

    public void setHarga_beli(double harga_beli) {
        this.harga_beli = harga_beli;
    }

    public int getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga_jual() {
        return harga_jual;
    }

    public double getHarga_beli() {
        return harga_beli;
    }

    public int getJumlah() {
        return jumlah;
    }
}
