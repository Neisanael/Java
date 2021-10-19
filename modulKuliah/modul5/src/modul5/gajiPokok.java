/*
Andreas Nathanael Priambodo
Program Gaji Pokok
 */
package modul5;
import java.util.Scanner;
enum Golongan {
    I, II, III, IV;
}
public class gajiPokok {
    public static void main(String[] args) {
        
        String var = "";
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Gologan Karyawan (I, II, III, IV)= ");
            String gol = keyboard.next();
        System.out.print("Masa Kerja Karyawan = ");
            int masa_kerja = keyboard.nextInt();
        
        Golongan penggolongan = Golongan.valueOf(gol.toUpperCase());
        
        switch (penggolongan){
            case I:
                switch((int)masa_kerja/11){
                    case 0:
                        var = "50%";
                        break;
                    case 1:
                        var = "60%";
                        break;
                    case 2:
                        var = "70%";
                        break;
                }
                break;
            case II:
                switch((int)masa_kerja/11){
                    case 0:
                        var = "60%";
                        break;
                    case 1:
                        var = "70%";
                        break;
                    case 2:
                        var = "80%";
                        break;
                }
                break;
            case III:
                switch((int)masa_kerja/11){
                    case 0:
                        var = "70%";
                        break;
                    case 1:
                        var = "80%";
                        break;
                    case 2:
                        var = "90%";
                        break;
                }
                break;
            case IV:
                switch((int)masa_kerja/11){
                    case 0:
                        var = "80%";
                        break;
                    case 1:
                        var = "90%";
                        break;
                    case 2:
                        var = "100%";
                        break;
                }
                break;
        }
        System.out.println("Presentase Gajinya adalah "+var);
    }
}
