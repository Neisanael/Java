package Modul_2;

public class Kalkulator {

    private double bil1, bil2;

    public Kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double getKurang() {
        return getBil1() - getBil2();
    }

    public double getJumlah() {
        return getBil1() + getBil2();
    }

    public double getBagi() {
        return getBil1() / getBil2();
    }

    public double getKali() {
        return getBil1() * getBil2();
    }

    public double getBil1() {
        return bil1;
    }

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public double getBil2() {
        return bil2;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }

}
