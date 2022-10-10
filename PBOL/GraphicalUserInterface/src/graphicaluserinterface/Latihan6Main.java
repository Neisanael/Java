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
public class Latihan6Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setBounds(0, 0, 600, 90);
        JLabel labelUsername = new JLabel("Username");
        labelUsername.setBounds(10, 10, 80, 30);
        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(250, 10, 80, 30);
        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(90, 13, 150, 27);
        JPasswordField txtPwd = new JPasswordField();
        txtPwd.setBounds(330, 13, 150, 27);
        JButton clear = new JButton("Login");
        clear.setBounds(500, 13, 70, 27);
        frame.add(labelUsername);
        frame.add(labelPassword);
        frame.add(txtUsername);
        frame.add(txtPwd);
        frame.add(clear);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
