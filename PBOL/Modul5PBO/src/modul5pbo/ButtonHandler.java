/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5pbo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rheakles
 */
public class ButtonHandler implements ActionListener{
    public ButtonHandler(){
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton clickedButton = (JButton) ae.getSource();
        
        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame) rootPane.getParent();
        String buttonText = clickedButton.getText();
        
        frame.setTitle("You Clicked "+buttonText);
    }
}
