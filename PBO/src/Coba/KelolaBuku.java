/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coba;
import javax.swing.JOptionPane;
public class KelolaBuku {
   
    public static void main(String[] args) {
        int jum;
        jum = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Buku akan disimpan"));

        Buku[] bku = new Buku[jum];

        for (int i = 0; i < bku.length; i++) {
            int thn;
            String kode, jdl;
            kode = JOptionPane.showInputDialog(null, "Kode Buku");
            jdl = JOptionPane.showInputDialog(null, "Judul Buku");
            thn = Integer.parseInt(JOptionPane.showInputDialog(null, "Tahun Terbit"));

            bku[i] = new Buku(kode, jdl);
            bku[i].setTahunTerbit(thn);
            int jPengarang;
            jPengarang = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah Pengarang"));

            Pengarang[] pngrng = new Pengarang[jPengarang];
            for (int a = 0; a < jPengarang; a++) {
                String nikPng, nm, alm;
                nikPng = JOptionPane.showInputDialog(null, "NIK Pengarang");
                nm = JOptionPane.showInputDialog(null, "Nama Pengarang");
                alm = JOptionPane.showInputDialog(null, "Alamat Pengarang");

                pngrng[a] = new Pengarang(nikPng, nm);
                pngrng[a].setAlamat(alm);
                bku[i].setDaftarPengarang(pngrng);
            }
        }
        for (int i = 0; i < bku.length; i++) {
            JOptionPane.showMessageDialog(null, "DATA BUKU DAN PENGARANG\n============================="
                    + "\nKode Buku : " + bku[i].getKodeBuku()
                    + "\nJudul Buku: " + bku[i].getJudul()
                    + "\nTahun Terbit: " + bku[i].getTahunTerbit()
                );
            Pengarang[] tampung = bku[i].getDaftarPengarang();
            for (int a = 0; a < tampung.length; a++) {
                JOptionPane.showMessageDialog(null, "Pengarang ke- " + (a + 1)
                        + "\nNIK pengarang : " + tampung[a].getNIK()
                        + "\nNama Pengarang : " + tampung[a].getNama()
                        + "\nAlamat pengarang : " + tampung[a].getAlamat()
                );
            }
        }
        int searchTahun;
        int jumThn = 0;
        searchTahun = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Masukkan tahun terbit yang ingin dicari jumlah bukunya : "));

        for (int i = 0; i < jum; i++) {
            if (i < jum && bku[i].getTahunTerbit() == searchTahun) {
                jumThn += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Jumlah buku pada tahun " + searchTahun + " adalah : " + jumThn);

        Buku terbaru,
                terlama;
        terbaru = terlama = bku[0];
        for (int i = 1; i < bku.length; i++) {
            if (bku[i].getTahunTerbit() < terlama.getTahunTerbit()) {
                terlama = bku[i];
            } else if (bku[i].getTahunTerbit() > terbaru.getTahunTerbit()) {
                terbaru = bku[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Buku terbitan terlama\n==============================="
                + "\nKode Buku : " + terlama.getKodeBuku()
                + "\nJudul Buku : " + terlama.getJudul()
                + "\nTahun Terbit : " + terlama.getTahunTerbit()
        );

        Pengarang[] tampung = terlama.getDaftarPengarang();
        for (int i = 0; i < tampung.length; i++) {
            JOptionPane.showMessageDialog(null, "Pengarang Ke- " + (i + 1) + "\n==========================="
                    + "\nNIK pengarang : " + tampung[i].getNIK()
                    + "\nNama Pengarang : " + tampung[i].getNama()
                    + "\nAlamat pengarang : " + tampung[i].getAlamat()
            );
        }
        JOptionPane.showMessageDialog(null, "Buku terbitan terbaru\n==============================="
                + "\nKode Buku : " + terbaru.getKodeBuku()
                + "\nJudul Buku : " + terbaru.getJudul()
                + "\nTahun Terbit : " + terbaru.getTahunTerbit()
        );
        Pengarang[] data = terbaru.getDaftarPengarang();
        for (int i = 0; i < data.length; i++) {
            JOptionPane.showMessageDialog(null, "Pengarang Ke- " + (i + 1) + "\n==========================="
                    + "\nNIK pengarang : " + data[i].getNIK()
                    + "\nNama Pengarang : " + data[i].getNama()
                    + "\nAlamat pengarang : " + data[i].getAlamat()
            );

        }
    }
}
