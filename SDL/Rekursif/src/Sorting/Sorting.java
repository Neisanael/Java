package Sorting;

import Lib.*;
import java.util.Random;

public class Sorting {

    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1000);
        }
//        int[] arr = {5, 8, 26, 15, 11, 31};
        long x = System.nanoTime();

//        System.out.println("Sesudah selection sort");
//        SelectionSort.selectionSort(arr);

//        System.out.println("Sesudah buble sort");
//        BubbleSort.cetakBubbleSort(arr);

        System.out.println("Sesudah Insertion Sort");
        InsertionSort.cetakInsertionSort(arr);

        long y = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((1+i)+"   "+arr[i]);
        }
        long xy = y-x;
        System.out.println("Hasil Timing " + (y-x)/1e9);
        
        
    }
}
