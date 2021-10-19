/*
Andreas Nathanael Priambodo
Program akar
 */
package modul5;
import java.util.Scanner;
public class akarkuadrat {
    public static void main(String[] args) {
      double a, b , c, D, x1, x2;
      Scanner keyboard = new Scanner (System.in);
      
        System.out.print("Koefisien x2 (a) : ");
        a = keyboard.nextDouble();
        System.out.print("Koefisien x (b) : ");
        b = keyboard.nextDouble();
        System.out.print("Konstanta : ");
        c = keyboard.nextDouble();
        
        D = b * b - ( 4*c*c);
            if (D < 0 || a == 0){
                System.out.println("Tidak mempunyai akar myata/real");
            }
            
            else if (D == 0 ){
                x1 = -b/ (2*a);
                System.out.println("Akarnya tunggal yyakni : "+x1);
            }
            
            else {
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b + Math.sqrt(D))/(2*a);
                System.out.println("Akar Pertama : "+x1);
                System.out.println("Akar Kedua : "+x2);
            }
    }
}
