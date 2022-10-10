/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdl;

/**
 *
 * @author rheakles
 */
import Lib.*;
public class SDL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {23,45,12,24,56,34,27,23,16};
//        System.out.println("Sesudah Quick Sort");
//        QuickSort.quickSort(arr, 0, arr.length-1);
        System.out.println("Sesudah MergeSort");
        MergeSort.mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
