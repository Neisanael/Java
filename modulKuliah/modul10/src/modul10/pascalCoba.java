package modul10;
import java.util.Scanner;
public class pascalCoba {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, r;
        System.out.print("Masukan nilai N : ");
        n = keyboard.nextInt();
        System.out.print("Masukan nilai R : ");
        r = keyboard.nextInt();
        for(int i = 0; i <= n; i++){
            for(int k = n; k > i; k--){
                System.out.printf("%-2s"," ");
            }
            for(int j = 0; j <= r; j++){
                System.out.printf("%-4d",faktorial(i)/(faktorial(j)*faktorial(i-j)));
                
                if(i == j){
                    break;
                }
            }
            System.out.println("");
        }
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
