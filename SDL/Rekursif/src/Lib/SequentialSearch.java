package Lib;

public class SequentialSearch {

    public static int cetakSequential(int larik[], int kunci) {
        for (int counter = 0; counter <= larik.length; counter++) {
            if (kunci == larik[counter]) {
                return counter;
            }
        }
        return -1;
    }
}
