/*
Andreas Nathanael Priambodo
Program nilaiUts syarat tidak boleh inputan kurang dari 0 (minus)
*/
package modul7;
import java.util.Scanner;
public class nilaiUts {
    public static void main(String[] args) {
        int uts1, uts2, uas, nilaiTotal;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("UTS 1 : ");
            uts1 = sc.nextInt();
            System.out.print("UTS 2 : ");
            uts2 = sc.nextInt();
            System.out.print("UAS   : ");
            uas = sc.nextInt();
            nilaiTotal =(int) (30/100f * uts1 + 30/100f * uts2 + 40/100f * uas) ;
            if(uts1 < 0 || uts2 < 0 || uas < 0) {
                System.out.println("\nTidak boleh mengisi data minus\n");
            }
             }while(uts1 < 0 || uts2 < 0 || uas < 0);
        if(nilaiTotal >= 80){
            System.out.println("\nnilai A dengan angka : " +nilaiTotal);
        }else if(nilaiTotal >= 65 && nilaiTotal < 80){
            System.out.println("\nnilai B dengan angka :  " +nilaiTotal);
        }else if(nilaiTotal >= 55 && nilaiTotal < 65){
            System.out.println("\nnilai C dengan angka :  " +nilaiTotal);
        }else if(nilaiTotal >= 50 && nilaiTotal < 55){
            System.out.println("\nnilai D dengan angka :  " +nilaiTotal);
        }else if(nilaiTotal < 50){
            System.out.println("\nnilai E dengan angka :  " +nilaiTotal);
        }
    }
}
