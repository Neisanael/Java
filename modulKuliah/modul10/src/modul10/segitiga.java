/*
Andreas Nathanael Priambodo 
Program mencari segitiga dengan koordinat
*/
package modul10;
import java.util.*;
public class segitiga {
    static double a, b, c, x1, x2, x3, y1, y2, y3;

    public static void main(String[] args) {
        bacaData();
        a = hitungJarak(x2, x1, y2, y1);
        b = hitungJarak(x3, x1, y3, y1);
        c = hitungJarak(x2, x3, y2, y3);
        System.out.println(a+" "+b+" "+c);
        System.out.println("Keliling segitiga = "+hitungKeliling());
        System.out.println("Luas segitiga = "+hitungLuas());
    }
    static void bacaData(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("A(x1, y1)");
        System.out.print("x1 : ");
        x1 = keyboard.nextDouble();
        System.out.print("y1 : ");
        y1 = keyboard.nextDouble();
        
        System.out.println("B(x2, y2)");
        System.out.print("x2 : ");
        x2 = keyboard.nextDouble();
        System.out.print("y2 : ");
        y2 = keyboard.nextDouble();
        
        System.out.println("B(x3, y3)");
        System.out.print("x3 : ");
        x3 = keyboard.nextDouble();
        System.out.print("y3 : ");
        y3 = keyboard.nextDouble();
    }
    static double hitungJarak(double a1, double a2, double b1, double b2){
        double hasil = Math.sqrt((Math.pow((a1 - a2), 2))+(Math.pow((b1 - b2), 2)));
        return hasil;
    }
    static double hitungKeliling(){
        double keliling = a + b + c;
        return keliling;
    }
    static double hitungLuas(){
        double s = (a+b+c)*1/2d;
        double luas = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return luas;
    }
}
