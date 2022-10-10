package Lib;

public class InterpolationSearch {

    public static int cetakIntepolation(int[] larik, int kunci, int indekAwal, int indekAkhir) {
        while (kunci >= larik[indekAwal] && kunci <= larik[indekAkhir] && indekAwal <= indekAkhir) {
            int probe = indekAwal + (indekAkhir - indekAwal) * (kunci - larik[indekAwal]) 
                    / (larik[indekAkhir] - larik[indekAwal]);
            if (indekAkhir == indekAwal) {
                if (larik[indekAwal] == kunci) {
                    return indekAwal;
                } else {
                    return -1;
                }
            }
            if (larik[probe] == kunci) {
                return probe;
            }
            if (larik[probe] < kunci) {
                indekAwal = probe + 1;
            } else {
                indekAkhir = probe - 1;
            }
        }
        return -1;
    }
}
