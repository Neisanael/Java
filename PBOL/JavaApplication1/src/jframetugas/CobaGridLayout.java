/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframetugas;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author natha
 */
public class CobaGridLayout extends JFrame {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 300;

    public static void main(String[] args) {
        CobaGridLayout frame = new CobaGridLayout();
        frame.setVisible(true);
    }

    public CobaGridLayout() {
        Container contentPane;
        JButton button1, button2, button3, button4, button5;

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Ch14GridLayoutSample");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new GridLayout(2, 3));

        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");

        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
