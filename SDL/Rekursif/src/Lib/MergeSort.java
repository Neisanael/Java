/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib;

import static java.lang.System.*;
import java.util.Arrays;

public class MergeSort {

public static void main(String[] args) {
        int[] arr = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};
        int[] dest = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};
        
        mergeSort(arr, dest, 0, arr.length);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }
    
    public static void mergeSort(int[] arr, int[] dest,int awal, int akhir){
        int length = akhir - awal;
        if(length < 2){
            return;
        }else {
            int mid = (awal + akhir)/2;
            mergeSort(dest, arr, awal, mid);
            mergeSort(dest, arr, mid, akhir);
            if(arr[mid -1]<= arr[mid]){
                System.arraycopy(arr, 0, dest, 0, arr.length);
            }
            int p = awal, q = mid, i = awal;
            while (i< akhir){
                if(arr[p]<=arr[q]){
                    dest[i++] = arr[p++];
                    if(p == mid){
                        while(i< akhir){
                            dest[i++] = arr[q++];
                        }
                    }
                }else{
                    dest[i++] = arr[q++];
                    if(q==akhir){
                        while(i<akhir){
                            dest[i++] = arr[p++];
                        }
                    }
                }
            }
        }
    }
}

