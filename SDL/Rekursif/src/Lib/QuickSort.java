/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib;

/**
 *
 * @author rheakles
 */
public class QuickSort {

    public static void quickSort(int[] x, int indekAwal, int indekAkhir) {
        if (indekAwal < indekAkhir) {
            int i = indekAwal + 1;
            int j = indekAkhir;
            while (i <= indekAkhir && x[i] <= x[indekAwal]) {
                i++;
            }
            while (j > indekAwal && x[j] > x[indekAwal]) {
                j--;
            }
            while (i < j) {
                int swap = x[i];
                x[i] = x[j];
                x[j] = swap;
                while (i <= indekAkhir && x[i] <= x[indekAwal]) {
                    i++;
                }
                while (j > indekAwal && x[j] > x[indekAwal]) {
                    j--;
                }
            }
            int swap2 = x[indekAwal];
            x[indekAwal] = x[j];
            x[j] = swap2;
            quickSort(x, indekAwal, (j - 1));
            quickSort(x, (j + 1), indekAkhir);
        }
    }
}
