/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Latihan5 extends JFrame implements ActionListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton buttonHasil;
    private JTextField pesanHasil, pesanInput1, pesanInput2;
    private JLabel labelHasil, labelInput1, labelInput2;
    
    public static void main(String[] args) {
        Latihan5 frame = new Latihan5();
        frame.setVisible(true);
    }

    public Latihan5() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(4,1));
        
        JPanel panelInput1, panelInput2, panelHasil, panelButtonHasil;
        
        panelInput1 = new JPanel();
        panelInput2 = new JPanel();
        panelHasil = new JPanel();
        panelButtonHasil = new JPanel();
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch7JButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        labelHasil = new JLabel("Hasil");
        labelHasil.setBorder(new EmptyBorder(0, 10, 0, 103));
        pesanHasil = new JTextField();
        pesanHasil.setColumns(10);
        buttonHasil = new JButton("Hasil");
        labelInput1 = new JLabel("Bilangan 1");
        labelInput1.setBorder(new EmptyBorder(0, 10, 0, 65));
        pesanInput1 = new JTextField();
        pesanInput1.setColumns(10);
        labelInput2 = new JLabel("Bilangan 2");
        labelInput2.setBorder(new EmptyBorder(0, 10, 0, 65));
        pesanInput2 = new JTextField();
        pesanInput2.setColumns(10);
        
        buttonHasil.addActionListener(this);
        
        panelHasil.add(labelHasil);
        panelHasil.add(pesanHasil);
        panelInput1.add(labelInput1);
        panelInput1.add(pesanInput1);
        panelInput2.add(labelInput2);
        panelInput2.add(pesanInput2);
        panelButtonHasil.add(buttonHasil);
        add(panelInput1);
        add(panelInput2);
        add(panelHasil);
        add(panelButtonHasil);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        pesanHasil.setText(String.valueOf(Integer.parseInt(pesanInput1.getText()) + Integer.parseInt(pesanInput2.getText())));
    }
    
}


