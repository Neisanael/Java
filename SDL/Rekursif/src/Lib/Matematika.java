package Lib;

public class Matematika {

    public static int FaktorialIteratif(int x) {
        if ((x == 1) || (x == 0)) {
            return 1;
        } else {
            return x * FaktorialIteratif(x - 1);
        }
    }

    public static int FaktorialRekursif(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
