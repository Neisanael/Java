/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicaluserinterface;

import javax.swing.*;

/**
 *
 * @author natha
 */
public class Latihan7Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Konfirmasi");
        frame.setBounds(0, 0, 600, 90);
        JLabel labelPilih = new JLabel("Pilih jenis kelamin anda : ");
        labelPilih.setBounds(20, 10, 150, 30);
        JRadioButton pria = new JRadioButton("Pria");
        pria.setBounds(170, 1, 50, 50);
        JRadioButton wanita = new JRadioButton("Wanita");
        wanita.setBounds(250, 1, 80, 50);
        JButton simpan = new JButton("Simpan");
        simpan.setBounds(350, 15, 100, 25);
        frame.add(labelPilih);
        frame.add(pria);
        frame.add(wanita);
        frame.add(simpan);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
