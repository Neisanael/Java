package Lib;

public class BinarySearch {

    public static int cetakBinary(int larik[], int kunci, int indekAwal, int indekAkhir) {
        if (indekAwal <= indekAkhir) {
            int indekTengah = (indekAwal + indekAkhir) / 2;
            if (larik[indekTengah] == kunci) {
                return indekTengah;
            } else if (larik[indekTengah] >= kunci) {
                return cetakBinary(larik, kunci, indekAwal, (indekTengah - 1));
            } else if (larik[indekTengah] <= kunci) {
                return cetakBinary(larik, kunci, (indekTengah + 1), indekAkhir);
            }
        }
        return -1;
    }
}
