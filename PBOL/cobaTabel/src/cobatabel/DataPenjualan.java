/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobatabel;

/**
 *
 * @author iwanbinanto
 */
public class DataPenjualan {

    public DataPenjualan(String tipe, String warna, String SO, int jum) {
        this.tipe = tipe;
        this.warna = warna;
        this.SO = SO;
        this.jum = jum;
    }
    
    String tipe, warna, SO;
    int jum;

    public String getTipe() {
        return tipe;
    }

    public String getWarna() {
        return warna;
    }

    public String getSO() {
        return SO;
    }

    public int getJum() {
        return jum;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public void setJum(int jum) {
        this.jum = jum;
    }
    
    
}
