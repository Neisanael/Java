/*
Andreas Nathanael Priambodo
Program bilangan bulat
 */
package modul4;
import java.util.Scanner;
public class bilanganBulat {
    public static void main(String[] args) {
        int bil1, bil2, bil3;
        
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Masukan bilangan pertama : ");
        bil1 = keyboard.nextInt();
        System.out.print("Masukan bilangan kedua : ");
        bil2 = keyboard.nextInt();
        System.out.print("Masukan bilangan ketiga : ");
        bil3 = keyboard.nextInt();
        
        System.out.println("\nUrutannya adalah : ");
        int d = Math.max(bil1, Math.max(bil2, bil3));
        int e = Math.min(bil1, Math.min(bil2, bil3));
        
        if (e < bil1 && bil1 < d){
            System.out.println(e+", "+bil1+" dan "+d);
        }
        else if (e < bil2 && bil2 < d){
            System.out.println(e+", "+bil2+" dan "+d);
        }
        else if (e < bil3 && bil3 < d){
            System.out.println(e+", "+bil3+" dan "+d);
        }
    }
}
