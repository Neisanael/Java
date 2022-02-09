package proyekkelompok2;
import java.util.Scanner;
public class ProyekKelompok2 {
    public static Scanner sc = new Scanner(System.in);
    
    static String[] bangunDatar = {"Exit", "Segitiga" , "Persegi" , "Lingkaran", "Persegi Panjang", "Trapesium", "Belah Ketupat", "Layang - layang", "Jajar Genjang", "Go back"}; 
    static String[] bangunRuang = {"Exit", "Balok" , "Bulat" , "Tabung", "Kubus", "Go Back"};
    
    public static void main(String[] args) {
        bacaData();
    }
    static void bacaData(){
        String pilihan;
        do{
        int a = 0;
        System.out.print("Pilih bidang : (Ruang/Datar) ");
        pilihan = sc.next();
            if(pilihan.toLowerCase().equals("ruang")){
                System.out.println("Pilih salah satu bangun Ruang : ");
                for(String i : bangunRuang){
                    System.out.println(a+". "+i);
                    a++;
                }bRuang();
            }if(pilihan.toLowerCase().equals("datar")){
                System.out.println("Pilih salah satu bangun Datar : ");
                for(String i : bangunDatar){
                    System.out.println(a+". "+i);
                    a++;
                }bDatar();
            }
        }while(!pilihan.toLowerCase().equals("ruang")&&!pilihan.toLowerCase().equals("datar"));
    }
    static void bRuang(){
        int pil;
        do{
        System.out.print("Pilihan anda ? No. ");
        pil = sc.nextInt();
        }while(pil > 5);
        switch(pil){
            case 0:
                System.out.println("Exiting...");
                return;
            case 1:
                System.out.println("Balok");
                break;
            case 2:
                System.out.println("Bulat");
                break;
            case 3:
                System.out.println("Tabung");
                break;
            case 4:
                System.out.println("Kubus");
                break;
            case 5: 
                bacaData();
        }
    }
    static void bDatar(){
        int pil;
        do{
        System.out.print("Pilihan anda ? No. ");
        pil = sc.nextInt();
        }while(pil > 9);
        switch(pil){
            case 0:
                System.out.println("Exiting");
                return;
            case 1:
                System.out.println("Segitiga");
                break;
            case 2:
                System.out.println("Persegi");
                break;
            case 3:
                System.out.println("Lingkaran");
                break;
            case 4:
                System.out.println("Persegi Panjang");
                break;
            case 5:
                System.out.println("Trapesium");
                break;
            case 6:
                System.out.println("Belah ketupat");
                break;
            case 7:
                System.out.println("Layang - layang");
                break;
            case 8:
                System.out.println("Jajar genjang");
                break;
            case 9:
                
                bacaData();
        }
    }
}
