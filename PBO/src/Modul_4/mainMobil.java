package Modul_4;
import javax.swing.*;
public class mainMobil {
    public static void main(String[] args) {
        String a;
        a = JOptionPane.showInputDialog("Masukan berapa banyak Mobil : ");
        int n = Integer.parseInt(a);
        Mobil[] mbl = new Mobil[n];
        
        String wrn, mrk;
        
        for(int i = 0; i < mbl.length; i++){
            wrn = JOptionPane.showInputDialog("Masukan Warna mobil : ");
            mrk = JOptionPane.showInputDialog("Masukan Merek mobil : ");
            mbl[i] = new Mobil(mrk, wrn);
        }
        
        for(int i = 0; i < mbl.length; i++){
            System.out.println(mbl[i].getMerk());
            System.out.println(mbl[i].getWarna());
        }
    }
}
