package modul9;
import java.util.Scanner;
public class bilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, akhir;
         System.out.print("Masukan nilai N : ");
         akhir=input.nextInt();
         System.out.println("OUTPUT : ");
        for (int i=2; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }
        System.out.print(". Bilangan Prima ke "+akhir+"\n");
    }   
}
