/*
Andreas Nathanael Priambodo
Program menghitung resistor
*/
package modul8;
import java.util.Scanner;
public class resistor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int pilih;
        float respar = 0, res = 0, rt = 0;
        do{
            System.out.println("1. Seri\n2. Paralel");
            System.out.print("Masukan Pralel Atau Seri : ");
            pilih = keyboard.nextInt();
        }while(pilih != 1 && pilih != 2);
            System.out.print("\nMasukan berapa resistor : ");
            int tresistor = keyboard.nextInt();
            for (int i = 1; i <= tresistor; i++){
                System.out.print("resistor "+i+" : ");
                res = keyboard.nextInt();
                    rt += res;
                    respar = respar + 1/res;
            }
            switch(pilih){
                case 1 :
                    int a = (int)rt;
                    System.out.println("Jika tahanan disusun seri maka rt = "+a);
                    break;
                case 2 :
                    rt = 1/respar;
                    System.out.println("Jika tahanan disusun paralel maka 1/rt = "+rt);
                    break;
            }
    }
}
