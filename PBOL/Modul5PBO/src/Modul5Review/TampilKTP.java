/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5Review;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author rheakles
 */
public class TampilKTP extends JFrame {

    private static final int LABEL_WIDTH = 500;
    private static final int LABEL_HEIGTH = 30;
    private final String nip, nama, jenisKelamin, status, agama, alamat;
    private InputDataKTP data;

//    public static void main(String[] args) {
//        TampilKTP frame = new TampilKTP();
//        frame.setVisible(true);
//    }
    public TampilKTP(String nip, String nama, String jenisKelamin, String status, String agama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
        this.agama = agama;
        this.alamat = alamat;
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        setSize(500, 250);
        setResizable(false);
        setTitle("Tampil");
        newFrameComponent(contentPane);
        setVisible(true);
        setDefaultCloseOperation(TampilKTP.DISPOSE_ON_CLOSE);
    }

    private void newFrameComponent(Container cp) {
        JLabel nipLabel, namaLabel, jenisKelaminLabel, statusLabel, agamaLabel, alamatLabel;
        JLabel nipLabel2, namaLabel2, jenisKelaminLabel2, statusLabel2, agamaLabel2, alamatLabel2;
        nipLabel = new JLabel("NIP");
        namaLabel = new JLabel("Nama");
        jenisKelaminLabel = new JLabel("Jenis Kelamin");
        statusLabel = new JLabel("Status");
        agamaLabel = new JLabel("Agama");
        alamatLabel = new JLabel("Alamat");

        nipLabel2 = new JLabel(nip);
        namaLabel2 = new JLabel(nama);
        jenisKelaminLabel2 = new JLabel(jenisKelamin);
        statusLabel2 = new JLabel(status);
        agamaLabel2 = new JLabel(agama);
        alamatLabel2 = new JLabel(alamat);
        
        nipLabel.setBounds(10, 10, LABEL_WIDTH, LABEL_HEIGTH);
        namaLabel.setBounds(10, 40, LABEL_WIDTH, LABEL_HEIGTH);
        jenisKelaminLabel.setBounds(10, 70, LABEL_WIDTH, LABEL_HEIGTH);
        statusLabel.setBounds(10, 100, LABEL_WIDTH, LABEL_HEIGTH);
        agamaLabel.setBounds(10, 130, LABEL_WIDTH, LABEL_HEIGTH);
        alamatLabel.setBounds(10, 160, LABEL_WIDTH, LABEL_HEIGTH);
        
        nipLabel2.setBounds(150, 10, LABEL_WIDTH, LABEL_HEIGTH);
        namaLabel2.setBounds(150, 40, LABEL_WIDTH, LABEL_HEIGTH);
        jenisKelaminLabel2.setBounds(150, 70, LABEL_WIDTH, LABEL_HEIGTH);
        statusLabel2.setBounds(150, 100, LABEL_WIDTH, LABEL_HEIGTH);
        agamaLabel2.setBounds(150, 130, LABEL_WIDTH, LABEL_HEIGTH);
        alamatLabel2.setBounds(150, 160, LABEL_WIDTH, LABEL_HEIGTH);

        cp.add(nipLabel);
        cp.add(namaLabel);
        cp.add(jenisKelaminLabel);
        cp.add(statusLabel);
        cp.add(agamaLabel);
        cp.add(alamatLabel);
        
        cp.add(nipLabel2);
        cp.add(namaLabel2);
        cp.add(jenisKelaminLabel2);
        cp.add(statusLabel2);
        cp.add(agamaLabel2);
        cp.add(alamatLabel2);
    }
}
