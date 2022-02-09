/*
Andreas Nathanael Priambodo
Program Mencari Index Array
*/
package modul12;
import java.util.Scanner;
public class isiArray4 {
    public static void main(String[] args) {
        int[] A = {2, 7, 3, 9, 4, 1, 34, 25, 76, 80, 90, 54, 21, 78};
        int nilai;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai yang dicari : ");
        nilai = sc.nextInt();
        System.out.print("Berada di index : ");
        if(cariIndex(A ,nilai) == -1){
            System.out.println("Tidak ada");
        }else{
            System.out.println(cariIndex(A ,nilai));
        }
    } 
    public static int cariIndex(int array[], int n){
        if(array == null){
            return -1;
        }
        int panjangArray = array.length;
        int i = 0;
        
        while(i < panjangArray){
            if(array[i] == n){
                return i;
            }else{
                i += 1;
            }
        }
    return -1;
    }
}
