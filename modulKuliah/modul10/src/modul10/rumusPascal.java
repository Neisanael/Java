/*
Andreas Nathanael Priambodo
Program Pascal satu baris
 */
package modul10;

import java.util.Scanner;
public class rumusPascal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nilai, n;
        System.out.print("Masukan nilai : ");
        nilai = keyboard.nextInt();
        n = nilai + 1;
        for(int i = nilai; i < n; i++){
            for(int j = 0; j <= i; j++){
            System.out.print(faktorial(i)/(faktorial(j)*faktorial(i-j))+" ");
            }
        }
        System.out.println("");
    }
    static long faktorial(int x) {
        long z = 1;
        int i = 1;
        while(i <= x){
            z=z*i;
            i++;
        }
    return z;
    }
}

