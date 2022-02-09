package subprogram;
import java.util.*;
public class SubProgram {
    static double us1, us2, uas;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        char input = 0;
        do{
        bacaData();
            System.out.println();
            System.out.println("Total nilai = "+totalNilai());
            System.out.println("Nilai huruf = "+nilaiHuruf(totalNilai()));
            System.out.println();
            System.out.print("Apakah anda akan memasukan data mahasiswa lain ? (Y/T) : ");
            input = keyboard.next().charAt(0);
            input = Character.toLowerCase(input);
                while(input != 'y'&& input != 't'){
                    System.out.print("Salah, Masukan input yang benar!!:");
                    input = keyboard.next().charAt(0);
                    input = Character.toLowerCase(input);
                }
        }while(input != 't');
    }
    static void bacaData(){
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Masukan NIM : ");
        long nim = keyboard.nextLong();
        System.out.print("Masukan Nama : ");
        String nama = keyboard.next();
        System.out.print("Masukan nilai US 1 : ");
        us1 = keyboard.nextDouble();
        System.out.print("Masukan nilai US 2 : ");
        us2 = keyboard.nextDouble();
        System.out.print("Masukan nilai UAS : ");
        uas = keyboard.nextDouble();
    }
    static double totalNilai(){
        double nilaiTotal = (us1*30/100)+(us2*30/100)+(uas*40/100);
        return nilaiTotal;
    }
    static char nilaiHuruf(double n){
        char nilai = 0;
        if(n >= 80){
            nilai = 'A';
        }if(n >= 65 && n < 80){
            nilai = 'B';
        }if(n >= 55 && n < 65){
            nilai = 'C';
        }if(n >= 45 && n < 55){
            nilai = 'D';
        }if(n < 45){
            nilai = 'E';
        }
        return nilai;
    }
}
