package jframetugas;

import java.awt.*;
import javax.swing.*;

public class JFrameMenu extends JFrame {

    public static void main(String[] args) {
        JFrameMenu frame = new JFrameMenu();
        frame.setVisible(true);
    }

    public JFrameMenu() {
        Container contentPane;

        setTitle("JFrameMenu");
        setSize(600, 400);
        setResizable(false);
        setLocation(10, 10);

        contentPane = getContentPane();
        contentPane.setBackground(Color.cyan);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem item1 = new JMenuItem("Baru");
        JMenuItem item2 = new JMenuItem("Simpan");

        fileMenu.add(item1);
        fileMenu.add(item2);

        JMenu fileMenu2 = new JMenu("Edit");
        JMenuItem item21 = new JMenuItem("Cut");
        JMenuItem item22 = new JMenuItem("Salin");

        fileMenu2.add(item21);
        fileMenu2.add(item22);

        menuBar.add(fileMenu);
        menuBar.add(fileMenu2);
        this.setJMenuBar(menuBar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
