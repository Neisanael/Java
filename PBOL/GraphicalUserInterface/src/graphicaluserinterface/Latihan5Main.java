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
public class Latihan5Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Searching");
        frame.setBounds(0, 0, 500, 100);
        JLabel label = new JLabel("Search By: ");
        label.setBounds(10, 10, 80, 15);
        frame.add(label);
        String[] nama = new String[]{"Nama"};
        JComboBox<String> comboBox = new JComboBox<>(nama);
        comboBox.setBounds(80, 9, 80, 20);
        frame.add(comboBox);
        JTextField text = new JTextField();
        text.setBounds(170, 9, 230, 23);
        frame.add(text);
        JButton button = new JButton("Cari");
        button.setBounds(410, 8, 60, 23);
        frame.add(button);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
