/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author natha
 */
public class PenjualanData {
    int kode, jumlah_stock, jumlah_beli, id_jual;
    String nama;
    double harga;

    public PenjualanData(int kode, int jumlah_stock, int jumlah_beli, String nama, double harga, int id_jual) {
        this.kode = kode;
        this.jumlah_stock = jumlah_stock;
        this.jumlah_beli = jumlah_beli;
        this.nama = nama;
        this.harga = harga;
        this.id_jual = id_jual;
    }

    public int getKode() {
        return kode;
    }

    public int getJumlah_stock() {
        return jumlah_stock;
    }

    public int getJumlah_beli() {
        return jumlah_beli;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getId_jual() {
        return id_jual;
    }
    
    
}
