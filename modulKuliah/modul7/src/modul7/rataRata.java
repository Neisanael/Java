/*
Andreas Nathanael Priambodo
Program mencari rata rata, maksimal, minimal, variasi data, deviasi standar
*/
package modul7;
import java.util.Scanner;
public class rataRata {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total, i =1, maks = 0,mins = 1000, jum = 0, rata, data, rentang;
        double kuadrat = 0, variansi, deviasiStandar;
        System.out.print("Masukan data yang akan di proses = ");
        total = keyboard.nextInt();
        do{
            System.out.print("Masukan data ke "+i+" : ");
            data = keyboard.nextInt();
            jum += data;
            kuadrat = kuadrat + Math.pow(data, 2);
            i++;
            if (i == 1) {
                maks = data;
            }else if (data > maks){
                 maks = data;
            } 
            if (i == 2){
                  mins = data;
            }  else if (data < mins) {
                mins = data;
            }
        }
        while(i <= total);
        System.out.println("\n____________________________\n");
        rentang = maks - mins;
        rata = jum/total;
        variansi = (kuadrat -(data * rata * 2)) / data;
        deviasiStandar = Math.sqrt(variansi);
        System.out.println("Data terbesar   : "+maks);
        System.out.println("Data tekecil    : "+mins);
        System.out.println("Rentang data    : "+rentang);
        System.out.println("Rata - rata     : "+rata);
        System.out.println("Variansi data   : "+variansi);
        System.out.println("Deviasi Standar : "+deviasiStandar);
    }
}
    

