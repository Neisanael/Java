/*
Andreas Nathanael Priambodo
Program hasil nilai
*/
package modul8;
import java.util.Scanner;
public class nilai {
    public static void main(String[] args) {
        int n;
        double data, sum = 0, pertama, kedua, akar = 0, ketiga, bagi = 0; 
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Banyak data yang dimasukan : ");
        n = keyboard.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print("Data ke "+i+" : ");
            data = keyboard.nextDouble();
            pertama = Math.pow(data,2);
            kedua = Math.sqrt(data);
            ketiga = 1/data;
           
            sum = sum + pertama;
            akar = akar + data;
            bagi = bagi + ketiga;
        }
        System.out.println(sum);
        System.out.println(akar);
        System.out.println(bagi);
    }
}
