/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib;

import static java.lang.System.*;
import java.util.Arrays;

public class MergeSort {

    private static int passCount;

    public static void mergeSort(int[] list) {
        passCount = 0;
        mergeSort(list, 0, list.length);
    }

    private static void mergeSort(int[] list, int front, int back) //O( Log N )
    {
        int mid = (front + back) / 2;
        if (mid == front) {
            return;
        }
        mergeSort(list, front, mid);
        mergeSort(list, mid, back);
        merge(list, front, back);

    }

    private static void merge(int[] list, int front, int back) //O(N)
    {
        int dif = back - front;
        int[] temp = new int[dif];
        int beg = front, mid = (front + back) / 2;
        int saveMid = mid;
        int spot = 0;

        while (beg < saveMid && mid < back) {
            if (list[beg] < list[mid]) {
                temp[spot++] = list[beg++];
            } else {
                temp[spot++] = list[mid++];
            }
        }
        while (beg < saveMid) {
            temp[spot++] = list[beg++];
        }
        while (mid < back) {
            temp[spot++] = list[mid++];
        }
        for (int i = 0; i < back - front; i++) {
            list[front + i] = temp[i];
        }
        System.out.println("pass " + passCount++ + " " + Arrays.toString(list) + "\n");
    }
}
