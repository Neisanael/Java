package modul12;
import java.util.Scanner;
public class bubbleSort7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Banyak element : ");
        int n = sc.nextInt();
        int[] element = new int[n];
        for(int i = 0; i < element.length; i++ ){
            System.out.print("Element - "+(1+i)+" : ");
            element[i] = sc.nextInt();
        }
        for(int j = 0; j < (element.length-1); j++){
            for(int k = 0 ; k < (element.length-j-1); k++){
                if(element[k] > element[k+1]){
                    int change = element[k];
                    element[k] = element[k+1];
                    element[k+1] = change;
                }
            }
        }
        System.out.print("Hasil Pengurutan : ");
        for(int j : element){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
