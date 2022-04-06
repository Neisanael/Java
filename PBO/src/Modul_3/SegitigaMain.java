package Modul_3;
public class SegitigaMain {
    public static void main(String[] args) {
        Titik A = new Titik(1, 2);
        Titik B = new Titik(7, 2);
        Titik C = new Titik(7, 9);
        Segitiga seg1 = new Segitiga(A, B, C);
        System.out.println("Luas segitiga dengan titik (1,2) (7,2) dan(7,9) adalah:" + seg1.hitungLuas());
    }
}
