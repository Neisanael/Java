/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cobatabel;

import java.util.ArrayList;

/**
 *
 * @author iwanbinanto
 */
public class CobaTabel {
    public static void main(String args[]) {
        ArrayList<DataPenjualan> dataJualan = new ArrayList<DataPenjualan>();
        
        String tipe = "Satellite L630-1031U";
        String warna = "Black";
        String so = "MS Windows 11";
        int jumlah = 1;
        dataJualan.add(new DataPenjualan(tipe, warna, so, jumlah));
        
        String tipe1 = "Satellite L630-101078X";
        String warna1 = "Maroon";
        String so1 = "MS Windows 10";
        int jumlah1 = 2;
        dataJualan.add(new DataPenjualan(tipe1, warna1, so1, jumlah1));
//        
//        data.setTipe("Qosmio X500-D832");
//        data.setWarna("Silver");
//        data.setSO("UBUNTU 24.0");
//        data.setJum(2);
//        dataJualan.add(data);
//        
        FrameTabel tampil = new FrameTabel(dataJualan);
        tampil.setVisible(true);
        for(DataPenjualan jual:dataJualan){
            System.out.println(jual.getJum()+"---"+jual.getTipe());
        }
    }   
}
