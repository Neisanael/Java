package Modul_1;
public class Mobil {
    String warna;
    Mobil(String wrn) {
        warna = wrn;
    }
    void jalan_maju() {
        System.out.print("Mobil warna " + warna);
        System.out.println(" Maju !");
    }
    public static void main(String[] args) {
        Mobil sedan = new Mobil("merah");
        sedan.jalan_maju();
    }
}
