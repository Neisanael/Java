/*
Andreas Nathanael Priambodo
Program kombinasi 
*/
package modul10;
import java.util.Scanner;
public class kombinasi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, r;
        do{
        System.out.print("Masukan data n : ");
        n = keyboard.nextInt();
        System.out.print("Masukan data r : ");
        r = keyboard.nextInt();
        }while(r>n);
        System.out.println("hasilnya "+faktorial(n)/(faktorial(r)*faktorial(n-r)));
    }
    static long faktorial(int x){
        int hasFak=1;
        if (x == 0){
            return 1;
        }
        else{
            for(int i =1; i<=x; i++){
            hasFak = hasFak*i;
            }
        }
    return hasFak;

    }
}
