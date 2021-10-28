/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int proses, i =1, mangga = 0, kecil = 0, sedang = 0, besar = 0;
        System.out.print("Banyak mangga yang di proses : ");
        proses = keyboard.nextInt();
        while(i <= proses){
            do{
            System.out.print("Berat mangga "+i+" : ");
            mangga = keyboard.nextInt();
            }
            while(mangga < 0);
            i++;
            if(mangga < 500 ){
                kecil += 1; 
            }if(mangga >= 500 && mangga < 750){
                sedang += 1;
            }if(mangga >= 750){
                besar += 1;
            }
        }
        i--;
        System.out.println("\nDari "+i+" yang ditimbang : ");
        System.out.println("Biasa : "+kecil+" buah");
        System.out.println("Bagus : "+sedang+" buah");
        System.out.println("Unggul : "+besar+" buah");
        
    }
}
