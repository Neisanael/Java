package Modul_4;
import java.util.*;
import javax.swing.*;
public class KelolaBukua {
    public static void main(String[] args) {
        String a;
        a = JOptionPane.showInputDialog("Masukan Berapa Jumlah Buku : ");
       
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(a);  
        buku[] bku =  new buku[n];
        for(int i = 0; i<bku.length; i++){
            String kbk = JOptionPane.showInputDialog("Kode Buku :");
            String jdlbk = JOptionPane.showInputDialog("Judul Buku : ");
            String thnrbit = JOptionPane.showInputDialog("Tahun terbit : ");
            String nama = JOptionPane.showInputDialog("Nama Pengarang : ");
            bku[i] = new buku(kbk, jdlbk, thnrbit, nama);
        }
        
        System.out.print("Tahun berapa buku yang ingin dilihat : ");
        String thn = sc.next();
        for(int i = 0; i < bku.length; i++){
            if(thn.equalsIgnoreCase(bku[i].getTahunTebit())){
                bku[i].display();
            }
        }
        System.out.print("Nama Pengarang yang ingin dilihat : ");
        String nm = sc.next();
        for(int j = 0; j < bku.length; j++){
            if(nm.equalsIgnoreCase(bku[j].getNamaPengarang())){
                bku[j].display();
            }
        }
    }
}
