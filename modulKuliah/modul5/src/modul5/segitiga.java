/*
Andreas Nathanael Priambodo
Program Segitiga
*/
package modul5;
import java.util.Scanner;
public class segitiga {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        boolean a = false;
        System.out.print("SISI 1 = ");
        int sisi1 = keyboard.nextInt();
        System.out.print("SISI 2 = ");
        int sisi2 = keyboard.nextInt();
        System.out.print("SISI 3 = ");
        int sisi3 = keyboard.nextInt();
        
        int d = Math.max(sisi1, Math.max(sisi2, sisi3));
        int e = Math.min(sisi1, Math.min(sisi2, sisi3));
        
        double pytha = Math.sqrt((d*d)-(e*e));
        
        if(pytha == sisi1 || pytha == sisi2 || pytha == sisi3){
            System.out.println("Merupakan Siku Siku");
        }else if (sisi1 == sisi2 && sisi2 == sisi3){
            System.out.println("Merupakan Sama Sisi");
        }else if (sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3){
            System.out.println("Merupakan Sama Kaki");
        }else{
            System.out.println("Merupakan Sembarang");
        }
        
    }
}
