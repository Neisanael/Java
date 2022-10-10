package rekursif;

public class UpAndDown {

    public static void main(String[] args) {
        UpAndDown(3);
        System.out.println("");
    }

    public static void UpAndDown(int n) {
        System.out.print("\nLevel: " + n);
        if (n < 4) {
            UpAndDown(n + 1);
        }
        System.out.print("\nLEVEL: " + n);
    }
}
