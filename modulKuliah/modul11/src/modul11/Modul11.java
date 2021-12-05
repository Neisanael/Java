/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul11;

import java.util.Scanner;
public class Modul11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai N: ");
            n = sc.nextInt();

        } while (n < 30 || n > 100);

        for (double z = -4; z <= 4; z = z + 0.5) {
            int jumBintang = normal(n, z);
            bintang(jumBintang);
        }
    }

    static int normal(int n, double z) {

        double e = 2.71828;
        double nilaipangkat = -0.5 * Math.pow(z, 2);
        double f = (1.0 / Math.sqrt(2 * 3.14)) * (Math.pow(e, nilaipangkat));
        return (int) Math.round(n * f);
    }

    static void bintang(int m) {
        for (int i = 1; i <= m; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
    
}
