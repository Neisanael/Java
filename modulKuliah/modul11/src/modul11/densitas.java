/*
Andreas Nathanael Priambodo
Program densitas
*/
package modul11;
import java.util.Scanner;
public class densitas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Masukan nilai N : ");
        n = sc.nextInt();
        
        for(double z = -4; z <= 4; z = z + 0.5){
            int jumBintang = normal(n,z);
            bintang(jumBintang);
        }
    }
    
    static int normal (int n, double z){
        double f;
        f = (1/(Math.sqrt(2) * 3.14)) * Math.pow(2.71828,(-0.5 * Math.pow(z,2)));
        return (int)Math.round(n*f);
    }
    
    static void bintang(int m) {
        for(int i = 1; i <= m; i++) 
            System.out.print ("*");
        System.out.println();
    }
}
