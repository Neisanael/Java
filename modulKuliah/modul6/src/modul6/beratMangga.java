package modul6;
import java.util.Scanner;
public class beratMangga {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int proses, i = 1, mangga, kecil = 0, sedang = 0, besar = 0;
        System.out.print("Banyak mangga yang di proses : ");
        proses = keyboard.nextInt();
        while(i <= proses){
            System.out.print("Berat mangga "+i+" : ");
            mangga = keyboard.nextInt();
            i++;
            if(mangga < 200 ){
                kecil += 1; 
            }else if (mangga >= 200 && mangga < 600){
                sedang += 1;
            }else if (mangga >= 600){
                besar += 1;
            }
        }
        i--;
        System.out.println("\nDari "+i+" yang ditimbang : ");
        System.out.println("Kecil : "+kecil+" buah");
        System.out.println("Sedang : "+sedang+" buah");
        System.out.println("Besar : "+besar+" buah");
    }
}
