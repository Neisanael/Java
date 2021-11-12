/*
Andreas Nathanael Priambodo
Program menghitung nilai akar
*/
package modul7;
import java.util.Scanner;
public class nilaiAkar {
    public static void main(String[] args) {
        double a, b, c, D, x1, x2;
        Scanner dataKuadrat = new Scanner(System.in);

        do{
        System.out.print("Koefisien x2 (a) : ");
        a = dataKuadrat.nextDouble();
        if (a == 0){
            System.out.println("\nData (a) tidak boleh 0 !!\n");
        }
        }while(a==0);
        System.out.print("Koefisien x (b) : ");
        b = dataKuadrat.nextDouble();
        System.out.print("Konstanta (c) : ");
        c = dataKuadrat.nextDouble();
        D = b * b - (4*a*c);
        if (D <0 || a == 0) {// tidak punya akar real
            System.out.println("Tidak mempunyai akar nyata/real");
        }else if (D == 0 ) {// akarnya sama
            x1 = -b/(2*a);
            System.out.println("Akarnya tunggal yakni : "+x1);
        }else {// akarnya dua berbeda
            x1 = (-b + Math.sqrt(D))/ (2*a);
            x2 = (-b - Math.sqrt(D))/ (2*a);
            System.out.println("Nilai x1 adalah : "+x1+ "\nNilai x2 adalah :"+x2);
        }
    }
}
