package UTS_B_215314043;
import java.util.Scanner;
public class Soal_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nama, nim;
        int suhu, pilihan;
        double hasilCel, hasilFar, hasilRea;
        
        System.out.println("Program Konversi Suhu oleh :");
        System.out.print("Nama\t: ");
        nama = keyboard.nextLine();
        System.out.print("NIM\t: ");
        nim = keyboard.nextLine();
        System.out.println("Menu\n1.\tCelcius\n2.\tFahrenheti\n3.\tReamur");
        System.out.print("Pilih ? ");
        pilihan = keyboard.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.print("Masukan suhu Celcius : ");
                suhu = keyboard.nextInt();
                hasilRea = 4/5d*suhu;
                hasilFar = 9/5d*suhu+32;
                System.out.println("Suhu Reamur = "+hasilRea);
                System.out.println("Suhu Fahrenheit = "+hasilFar);
                break;
            case 2:
                System.out.print("Masukan suhu Fahrenheit : ");
                suhu = keyboard.nextInt();
                hasilCel = 5/9d*(suhu-32);
                hasilRea = 4/9d*(suhu-32);
                System.out.println("Suhu Reamur = "+hasilRea);
                System.out.println("Suhu Celcius = "+hasilCel);
                break;
            case 3:
                System.out.print("Masukan suhu Reamur : ");
                suhu = keyboard.nextInt();
                hasilCel = 5/4d*suhu;
                hasilFar = 9/4d*suhu+32;
                System.out.println("Suhu Fahrenheit = "+hasilFar);
                System.out.println("Suhu Celcius = "+hasilCel);
                break;
            default:
                System.out.println("Masukan salah");
                break;
        }
    }
    
}
