 /*
Andreas Nathanael Priambodo
Program Kaos
 */
package modul5;
import java.util.Scanner;
enum UkuranBaju {
    S, M, L, XL, XXL;
}
public class kaos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        
        int jmlh, total = 0;
        
        System.out.print("Jumlah barang = ");
        jmlh = keyboard.nextInt();
        System.out.print("Size yang digunakan = ");
        String size = keyboard.next();
        
        UkuranBaju ukuran = UkuranBaju.valueOf(size.toUpperCase());
        switch (ukuran){
            case S:
                total = jmlh * 30000;
                break;
            case M:
                total = jmlh * 38000;
                break;
            case L:
                total = jmlh * 45000;
                break;
            case XL:
                total = jmlh * 50000;
                break;
            case XXL:
                total = jmlh * 60000;
                break;                  
        }
        System.out.println("Harga total "+ukuran+" = "+total);
    }
}
