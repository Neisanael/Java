/*
Andreas Nathanael Priambodo
Program Array 3
*/
package modul12;
import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        double[] hitung;
        double jumlah = 0, max = 0, min;
        int n;
        Scanner Keyboard = new Scanner(System.in);
        System.out.print
        ("Masukan berapa banyak data : ");
        n = Keyboard.nextInt();
        hitung = new double[n];
        //Membaca 5 data bulat
        for(int i = 0; i < n; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            hitung[i] = Keyboard.nextInt();
        }
        //Menampilkan data dari akhir ke awal
        min = (int) hitung[0];
        System.out.print("Isi Array : ");
        for(double a : hitung){
            System.out.print(a+", ");
            jumlah = (int) (jumlah + a);
            max = (int) Math.max(max, a);
            min = Math.min(min, a);
        }
        System.out.println();
        System.out.println("Jumlah element array : "+hitung.length);
        double rata = jumlah/2d;
        System.out.println("Rata - rata : "+rata);
        System.out.println("Nilai Maksimum : "+max);
        System.out.println("Nilai Minimum : "+min);
    }
}
