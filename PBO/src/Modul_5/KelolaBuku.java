package Modul_5;
import javax.swing.*;
public class KelolaBuku {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Masukan Berapa Jumlah Buku : ");
        int n = Integer.parseInt(a);
        
        Buku[] bk = new Buku[n];
        
        //Buku
        for(int i = 0; i < bk.length; i++){
            String code = JOptionPane.showInputDialog("Masukan kode buku : ");
            String jdl = JOptionPane.showInputDialog("Masukan judul dari buku : ");
            String tahun = JOptionPane.showInputDialog("Masukan tahun terbit dari buku : ");
            int thn = Integer.parseInt(tahun);
            bk[i] = new Buku(code, jdl, thn);
            
            String jumP = JOptionPane.showInputDialog("Berapa banyak pengarang dalam buku : ");
            int m = Integer.parseInt(jumP);
            Pengarang[] karang = new Pengarang[m];
            
            //Pengarang
            for(int j = 0; j < karang.length; j++){
                String nik = JOptionPane.showInputDialog("Masukan NIK dari Pengarang : ");
                String nama = JOptionPane.showInputDialog("Masukan nama dari Pengarang : "); 
                String alamat = JOptionPane.showInputDialog("Masukan alamt dari Pengarang : ");
                
                karang[j] = new Pengarang(nik, nama, alamat);
                bk[i].setKarang(karang);
            }
        }
        
        System.out.println("\tDATA BUKU DAN PENGARANG");
        for(int k = 0; k < bk.length; k++){
            System.out.println("BUKU "+(k+1));
            System.out.println("Kode Buku : "+bk[k].getKodeBuku());
            System.out.println("Judul Buku : "+bk[k].getJudul());
            System.out.println("Tahun Terbit : "+bk[k].getTahunTerbit());
            Pengarang[] tampung = bk[k].getKarang();
            for(int l = 0; l < tampung.length; l++){
                System.out.println("NIK : "+tampung[l].getNIK());
                System.out.println("Nama : "+tampung[l].getNama());
                System.out.println("Alamat Pengarang : "+tampung[l].getAlamat());
            }
        }
        String cariThn = JOptionPane.showInputDialog("Masukan mau Tahun berapa yang ingin dicari : ");
        int thun = Integer.parseInt(cariThn);
        int jumlah = 0;
        for(int m = 0; m < n; m++){
            if(m < n && bk[m].getTahunTerbit() == thun){
                jumlah =+ 1;
            }
        }
        
        System.out.println("Buku pada Tahun "+thun+" ada sejumlah "+jumlah);
        
        //masukan buku lama dan baru
        Buku baru = bk[0];
        Buku lama = bk[0];
        
        for (int i = 1; i < bk.length; i++) {
            if (bk[i].getTahunTerbit() < lama.getTahunTerbit()) {
                lama = bk[i];
            } else if (bk[i].getTahunTerbit() > baru.getTahunTerbit()) {
                baru = bk[i];
            }
        }

        System.out.println("Buku terlama "+lama.getKodeBuku()+" Judul Buku "+lama.getJudul()
                +" tahun terbitnya "+lama.getTahunTerbit());
        System.out.println("Buku terbaru "+baru.getKodeBuku()+" Judul Buku "+baru.getJudul()
                +" tahun terbitnya "+baru.getTahunTerbit());
    }
}

