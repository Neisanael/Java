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
public class Latihan8Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setBounds(0,0,800,90);
        JLabel apa = new JLabel("Apa spesialis kemampuan anda :");
        apa.setBounds(10, 10, 200, 30);
        JCheckBox programming = new JCheckBox("Programming");
        programming.setBounds(220, 10, 120, 30);
        JCheckBox networking = new JCheckBox("Networking");
        networking.setBounds(350, 10, 120, 30);
        JCheckBox database = new JCheckBox("Database");
        database.setBounds(470, 10, 100, 30);
        JButton simpan = new JButton("Simpan");
        simpan.setBounds(570, 13, 90, 25);
        frame.add(apa);
        frame.add(programming);
        frame.add(networking);
        frame.add(database);
        frame.add(simpan);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
