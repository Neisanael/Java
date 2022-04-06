package Modul_5;
import javax.swing.*;
public class KelolaDealer {
    public static void main(String[] args) {
        String nama,warna;
        Mobil[] mbl;
        int jumlah;
        jumlah =Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Mobil : "));
        mbl=new Mobil[jumlah];
        
        for (int i = 0; i < mbl.length; i++) {
             nama = JOptionPane.showInputDialog("Masukkan Nama : ");
            warna = JOptionPane.showInputDialog("Masukkan warna : ");
            mbl[i]=new Mobil(nama,warna);
        }
        Dealer dlr=new Dealer("Toyota","Bandung","Joko","1988231");
        System.out.println("Dealer");
        System.out.println("Nama Dealer    :"+dlr.getNama());
        System.out.println("Alamat Dealer  :"+dlr.getAlamat());
        System.out.println("Pemilik Dealer :"+dlr.getPemilik());
        System.out.println("Nomor NPWP     : "+dlr.getNPWP());
        System.out.println("List Mobil :");
        System.out.println("");
        
       for (int i = 0; i < mbl.length; i++) {
            System.out.println("Merk :"+mbl[i].getMerk());
            System.out.println("Warna:"+mbl[i].getWarna());
            System.out.println("**--------("+(i+1)+")--------**");
        }
    }
}
