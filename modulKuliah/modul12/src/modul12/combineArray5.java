/*
Andreas Nathanael Priambodo 
Program Menggabungkan array 
*/
package modul12;
import java.util.Arrays;
public class combineArray5 {
    public static void main(String[] args) {
        int[] usia1 = { 18, 39, 45, 50, 65, 70, 90 };
        int[] usia2 = { 20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96 };
        int[] usiaGabung = new int [usia1.length+usia2.length];
        int n = 0;
        for(int i : usia1){
            usiaGabung[n] = i;
            n++;
        }
        for(int j : usia2){
            usiaGabung[n] = j;
            n++;
        }
        Arrays.sort(usiaGabung);
        for(int array : usiaGabung){
            System.out.print(array+", ");
        }
        System.out.println();
    }
}
