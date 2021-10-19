/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;
import java.util.Scanner;
public class rataRata {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total, i =1;
        float jum = 0, rata, data;
        
        System.out.print("Masukan data yang akan di proses = ");
        total = keyboard.nextInt();
        while (i<=total){
            System.out.print("data ke "+i+" = ");
            data = keyboard.nextFloat();
            jum += data;
            i++;       
        }
        rata = jum/total;
        System.out.println("Rata - rata data adalah = "+rata);
    }
}
