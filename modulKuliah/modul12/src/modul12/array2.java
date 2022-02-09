/*
Andreas Nathanael Priambodo
Program Array 2
*/
package modul12;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        int[] hitung;
        int jumlah = 0, max = 0, min;
        hitung = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for(int i = 0; i <=4; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            hitung[i] = Keyboard.nextInt();
        }
        //Menampilkan data dari akhir ke awal
        min = hitung[0];
        System.out.print("Isi Array : ");
        for(int n : hitung){
            System.out.print(n+", ");
            jumlah = jumlah + n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println();
        System.out.println("Jumlah element array : "+hitung.length);
        double rata = jumlah/2d;
        System.out.println("Rata - rata : "+rata);
        System.out.println("Nilai Maksimum : "+max);
        System.out.println("Nilai Minimum : "+min);
    }
}
