package modul9;
import java.util.Scanner;
public class jumlahPenduduk {
    public static void main(String[] args) {
        int penduduk, usia = 0, n, i;
        String a = "",b="",c="",d="",e="";
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Masukan jumlah penduduk : ");
        penduduk = keyboard.nextInt();
            for(n = 1; n <= penduduk; n++){
                System.out.print("Usia Warga "+n+"\t: ");
                usia = keyboard.nextInt(); 
                while(usia>-1 && usia<=20){
                    a = a+"*";
                    usia = -1;
                }while(usia>=21 && usia<=40){
                    b = b+"*";
                    usia = -1;
                }while(usia>=41 && usia<=60){
                    c = c+"*";
                    usia = -1;
                }while(usia>=61 && usia<=80){
                    d = d+"*";
                    usia = -1;
                }while(usia>=81 && usia<=100){
                    e = e+"*";
                    usia = -1;
                }
            }
            System.out.println("\nDistribusi usia "+penduduk+" penduduk di atas adalah :\n");
            System.out.println("0 - 20\t : "+a);
            System.out.println("21 - 40\t : "+b);
            System.out.println("41 - 60\t : "+c);
            System.out.println("61 - 80\t : "+d);
            System.out.println("81 - 100 : "+e);            
    }
}

