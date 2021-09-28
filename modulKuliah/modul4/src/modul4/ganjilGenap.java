/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;
import java.util.Scanner;
public class ganjilGenap {
    public static void main(String[] args) {
        int data; 
               
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Masukan Bilangan =");
        data = keyboard.nextInt();
        
        if (data % 2 == 0) {
        System.out.print("Bilangan " + data + " adalah genap.\n");
        } else {
        System.out.print("Bilangan " + data + " adalah ganjil.\n");
        }   
    }
}
