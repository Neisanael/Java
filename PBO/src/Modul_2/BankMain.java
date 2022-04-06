package Modul_2;

public class BankMain {

    public static void main(String args[]) {
        RekeningBank rekeningBudi;
        rekeningBudi = new RekeningBank("12345");
        System.out.println("Rekening Budi = "
                + rekeningBudi.cekSaldo());
        System.out.println("Menabung Rp 50.000");
        rekeningBudi.tabung(50000);
        System.out.println("Rekening Budi sekarang = "
                + rekeningBudi.cekSaldo());
        System.out.println("Mengambil Rp 20.000");
        rekeningBudi.ambil(20000);
        System.out.println("Rekening Budi sekarang = "
                + rekeningBudi.cekSaldo());
    }
}
