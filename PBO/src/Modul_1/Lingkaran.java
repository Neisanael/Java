package Modul_1;
public class Lingkaran {
    double r;
    double luas;
    final double PHI=3.14;
    Lingkaran(){};
    public void luas()
    {
        r=7;
        luas=PHI*r*r;
        System.out.println("Luas lingkaran dengan jari="+r+" adalah : "+luas);
    }
}
