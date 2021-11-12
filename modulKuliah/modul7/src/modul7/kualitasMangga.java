/*
Andreas Nathanael Priambodo
Program kualitas mangga
*/
package modul7;
import java.util.Scanner;
public class kualitasMangga {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int proses, i =1, mangga = 0, kecil = 0, sedang = 0, besar = 0, j;
        System.out.print("Banyak mangga yang di proses : ");
        proses = keyboard.nextInt();
        while(i <= proses){
            do{
            System.out.print("Berat mangga "+i+" : ");
            mangga = keyboard.nextInt();
            if(mangga >= 0){
                if (mangga > 0 && mangga < 500){
                kecil++;
                } else if (mangga >= 500 && mangga <= 750){
                sedang++;
                } else if (mangga >= 750){
                besar++;
                }
                i++;

            } else {
            System.out.println("\nBerat mangga tidak boleh minus !\n");
            }
            }
            while(i <= proses);
            j = i -1 ;
            System.out.println("\nDari "+j+" yang ditimbang : ");
            System.out.println("Biasa : "+kecil+" buah");
            System.out.println("Bagus : "+sedang+" buah");
            System.out.println("Unggul : "+besar+" buah");
        }   
    }
}
