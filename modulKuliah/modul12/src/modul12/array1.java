/*
Andreas Nathanael Priambodo
Program Array 1
*/
package modul12;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int[] hitung;
        int[] cadangan;
        cadangan = new int[5];
        hitung = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for(int i = 0; i <=4; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            hitung[i] = Keyboard.nextInt();
        }
        //Menampilkan data dari akhir ke awal
        System.out.print("Array Hitung : ");
        for(int i = 0; i <= 4; i++){
            cadangan[i] = hitung[i];
            System.out.print(hitung[i]);
        }
        System.out.println();
        System.out.print("Array Cadangan : ");
        for(int j = 0; j <= 4; j++){
            System.out.print(cadangan[j]);
        }
        System.out.println();
    }
}
