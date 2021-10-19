package modul6;
import java.util.Scanner;
public class dataTabel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] suhu = new int[10];
        int rea, fah, var = 0;
        int i = 0, a = 0;
        
        while(i < suhu.length){
            a++;
            System.out.print("Masukan suhu ke "+a+" = ");
            suhu[i] = keyboard.nextInt(); 
            i++;
        }
        System.out.println("\nTabel Konversi Suhu");
        
        System.out.println("Celcius\tReamur\tFahrenheit");
        while(var < 10){            
            fah = (int) (9/5f * suhu[var] + 32); 
            rea = (int) (4/5f * suhu[var]);
            System.out.println(suhu[var]+"\t"+rea+"\t"+fah);
            var++;
        }
    }

}
