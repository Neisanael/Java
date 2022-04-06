/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO1;
import javax.swing.*;
public class MainMhs {
    public static void main(String[] args) {
        int jumMahas;
        String nama, prodi;
        int nilaiA, nilaiB, nilaiC, nilaiD, nilaiE, nilaiF, nilaiG;
        int nim;

        JOptionPane.showMessageDialog(null, "SELAMAT DATANG DI PROGRAM KRS MAHASISWA UNIVERSITAS SANATA DHARMA!");
        JOptionPane.showMessageDialog(null, "SILAHKAN MASUKKAN DATA - DATA ANDA TERLEBIH DAHULU");
        jumMahas = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Mahasiswa?"));
        Mahasiswa[] mahas1 = new Mahasiswa[jumMahas];

        Dosen dos1 = new Dosen("789732", "Paulina Heruningsih Prima Rosa ");

        //
        for (int i = 0; i < mahas1.length; i++) {
            nama = JOptionPane.showInputDialog("Nama Anda?");
            nim = Integer.parseInt(JOptionPane.showInputDialog("NIM anda? "));
            mahas1[i] = new Mahasiswa(nama, nim);
            prodi = JOptionPane.showInputDialog("Program Studi?");
            mahas1[i].setProdi(prodi);
            nilaiA = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Algoritma dan Pemrograman!"));
            nilaiB = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Bahasa Inggris!"));
            nilaiC = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Matematika Diskret!"));
            nilaiD = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Logika Matematika!"));
            nilaiE = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Sistem Digital!"));
            nilaiF = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah FCH!"));
            nilaiG = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Masa Depan Informatika!"));

            mahas1[i].setNilaiA(nilaiA);
            mahas1[i].setNilaiB(nilaiB);
            mahas1[i].setNilaiC(nilaiC);
            mahas1[i].setNilaiD(nilaiD);
            mahas1[i].setNilaiE(nilaiE);
            mahas1[i].setNilaiF(nilaiF);
            mahas1[i].setNilaiG(nilaiG);

        }

        dos1.setMahas(mahas1);
        Mahasiswa[] dataMahas = dos1.getMahas();

        System.out.println("KARTU RENCANA STUDI UNIVERSITAS SANATA DHARMA");
        
        for (int i = 0; i < mahas1.length; i++) {
            System.out.println(dataMahas[i].getNama());
            System.out.println(dataMahas[i].getNim());
            System.out.println(dataMahas[i].getProdi());
            System.out.println(dos1.getNama());

            System.out.println(mahas1[i].getNilaiA());
            System.out.println(mahas1[i].getNilaiB());
            System.out.println(mahas1[i].getNilaiC());
            System.out.println(mahas1[i].getNilaiD());
            System.out.println(mahas1[i].getNilaiE());
            System.out.println(mahas1[i].getNilaiF());
            System.out.println(mahas1[i].getNilaiG());

        }

    }
}
