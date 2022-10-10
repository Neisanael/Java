package Lib;

public class InsertionSort {
    public static void cetakInsertionSort(int[] larik){
        for (int iterasi = 1; iterasi < larik.length; iterasi++) {
            int sisip = larik[iterasi];
            int element = iterasi - 1;
            while (element >= 0 && sisip > larik[element]) {
                larik[element + 1] = larik[element];
                element = element - 1;
            }
            larik[element + 1] = sisip;
        }
    }
}
