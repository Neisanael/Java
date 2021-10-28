/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        double a, b, c, D, x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Koefisien x2 : ");
        a = sc.nextDouble();

        System.out.println("Tidak Ada koefisien");

        System.out.println("Koefisien x1 : ");
        b = sc.nextDouble();

        System.out.println("Konstanta : ");
        c = sc.nextDouble();

        do {
            D = b * b - (4 * a * c);
        

        while (D < 0 || a == 0) {
            System.out.println("Tidak mempunyai akar nyata / real ");
        }
        while (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Akarnya Tunggal Yakni : " + x1);
        }
                          while () {
                                x1=(-b+Math.sqrt(D))/(2*a);
                                x2=(-b-Math.sqrt(D))/(2*a);
                                System.out.println("Akar Pertama : "+x1);
                                System.out.println("Akar Kedua : "+x2);
                                }
    }

}
