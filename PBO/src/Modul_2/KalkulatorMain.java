package Modul_2;

import java.util.Scanner;

public class KalkulatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan 1 = ");
        double a = sc.nextDouble();
        System.out.print("Bilangan 2 = ");
        double b = sc.nextDouble();
        Kalkulator hasil1 = new Kalkulator(a, b);

        System.out.println("Pengurangan = " + hasil1.getKurang());
        System.out.println("Perkalian = " + hasil1.getKali());
        System.out.println("Pembagian = " + hasil1.getBagi());
        System.out.println("Penjumlahan = " + hasil1.getJumlah());
    }

}
