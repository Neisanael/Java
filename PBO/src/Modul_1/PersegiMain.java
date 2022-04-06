package Modul_1;
import javax.swing.JOptionPane;
public class PersegiMain {
    public static void main(String[] args) {
        Persegi objPersegi=new Persegi();

        objPersegi.panj=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        objPersegi.lebar=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
        JOptionPane.showMessageDialog(null, "Luas dari persegidengan panjang="+objPersegi.panj+" "
                + "dan lebar = "+objPersegi.lebar+"adalah "+objPersegi.luas());
    }
}
