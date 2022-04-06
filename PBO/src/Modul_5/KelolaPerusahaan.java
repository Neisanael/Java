//Andreas Nathanael Priambodo 215314043
package Modul_5;
import javax.swing.*;
public class KelolaPerusahaan {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Masukan Jumlah Pegawai : ");
        int n = Integer.parseInt(a);
        Pegawai[] peg = new Pegawai[n];
        
        //perusahaan input
        Perusahaan usaha = new Perusahaan("Bebas", "Yogyakarta", "Aku", "12345");
        
        //pegawai input
        for(int i = 0; i < peg.length; i++){
            String npp = JOptionPane.showInputDialog("Masukan NPP : ");
            String nama = JOptionPane.showInputDialog("Masukan Nama : ");
            String golongan = JOptionPane.showInputDialog("Masukan Golongan: ");
            String status = JOptionPane.showInputDialog("Masukan Status (1. Menikah 2. Belum Menikah): ");
            String jumlah_anak = JOptionPane.showInputDialog("Masukan Jumlah anak : ");
            int anak = Integer.parseInt(jumlah_anak);
            String sts;
            if(status.equalsIgnoreCase("Menikah")){
                sts = "Menikah";
                peg[i]= new Pegawai(npp, nama, golongan, sts, anak);
            }if(status.equalsIgnoreCase("Belum Menikah")){
                sts = "Belum Menikah";
                peg[i]= new Pegawai(npp, nama, golongan, sts, anak);
            }
        }
        usaha.setDaftarPegawai(peg);
        
        //perusahaan output
        System.out.println("\tDATA PERUSAHAAN");
        System.out.println("Nama Perusahaan\t\t:"+usaha.getNamaPerusahaan());
        System.out.println("Alamat Perusahaan\t:"+usaha.getAlamat());
        System.out.println("Pemilik Perusahaan\t:"+usaha.getPemilik());
        System.out.println("NPWP Perusahaan\t\t:"+usaha.getNPWP());
        
        //array of object method send
        Pegawai[] dftr = usaha.getDaftarPegawai();
        
        //pegawai output
        System.out.println("\n\n");
        System.out.println("\tDAFTAR PEGAWAI");
        System.out.printf("%s%5s%5s%10s%15s%n","No.","NPP","Nama","Golongan","Gaji");
        for(int j = 0; j < dftr.length; j++){
            System.out.printf("%d%7s%5s%5s%23s%n",(j+1),dftr[j].getNPP(),
                    dftr[j].getNama(),dftr[j].getGolongan(),dftr[j].hitungGajiTotal());
        }
        
        //Nilai Tinggi & Rendah
        Pegawai nilaiTinggi = peg[0];
        Pegawai nilaiRendah = peg[0];
        
        for (int i = 1; i < peg.length; i++) {
            if (peg[i].hitungGajiPokok() > nilaiTinggi.hitungGajiPokok()) {
                nilaiTinggi = peg[i];
            } else if (peg[i].hitungGajiPokok() < nilaiRendah.hitungGajiPokok()) {
                nilaiRendah = peg[i];
            }
        }
        
        System.out.println("\n\n");
        System.out.println("\tDAFTAR TERTINGGI");
        System.out.printf("%s%5s%10s%15s%n","No.NPP","Nama","Golongan","Gaji");
        System.out.printf("%s%8s%5s%23d",nilaiTinggi.getNPP(),
                nilaiTinggi.getNama(),nilaiTinggi.getGolongan(),
                nilaiTinggi.hitungGajiTotal());
        System.out.println("\n\n");
        System.out.println("\tDAFTAR TERRENDAH");
        System.out.printf("%s%5s%10s%15s%n","No.NPP","Nama","Golongan","Gaji");
        System.out.printf("%s%8s%5s%23d%n",nilaiRendah.getNPP(),
                nilaiRendah.getNama(),nilaiRendah.getGolongan(),
                nilaiRendah.hitungGajiTotal());
        
        //Rata rata
        double rata = 0;
        for (int i = 0; i < peg.length; i++) {
            rata += peg[i].hitungGajiTotal();
        }
        double rerata = rata/peg.length;
        System.out.println("\nHasil rata rata pegawai"+rerata);
        
    }
}
