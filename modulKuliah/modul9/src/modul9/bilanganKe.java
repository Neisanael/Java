package modul9;
import java.util.Scanner;
public class bilanganKe {
    public static void main(String[] args) {
        int bil = 0, i, z = 0, n;
        char keluar = ' ';
        Scanner keyboard = new Scanner(System.in);
//        !keluar.equalsIgnoreCase("y")&&!keluar.equalsIgnoreCase("t")
        while(keluar == 'y'&&keluar == 't'||z==0){
        n = 0;
        i = 0;
        bil = 0;
        System.out.print("Masukan Bilangan : ");
        n = keyboard.nextInt();
            for(i = 1; bil <= n; i++){
                System.out.print(bil+", ");
                bil = bil + i;
            }
        z=1;
            if(z==1){
                System.out.print("\nApakah anda ingin keluar ? (Y/T) : ");
                keluar = keyboard.next().charAt(0);
                keluar = Character.toLowerCase(keluar);
                while(keluar != 'y'&&keluar != 't'){
                    System.out.print("Salah, Masukan input yang benar!!:");
                    keluar = keyboard.next().charAt(0);
                    keluar = Character.toLowerCase(keluar);
                }
                if(keluar == 'y'){
                    return;
                }if(keluar == 't'){
                    z=0;
                }
            }
        }
    }
}
