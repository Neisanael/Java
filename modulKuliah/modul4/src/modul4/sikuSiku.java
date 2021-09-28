/*
Andreas Nathanael Priambodo
Program Sudut Segitiga
 */
package modul4;
import java.util.Scanner;
public class sikuSiku {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        
        int sisi1, sisi2, sisi3;
        double pytha;
        
        System.out.print("Sisi 1 = ");
        sisi1 = keyboard.nextInt();
        System.out.print("Sisi 2 = ");
        sisi2 = keyboard.nextInt();
        System.out.print("Sisi 3 = ");
        sisi3 = keyboard.nextInt();

        int d = Math.max(sisi1, Math.max(sisi2, sisi3));
        int e = Math.min(sisi1, Math.min(sisi2, sisi3));
        
        pytha = Math.sqrt((d*d)-(e*e));
        
        if(pytha == sisi1 || pytha == sisi2 || pytha == sisi3){
            System.out.println("Merupakan siku siku ");
        }
        else {
            System.out.println("Bukan siku siku ");
        }
    }
}
