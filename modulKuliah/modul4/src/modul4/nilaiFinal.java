/* 
Andreas Nathanael 
Priambodo Program Nilai UTS
*/
package modul4;
import java.util.Scanner;
public class nilaiFinal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double uts1, uts2, uas, total_nilai; 
        
        System.out.print("Masukan nilai uts 1 = ");
        uts1 = keyboard.nextDouble();
        System.out.print("Masukan nilai uts 2 = ");
        uts2 = keyboard.nextDouble();
        System.out.print("Masukan Nilai uas = ");
        uas = keyboard.nextDouble();
        
        total_nilai = (30/100d*uts1)+(30/100d*uts2)+(40/100d*uas);
        System.out.println("\nTotal nilai final adalah = " +total_nilai);
        System.out.print("Nilai dalam huruf = ");
        if (total_nilai >= 80 ){
            System.out.println("A");
        }
        else if (total_nilai >= 65 && total_nilai < 80){
            System.out.println("B");
        }
        else if (total_nilai >= 55 && total_nilai < 65){
            System.out.println("C");
        }
        else if (total_nilai >= 50 && total_nilai < 55){
            System.out.println("D");
        }
        else if (total_nilai < 50 ){
            System.out.println("E");
        }
        
    }
}
