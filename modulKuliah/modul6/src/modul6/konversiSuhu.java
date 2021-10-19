package modul6;
import java.util.Scanner;
public class konversiSuhu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int min, maks, selisih, rea, fah;
        
        System.out.println("Tabel Komversi Celcius ke Reamur dan Fahrenheit");
        System.out.print("\nMasukan nilai suhu minimum : ");
        min = keyboard.nextInt();
        System.out.print("Masukan nilai suhu maksimum : ");
        maks = keyboard.nextInt();
        System.out.print("Masukan selisih kenaikan : ");
        selisih = keyboard.nextInt();
        
        System.out.println("\nCelcius\tReamur\tFahrenheit");
        while(min <= maks){
            rea = (int) (4/5f * min);
            fah = (int) (9/5f * min + 32);
            System.out.println(min+"\t"+rea+"\t"+fah);
            min += selisih;
        }
    }
}
