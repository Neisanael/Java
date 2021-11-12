/*
Andreas Nathanael Priambodo
Program Deret Fibonnaci
*/
package modul8;
import java.util.Scanner;
public class deretFibonacci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int fn = 0, fn1 = 1, fn2 = 1, n;
        System.out.print("Masukan berapa banyak data : ");
        n = keyboard.nextInt();
        for (int i = 0; i <= n; i++){
            System.out.print(fn1+", ");
            fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
        }
        System.out.println("");
    }
}
