package modul9;
import java.util.Scanner;
public class daftarPerkalian {
//    public static String padRight(String s, int n) {
//        return String.format("%-" + n + "s", s);  
//    }
//
//    public static String padLeft(String s, int n) {
//        return String.format("%" + n + "s", s);  
//    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, baris, kolom, m;
        System.out.print("Masukan kolom N : ");
        n = keyboard.nextInt();
        System.out.print("Masukan baris M : ");
        m = keyboard.nextInt();
        System.out.println("\n");
        for(baris=1; baris<=n; baris++){
//            System.out.print(padRight(baris+"",4)+"");
                System.out.printf("%4d", baris);
            for(kolom=1; kolom<=m; kolom++){
//                System.out.print(padRight(a+"", 4)+"");
                    System.out.printf("%4d", kolom*baris);
            }
            System.out.println("\n");
        }
    }
}
