/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul10;

import javax.swing.JOptionPane;

/**
 *
 * @author Neisan
 */
public class a {
    public static void main(String[] args) {
        int t,y,x;
        String tinggi = "";
        tinggi = JOptionPane.showInputDialog("Masukkan panjang alas segitiga : ");
        t = Integer.parseInt(tinggi);
        for(x=1;x<=t;x++){
            for(y=1;y<=x;y++){
                if((y+x)<=(t+1))
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
}
