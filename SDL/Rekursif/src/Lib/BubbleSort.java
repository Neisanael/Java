/*
 * To change this license header, choose License Headers in Proelementect Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

//Algoritma buble sort
//	Algoritma ini digunakan untuk mengurutkan data dengan metode bubble sort.
//	Masukan berupa kumpulan data dalam larik.
//	Keluaran akan menghasilkan kumpulan data dalam larik yang sudah dalam keadaan urut.
//Langkah 0	: Baca data ke dalam larik 
//Langkah 1	: Untuk iterasi = 1 sampai N-1 lakukan langkah 2 
//Langkah 2	: Untuk elemen = 0 sampai N-1-iterasi lakukan langkah 3
//Langkah 3	: Test apakah larik[elemen] > larik[elemen + 1]
//		  	   elementika ya, tukarkan nilai kedua elemen ini
public class BubbleSort {

    public static void cetakBubbleSort(int[] larik) {
        int n = larik.length;
        for (int iterasi = 1; iterasi <= n - 1; iterasi++) {
            for (int element = 0; element <= n - 1 - iterasi; element++) {
                if (larik[element] > larik[element + 1]) {
                    int temp = larik[element + 1];
                    larik[element + 1] = larik[element];
                    larik[element] = temp;
                }
            }
        }
    }
}
