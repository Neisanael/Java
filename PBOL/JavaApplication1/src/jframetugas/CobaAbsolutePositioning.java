package jframetugas;

import java.awt.*;
import javax.swing.*;

public class CobaAbsolutePositioning extends JFrame {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 300;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private static final int CHECKBOX_WIDTH = 200;
    private static final int CHECKBOX_HEIGHT = 30;
    private JButton cancelButton;
    private JButton okButton;
    private JLabel labelNama, labelJenisKelamin, labelHobi;
    private JRadioButton radioLaki, radioPerempuan;
    private JCheckBox boxOlahraga, boxShopping, boxComputer, boxNonton;
    private JTextField text;
    
    public static void main(String[] args) {
        CobaAbsolutePositioning frame = new CobaAbsolutePositioning();
        frame.setVisible(true);
    }

    public CobaAbsolutePositioning() {
        Container contentPane = getContentPane();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Input Data");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);

        okButton = new JButton("OK");
        okButton.setBounds(150, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(250, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        
        labelNama = new JLabel("Nama :");
        labelNama.setBounds(30,10,80,30);
        contentPane.add(labelNama);
        
        labelJenisKelamin = new JLabel("Jenis Kelamin :");
        labelJenisKelamin.setBounds(30,35,100,30);
        contentPane.add(labelJenisKelamin);
        
        labelHobi = new JLabel("Hobi :");
        labelHobi.setBounds(30,55,80,30);
        contentPane.add(labelHobi);
        
        text = new JTextField();
        text.setBounds(150,17,200,20);
        contentPane.add(text);
        
        radioLaki = new JRadioButton("Laki - Laki");
        radioLaki.setBounds(150,37,100,30);
        contentPane.add(radioLaki);
        
        radioPerempuan = new JRadioButton("Perempuan");
        radioPerempuan.setBounds(250,37,100,30);
        contentPane.add(radioPerempuan);
        
        boxOlahraga = new JCheckBox("Olahraga");
        boxOlahraga.setBounds(150,60,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
        contentPane.add(boxOlahraga);
        
        boxShopping = new JCheckBox("Shopping");
        boxShopping.setBounds(150,85,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
        contentPane.add(boxShopping);
        
        boxComputer = new JCheckBox("Computer");
        boxComputer.setBounds(150,110,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
        contentPane.add(boxComputer);
        
        boxNonton = new JCheckBox("Nonton");
        boxNonton.setBounds(150,135,CHECKBOX_WIDTH,CHECKBOX_HEIGHT);
        contentPane.add(boxNonton);
        
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
