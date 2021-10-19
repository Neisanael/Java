package UTS_B_215314043;
import java.util.Scanner;
public class Soal_1 {

    public static void main(String[] args) {
        String nama,nim;
        int galon=30000, bbesar=5000, bkecil=3000, gelas=1000, total, diskon;
        int jmlhGalon, jmlhbBesar, jmlhbKecil, jmlhGelas, totalSemua;
        int hasilGalon, hasilbBesar, hasilbKecil, hasilGelas;
        int diskonGalon, diskonbBesar, diskonbKecil, diskonGelas;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Nota Warung 'Air Murah'");
        System.out.print("Nama\t: ");
        nama = keyboard.nextLine();
        System.out.print("NIM\t: ");
        nim = keyboard.nextLine();
        System.out.print("\nMasukan Jumlah Galon\t: ");
        jmlhGalon = keyboard.nextInt();
        System.out.print("Masukan Jumlah B.Besar\t: ");
        jmlhbBesar = keyboard.nextInt();
        System.out.print("Masukan Jumlah B.Kecil\t: ");
        jmlhbKecil = keyboard.nextInt();
        System.out.print("Masukan Jumlah Gelas\t: ");
        jmlhGelas = keyboard.nextInt();
        
        System.out.println("Jml\tKemasan\t@\tharga\tdiscount");
        System.out.println("========================================");
        
        hasilGalon = (jmlhGalon * galon);
        diskonGalon = (int) (hasilGalon * 15/100);
        hasilbBesar = (jmlhbBesar * bbesar);
        diskonbBesar = (int) (hasilbBesar * 12/100);
        hasilbKecil = (jmlhbKecil * bkecil);
        diskonbKecil = (int) (hasilbKecil * 10/100);
        hasilGelas = (jmlhGelas * gelas);
        diskonGelas = (int) (hasilGelas * 20/100);
        
        System.out.println("1\tGalon\t"+galon+"\t"+hasilGalon+"\t"+diskonGalon);
        System.out.println("2\tB.Besar\t"+bbesar+"\t"+hasilbBesar+"\t"+diskonbBesar);
        System.out.println("3\tB.Kecil\t"+bkecil+"\t"+hasilbKecil+"\t"+diskonbKecil);
        System.out.println("4\tGelas\t"+gelas+"\t"+hasilGelas+"\t"+diskonGelas);
        
        System.out.println("========================================");
        total = hasilGalon+hasilbBesar+hasilbKecil+hasilGelas;
        diskon = (int) (diskonGalon+diskonbBesar+diskonbKecil+diskonGelas);
        System.out.println("\tTOTAL\t"+total+"\t"+diskon);
        
        totalSemua = total - diskon;
        System.out.println("DIBAYARKAN\t"+totalSemua);
    }
    
}
