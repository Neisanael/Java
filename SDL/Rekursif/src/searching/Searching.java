package searching;

import Lib.*;
import java.util.*;

public class Searching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 8, 11, 15, 26, 31};
        Larik.Cetak(arr);

        System.out.println(arr.length);

        System.out.print("Search Sequential : ");
        int n = sc.nextInt();
        System.out.println(arr[SequentialSearch.cetakSequential(arr, n)]
                + " Index ke - " + SequentialSearch.cetakSequential(arr, n));

        System.out.print("Search Binary : ");
        int x = sc.nextInt();
        System.out.println(arr[BinarySearch.cetakBinary(arr, x, 0, arr.length - 1)]
                + " Index ke - " + BinarySearch.cetakBinary(arr, x, 0, arr.length - 1));

        System.out.print("Search Interpolation : ");
        int a = sc.nextInt();
        System.out.println(arr[InterpolationSearch.cetakIntepolation(arr, a, 0, (arr.length - 1))]
                + " Indek ke - " + InterpolationSearch.cetakIntepolation(arr, a, 0, (arr.length - 1)));
    }
}
