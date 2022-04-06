package Modul_3;
public class Segitiga {
    private Titik titikA, titikB, titikC;
    private double sisiA, sisiB, sisiC;

    public Segitiga(Titik titikA, Titik titikB, Titik titikC) {//constructor segitiga
        this.titikA = titikA;
        this.titikB = titikB;
        this.titikC = titikC;
    }
    public double hitungSisi(Titik A, Titik B) {
        int x1, y1, x2, y2;
        x1 = A.getX();
        y1 = A.getY();
        x2 = B.getX();
        y2 = B.getY();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    public double hitungKeliling() {
        double sisiA = hitungSisi(titikA, titikB);
        double sisiB = hitungSisi(titikA, titikC);
        double sisiC = hitungSisi(titikB, titikC);
        return (sisiA + sisiB + sisiC);
    }
    public double hitungLuas() {
        double s = hitungKeliling() / 2;

        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }
}
