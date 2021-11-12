/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

import java.util.Scanner;

/**
 *
 * @author Neisan
 */
public class matriksIdentitas {
    public static void main(String[] args) {
        int baris, kolom, n;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan N : ");
        n = keyboard.nextInt();
        System.out.println("\n");
        
        for(baris = 0;baris < n ;baris++ ){
            for(kolom = 0;kolom < n ;kolom++){
                if(baris == kolom){
                    System.out.print("1   ");
                }else{
                    System.out.print("0   ");
                }
            }
            System.out.print("\n");
        }
    }
}
