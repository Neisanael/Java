package modul11;
import java.util.Scanner;
public class pascal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nilai;
        System.out.print("Masukan nilai : ");
        nilai = keyboard.nextInt();
        menghitung(nilai);
    }
    static long menghitung (int n){
        for(int i = 0; i <= n; i++){
            for(int k = n; k > i; k--){
                System.out.printf(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.printf(faktorial(i)/(faktorial(j)*faktorial(i-j))+" ");
                if(i == j){
                    break;
                }
            }
            System.out.println("");
        }
        return n;
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
