package rekursif;

import static Lib.Matematika.*;

public class MatematikaMain {

    public static void main(String[] args) {
        int y = FaktorialRekursif(3);
        int x = FaktorialIteratif(3);
        System.out.println(y);
        System.out.println(x);
    }
}
