/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5Review;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author rheakles
 */
public class statusAbsensi extends JFrame{
    private final String nim, nama, mataKuliah, jumlahPertemuan, jumlahKehadiran, presentaseKehadiran, status;
    private static final int TEXT_WIDTH = 600;
    private static final int TEXT_HEIGHT = 30;

//    public static void main(String[] args) {
//        statusAbsensi frame = new statusAbsensi("a", "a","a", "a","a", "a","a");
//        frame.setVisible(true);
//    }
    public statusAbsensi(String nim, String nama, String mataKuliah, String jumlahPertemuan, String jumlahKehadiran, String presentaseKehadiran, String status) {
        this.nim = nim;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
        this.jumlahPertemuan = jumlahPertemuan;
        this.jumlahKehadiran = jumlahKehadiran;
        this.presentaseKehadiran = presentaseKehadiran;
        this.status = status;
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        setSize(500, 280);
        setResizable(false);
        setTitle("Status Absensi");
        newFrameComponent(contentPane);
        setVisible(true);
        setDefaultCloseOperation(TampilKTP.DISPOSE_ON_CLOSE);
    }
    
    private void newFrameComponent(Container p){
        JLabel labelNim, labelNama, labelMataKuliah, labelJumlahPertemuan, labelJumlahKehadiran, labelPresentaseKehadiran, labelStatus;
        JLabel labelNimHasil, labelNamaHasil, labelMataKuliahHasil, labelJumlahPertemuanHasil, labelJumlahKehadiranHasil, labelPresentaseKehadiranHasil, labelStatusHasil;
        labelNim = new JLabel("NIM");
        labelNama = new JLabel("Nama");
        labelMataKuliah = new JLabel("Mata Kuliah");
        labelJumlahPertemuan = new JLabel("Jumlah Pertemuan");
        labelJumlahKehadiran = new JLabel("Jumlah Kehadiran");
        labelPresentaseKehadiran = new JLabel("Presentase Kehadiran (%)");
        labelStatus = new JLabel("Status ");
        
        labelNimHasil = new JLabel(nim);
        labelNamaHasil = new JLabel(nama);
        labelMataKuliahHasil = new JLabel(mataKuliah);
        labelJumlahPertemuanHasil = new JLabel(jumlahPertemuan);
        labelJumlahKehadiranHasil = new JLabel(jumlahKehadiran);
        labelPresentaseKehadiranHasil = new JLabel(presentaseKehadiran);
        labelStatusHasil = new JLabel(status);
        
        labelNim.setBounds(20, 10, TEXT_WIDTH, TEXT_HEIGHT);
        labelNama.setBounds(20, 40, TEXT_WIDTH, TEXT_HEIGHT);
        labelMataKuliah.setBounds(20, 70,  TEXT_WIDTH, TEXT_HEIGHT);
        labelJumlahPertemuan.setBounds(20, 100,  TEXT_WIDTH, TEXT_HEIGHT);
        labelJumlahKehadiran.setBounds(20, 130,  TEXT_WIDTH, TEXT_HEIGHT);
        labelPresentaseKehadiran.setBounds(20, 160,  TEXT_WIDTH, TEXT_HEIGHT);
        labelStatus.setBounds(20, 190,  TEXT_WIDTH, TEXT_HEIGHT);
        
        labelNimHasil.setBounds(250, 10, TEXT_WIDTH, TEXT_HEIGHT);
        labelNamaHasil.setBounds(250, 40, TEXT_WIDTH, TEXT_HEIGHT);
        labelMataKuliahHasil.setBounds(250, 70,  TEXT_WIDTH, TEXT_HEIGHT);
        labelJumlahPertemuanHasil.setBounds(250, 100,  TEXT_WIDTH, TEXT_HEIGHT);
        labelJumlahKehadiranHasil.setBounds(250, 130,  TEXT_WIDTH, TEXT_HEIGHT);
        labelPresentaseKehadiranHasil.setBounds(250, 160,  TEXT_WIDTH, TEXT_HEIGHT);
        labelStatusHasil.setBounds(250, 190,  TEXT_WIDTH, TEXT_HEIGHT);
        
        p.add(labelNim);
        p.add(labelNama);
        p.add(labelMataKuliah);
        p.add(labelJumlahPertemuan);
        p.add(labelJumlahKehadiran);
        p.add(labelPresentaseKehadiran);
        p.add(labelStatus);
        
        p.add(labelNimHasil);
        p.add(labelNamaHasil);
        p.add(labelMataKuliahHasil);
        p.add(labelJumlahPertemuanHasil);
        p.add(labelJumlahKehadiranHasil);
        p.add(labelPresentaseKehadiranHasil);
        p.add(labelStatusHasil);
    }
}
