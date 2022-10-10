/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ch14JButtonFrame extends JFrame implements ActionListener{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton button, button2;
    private JTextField pesan;
    
    public static void main(String[] args) {
        Ch14JButtonFrame frame = new Ch14JButtonFrame();
        frame.setVisible(true);
    }

    public Ch14JButtonFrame() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch7JButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        button = new JButton("Click Me");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button);

        button2 = new JButton("Tombol2");
        button2.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button2);
        
        pesan = new JTextField();
        pesan.setColumns(20);
        contentPane.add(pesan);
        
        button.addActionListener(this);
        button2.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton clickedButton = (JButton) ae.getSource();
        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame) rootPane.getParent();
        String buttonText = clickedButton.getText();
        
        if(buttonText.equalsIgnoreCase("Click Me")){
            String isiPesan = pesan.getText();
            frame.setTitle(isiPesan);
        }else{
            frame.setTitle("You clicked" +buttonText);
        }
        
    }
    
}


