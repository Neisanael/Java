/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;
import java.util.Scanner;
public class tuaMana {
    public static void main(String[] args) {
        String nama1, nama2;
        long umur1, umur2;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan Nama = ");
        nama1 = keyboard.next();
        System.out.print("Masukan Umur = ");
        umur1 = keyboard.nextInt();
        System.out.print("\nMasukan Nama = ");
        nama2 = keyboard.next();
        System.out.print("Masukan Umur = ");
        umur2 = keyboard.nextInt();
        
        if (umur1 > umur2){
            System.out.print(nama1+" lebih tua dari "+nama2);
        }
        else {
            System.out.println(nama2+" lebih tua dari "+nama1);
        }
    }
}
