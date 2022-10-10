/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphicaluserinterface;

import javax.swing.*;

public class GraphicalUserInterface {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ini Frame Pertamaku");

        int tinggi = 400;
        int lebar = 400;
        frame.setBounds(400, 400, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemOpen = new JMenuItem("Open");
        menuFile.add(menuItemOpen);
        menuBar.add(menuFile);
        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        JButton btnSave = new JButton("Save");
        panel.add(btnSave);
    }
}