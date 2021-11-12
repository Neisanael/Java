/*
Andreas Nathanael Priambodo
Program nilai persamaan
*/
package modul8;
import java.util.Scanner;
public class nilaiPersamaan {
    public static void main(String[] args) {
        double D, x1, x2, y;
        int a, b, c;
        Scanner dataKuadrat = new Scanner(System.in);

        do{
        System.out.print("Koefisien x2 (a) : ");
        a = dataKuadrat.nextInt();
        if (a == 0){
            System.out.println("\nData (a) tidak boleh 0 !!\n");
        }
        }while(a==0);
        System.out.print("Koefisien x (b) : ");
        b = dataKuadrat.nextInt();
        System.out.print("Konstanta (c) : ");
        c = dataKuadrat.nextInt();
        System.out.println("\nDari persamaan y = "+a+"x2 + "+b+"x + "+c);
        D = b * b - (4*a*c);
        if (D <0 || a == 0) {// tidak punya akar real
            System.out.println("Tidak mempunyai akar nyata/real");
        }else if (D == 0 ) {// akarnya sama
            x1 = -b/(2*a);
            System.out.println("Akarnya tunggal yakni : "+x1);
        }else {// akarnya dua berbeda
            x1 = (-b + Math.sqrt(D))/ (2*a);
            x2 = (-b - Math.sqrt(D))/ (2*a);
            double n = Math.min(x1, x2);
            double m = Math.max(x1, x2);
            System.out.println("Akar akarnya adalah "+x1+" dan "+x2);
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah");
            System.out.println("----------------------------------------------");
            System.out.println("\t  x\t\ty = "+a+"x2 + "+b+"x +"+c);
            System.out.println("----------------------------------------------");
            for (int i = 1; n <= m; i++){
                y = a*(Math.pow(n, 2)) + (b*n) + c;
                System.out.println("\t"+n+"\t\t\t"+y);
                n = n + 0.25;
            }
        }
    }
}