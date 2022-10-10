/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rheakles
 */
public class Latihan3 extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton button;

    public static void main(String[] args) {
        Latihan3 frame = new Latihan3();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton clickedButton = (JButton) ae.getSource();

        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame) rootPane.getParent();
        String buttonText = clickedButton.getText();

        frame.setTitle("(Dibuat dengan cara -3) You clicked " + buttonText);
    }
}
