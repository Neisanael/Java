/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

/**
 *
 * @author admin
 */
public class SelectionSort {

    public static void selectionSort(int[] larik) {
        int n = larik.length;
        for (int iterasi = 0; iterasi <= n - 2; iterasi++) {
            int minIndex = iterasi;
            for (int elemen = iterasi + 1; elemen <= n - 1; elemen++) {
                if (larik[elemen] < larik[minIndex]) {
                    minIndex = elemen;
                }
            }
            int swap = larik[minIndex];
            larik[minIndex] = larik[iterasi];
            larik[iterasi] = swap;
        }
    }
}