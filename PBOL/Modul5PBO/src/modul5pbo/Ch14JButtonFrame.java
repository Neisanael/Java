/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5pbo;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author rheakles
 */
public class Ch14JButtonFrame extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton button;
    
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

        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
}
