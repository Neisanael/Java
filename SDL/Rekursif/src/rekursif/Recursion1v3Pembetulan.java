package rekursif;

public class Recursion1v3Pembetulan {

    public static void main(String[] args) {
        count(3);
        System.out.println("");
    }

    public static void count(int index) {
        if (index > 2) {
            count(index - 1);
        }
        System.out.print(index);
    }
}
