/*
Andreas Nathanael Priambodo
Program penilaian UAS UTS 
*/
package modul12;
import java.util.Scanner;
public class finalNilai8 {
    static  String[] nim = new String[10];
    static  String[] nama = new String[10];
    static  double[] us1 = new double[10];
    static  double[] us2 = new double[10];
    static  double[] uas = new double[10];
    static  double[] totalNil = new double [10];
    static  char[] finalNil = new char [10];
            
    public static void main(String[] args) {
        int set;
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.print("Masukan Nim : ");
            nim[i] = keyboard.next();
            System.out.print("Masukan Nama : ");
            nama[i] = keyboard.next();
            System.out.print("Masukan Nilai US1 : ");
            us1[i] = keyboard.nextDouble();
            System.out.print("Masukan Nilai US2 : ");
            us2[i] = keyboard.nextDouble();
            System.out.print("Masukan Nilai UAS : ");
            uas[i] = keyboard.nextDouble();
        }
        for(int n = 0; n < 10; n++){
            totalNil[n] = (us1[n]*30/100) + (us2[n]*30/100) + (uas[n]*40/100);
            if(totalNil[n] >= 80){
                finalNil[n] = 'A';
            }if(totalNil[n] >= 65 && totalNil[n] < 80){
                finalNil[n] = 'B';
            }if(totalNil[n] >= 55 && totalNil[n] < 65){
                finalNil[n] = 'C';
            }if(totalNil[n] >= 45 && totalNil[n] < 55){
                finalNil[n] = 'D';
            }if(totalNil[n] < 45){
                finalNil[n] = 'E';
            }
        }
        System.out.println("\n");
        beforeSort();
        bubbleSort();
        System.out.println("\n");
        System.out.println("No.  NIM\t   Nama\t\tUS1\tUS2\tUAS\tTotal\tFinal");
        System.out.println("_____________________________________________________________________");
        for(int j = 0; j < 10; j++){
            if(j == 9){
                set = 3;
            }else{
                set = 4;
            }
            System.out.printf("%d%-"+set+"s%-14s%-13s%-8.1f%-8.1f%-8.1f%-8.1f%5s\n",(j+1),".",nim[j],nama[j],us1[j],us2[j],uas[j],totalNil[j],finalNil[j]);
        }
        System.out.println("======================================================================");
    }
    
    static void beforeSort(){
        int set;
        System.out.println("No.  NIM\t   Nama\t\tUS1\tUS2\tUAS\tTotal\tFinal");
        System.out.println("_____________________________________________________________________");
        for(int j = 0; j < 10; j++){
            if(j == 9){
                set = 3;
            }else{
                set = 4;
            }
            System.out.printf("%d%-"+set+"s%-14s%-13s%-8.1f%-8.1f%-8.1f%-8.1f%5s\n",(j+1),".",nim[j],nama[j],us1[j],us2[j],uas[j],totalNil[j],finalNil[j]);
        }
        System.out.println("======================================================================");
    }
    
    static void bubbleSort(){
        for(int j = 0; j < (totalNil.length-1); j++){
            for(int k = 0 ; k < (totalNil.length-j-1); k++){
                if(totalNil[k] < totalNil[k+1]){
                    double change = totalNil[k];
                    String namaa = nama[k];
                    String nimm = nim[k];
                    double uts1 = us1[k];
                    double uts2 = us2[k];
                    double uass = uas[k];
                    char fin = finalNil[k];
                    nama[k] = nama[k+1];
                    nim[k] = nim[k+1];
                    us1[k] = us1[k+1]; 
                    us2[k] = us2[k+1];
                    uas[k] = uas[k+1];
                    totalNil[k] = totalNil[k+1];
                    finalNil[k] = finalNil[k+1];
                    totalNil[k+1] = change;
                    nama[k+1] = namaa;
                    nim[k+1] = nimm;
                    us1[k+1] = uts1;
                    us2[k+1] = uts2;
                    uas[k+1] = uass;
                    finalNil[k+1] = fin;
                }
            }
        }
    }
}
