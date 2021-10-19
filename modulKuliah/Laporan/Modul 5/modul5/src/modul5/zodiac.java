/*
Andreas Nathanael Priambodo 
Program Zodiac
 */
package modul5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class zodiac {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner (System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Nama : ");
        String nama = br.readLine();
        System.out.print("Alamat : ");
        String alamat = br.readLine();
        System.out.print("Tanggal Lahir : ");
        int tgl = keyboard.nextInt();
        System.out.print("Bulan Lahir : ");
        int bln = keyboard.nextInt();
        
        String sign = "";
        
        switch(bln){
            case 1:
                if(tgl >= 20 && tgl <= 31){
                    sign = "Aquarius";
                } break;
            case 2:
                if(tgl <= 18){
                    sign = "Aquarius";
                }else if(tgl >= 19 && tgl <= 28){
                    sign = "Pisces";
                }break;
            case 3:
                if(tgl <= 20){
                    sign = "Pisces";
                }else if(tgl >= 21 && tgl <= 31){
                    sign = "Aries";
                }break;
            case 4:
                if(tgl <= 19){
                    sign = "Aries";
                }else if(tgl >= 20 && tgl <= 30){
                    sign = "Taurus";
                }break;
            case 5:
                if(tgl <= 20){
                    sign = "Taurus";
                }else if(tgl >= 21 && tgl <= 31){
                    sign = "Gemini";
                }break;
            case 6:
                if(tgl <= 20){
                    sign = "Gemini";
                }else if(tgl >= 21 && tgl <= 30){
                    sign = "Cancer";
                }break;
            case 7:
                if(tgl <= 22){
                    sign = "Cancer";
                }else if(tgl >= 23 && tgl <= 31){
                    sign = "Leo";
                }break;
            case 8:
                if(tgl <= 22){
                    sign = "Leo";
                }else if(tgl >= 23 && tgl <= 30){
                    sign = "Virgo";
                }break;
            case 9:
                if(tgl <= 22){
                    sign = "Virgo";
                }else if(tgl >= 23 && tgl <= 31){
                    sign = "Libra";
                }break;
            case 10:
                if(tgl <= 22){
                    sign = "Libra";
                }else if(tgl >= 23 && tgl <= 30){
                    sign = "Scorpio";
                }break;
            case 11:
                if(tgl <= 21){
                    sign = "Scorpio";
                }else if(tgl >= 22 && tgl <= 31){
                    sign = "Sagitarius";
                }break;
            case 12:
                if(tgl <= 21){
                    sign = "Sagitarius";
                }else if(tgl >= 22 && tgl <= 30){
                    sign = "Capricorns";
                }break;
        }
        System.out.println("Anda berbintang : "+sign);
        
        switch(sign){
            case "Aquarius":
                System.out.println("Sifat anda : pekerja keras");
                break;
            case "Pisces":
                System.out.println("Sifat anda : intuitif yang kuat");
                break;
            case "Aries":
                System.out.println("Sifat anda : inovatif dan keras kepala");
                break;
            case "Taurus":
                System.out.println("Sifat anda : selalu ingin hidup nyaman");
                break;
            case "Gemini":
                System.out.println("Sifat anda : memiliki energi tinggi");
                break;
            case "Cancer":
                System.out.println("Sifat anda : kasih sayang dan loyalitas");
                break;
            case "Leo":
                System.out.println("Sifat anda : pemberani, berjiwa pemimpin");
                break;
            case "Virgo":
                System.out.println("Sifat anda : cermat, suka membantu");
                break;
            case "Libra":
                System.out.println("Sifat anda : tidak menyukai konflik");
                break;
            case "Scorpio":
                System.out.println("Sifat anda : pintar, cerdik, dan tanggap");
                break;
            case "Sagitarius":
                System.out.println("Sifat anda : berpetualang, tangguh");
                break;
            case "Capricorns":
                System.out.println("Sifat anda : perfeksioni");
                break;
        }
    }
}