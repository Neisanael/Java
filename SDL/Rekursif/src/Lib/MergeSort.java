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
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};
        
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void mergeSort(int[] x){
        int[] source = x.clone();
        mergeSort(source, x, 0, x.length);
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
