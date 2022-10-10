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
public class Latihan4Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Searching... ");
        JLabel label = new JLabel("Keyword");
        label.setBounds(20, 10, 50, 20);
        frame.add(label);
        frame.setBounds(0, 0, 500, 100);
        JTextField text = new JTextField();
        text.setBounds(80, 10, 300, 25);
        frame.add(text);
        JButton button = new JButton("Find");
        button.setBounds(390, 8, 60, 30);
        frame.add(button);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
