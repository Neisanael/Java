package Final;

public class larik {

    public static int cetakSequential(Object o[], Object key) {
        for (int counter = 0; counter <= o.length - 1; counter++) {
            if (((Comparable) o[counter]).compareTo(key) == 0) {
                return counter;
            }
        }
        return -1;
    }

    public static int cetakBinary(Object o[], Object kunci, int indekAwal, int indekAkhir) {
        if (indekAwal <= indekAkhir) {
            int indekTengah = (indekAwal + indekAkhir) / 2;
            if (((Comparable) o[indekTengah]).compareTo(kunci) == 0) {
                return indekTengah;
            }
            if (((Comparable) o[indekTengah]).compareTo(kunci) == 1) {
                return cetakBinary(o, kunci, indekAwal, (indekTengah - 1));
            }
            if (((Comparable) o[indekTengah]).compareTo(kunci) == -1) {
                return cetakBinary(o, kunci, (indekTengah + 1), indekAkhir);
            }
        }
        return -1;
    }

//    public static int cetakIntepolation(Object o[], Object kunci, int indekAwal, int indekAkhir) {
//        while (((Comparable) o[indekAwal]).compareTo(kunci) == -1 && ((Comparable) o[indekAkhir]).compareTo(kunci) == 1 && indekAwal <= indekAkhir) {
//            int probe = indekAwal + (indekAkhir - indekAwal) * (((Comparable) kunci).nim - ((Comparable) o[indekAwal]).nim)
//                    / (((Comparable) o[indekAkhir]).nim - ((Comparable) o[indekAwal]).nim);
//            if (indekAkhir == indekAwal) {
//                if ((((Comparable) o[indekAwal]).compareTo(kunci)) == 0) {
//                    return indekAwal;
//                } else {
//                    return -1;
//                }
//            }
//            if ((((Comparable) o[probe]).compareTo(kunci)) == 0) {
//                return probe;
//            }
//            if ((((Comparable) o[probe]).compareTo(kunci)) == -1) {
//                indekAwal = probe + 1;
//            } else {
//                indekAkhir = probe - 1;
//            }
//        }
//        return -1;
//    }
    
    public static void bubleSort(Object o[]) {
        for (int iterasi = 1; iterasi < o.length + 1; iterasi++) {
            for (int elemen = 0; elemen < o.length - 1; elemen++) {
                if ((((Comparable) o[elemen]).compareTo(o[elemen + 1])) == 1) {
                    Comparable temp = (Comparable) o[elemen];
                    o[elemen] = (Comparable) o[elemen + 1];
                    o[elemen + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(Object o[]) {
        int n = o.length;
        for (int iterasi = 0; iterasi <= n - 2; iterasi++) {
            int minIndex = iterasi;
            for (int elemen = iterasi + 1; elemen <= n - 1; elemen++) {
                if (((Comparable) o[minIndex]).compareTo(o[elemen]) == 1) {
                    minIndex = elemen;
                }
            }
            Comparable swap = (Comparable) o[minIndex];
            o[minIndex] = (Comparable) o[iterasi];
            o[iterasi] = swap;
        }
    }

    public static void insertionSort(Object o[]) {
        for (int iterasi = 1; iterasi < o.length; iterasi++) {
            Comparable sisip = (Comparable) o[iterasi];
            int element = iterasi;
            while (element >= 1 && ((Comparable) o[element - 1]).compareTo(sisip) == 1) {
                o[element] = o[element - 1];
                element--;
            }
            o[element] = sisip;
        }
    }

    public static void quickSort(Object o[]) {
        quickSort(o, 0, o.length - 1);
    }

    private static void quickSort(Object o[], int indekAwal, int indekAkhir) {
        if (indekAwal < indekAkhir) {
            int i = indekAwal + 1;
            int j = indekAkhir;
            while (i <= indekAkhir && ((Comparable) o[indekAwal]).compareTo(o[i]) == 1) {
                i++;
            }
            while (j > indekAwal && ((Comparable) o[indekAwal]).compareTo(o[j]) == -1) {
                j--;
            }
            while (i < j) {
                Comparable swap = ((Comparable) o[i]);
                o[i] = ((Comparable) o[j]);
                o[j] = swap;
                while (i <= indekAkhir && ((Comparable) o[indekAwal]).compareTo(o[i]) == 1) {
                    i++;
                }
                while (j > indekAwal && ((Comparable) o[indekAwal]).compareTo(o[j]) == -1) {
                    j--;
                }
            }
            Comparable swap2 = ((Comparable) o[indekAwal]);
            o[indekAwal] = ((Comparable) o[j]);
            o[j] = swap2;
            quickSort(o, indekAwal, (j - 1));
            quickSort(o, (j + 1), indekAkhir);
        }
    }

    public static void mergeSort(Object o[]) {
        mergeSort(o, 0, o.length - 1);
    }

    private static void mergeSort(Object o[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(o, low, mid);
            mergeSort(o, mid + 1, high);
            mergeSort(o, low, mid, high);
        }
    }

    private static void mergeSort(Object o[], int low, int mid, int high) {
        int i, j, k;
        int d1 = mid - low + 1;
        int d2 = high - mid;

        Comparable[] leftArray = new Comparable[d1];
        Comparable[] rightArray = new Comparable[d2];

        for (int m = 0; m < d1; m++) {
            leftArray[m] = ((Comparable) o[low + m]);
        }
        for (int n = 0; n < d2; n++) {
            rightArray[n] = ((Comparable) o[mid + 1 + n]);
        }

        i = 0;
        j = 0;
        k = low;

        while (i < d1 && j < d2) {
            if (((Comparable) leftArray[j]).compareTo(rightArray[i]) == -1) {
                o[k] = leftArray[i];
                i++;
            } else {
                o[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < d1) {
            o[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < d2) {
            o[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void cetak(Object o[]) {
        for (Object o1 : o) {
            System.out.println(o1);
        }
    }
}
