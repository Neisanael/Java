package Final;

public class Main {

    public static void main(String[] args) {

        Mahasiswa mhs[] = new Mahasiswa[4];
        mhs[0] = new Mahasiswa();
        mhs[1] = new Mahasiswa();
        mhs[2] = new Mahasiswa();
        mhs[3] = new Mahasiswa();
        mhs[0].setNama("Dwikki");
        mhs[0].setNim(33);
        mhs[1].setNama("Angel");
        mhs[1].setNim(40);
        mhs[2].setNama("Chella");
        mhs[2].setNim(52);
        mhs[3].setNama("Nael");
        mhs[3].setNim(58);

        Mahasiswa cariMhs = new Mahasiswa();
        cariMhs.setNim(52);
//        hasilSequential(mhs, cariMhs);
//        hasilBinary(mhs, cariMhs, mhs.length - 1);
//        hasilIntepolation(mhs, cariMhs, mhs.length - 1);error
        larik.cetak(mhs);
        System.out.println("");
//        larik.bubleSort(mhs);
//        larik.selectionSort(mhs);
//        larik.insertionSort(mhs);
//        larik.quickSort(mhs);
//        larik.mergeSort(mhs);
        System.out.println("");
        larik.cetak(mhs);
    }

    public static void hasilSequential(Object[] mhs, Object cariMhs) {
        int hasilSequential = larik.cetakSequential(mhs, cariMhs);
        if (hasilSequential == -1) {
            System.out.println("Kosong");
        } else {
            System.out.println("Index ke - " + hasilSequential);
        }
    }

    public static void hasilBinary(Object[] mhs, Object cariMhs, int x) {
        int hasilBinary = larik.cetakBinary(mhs, cariMhs, 0, x);
        if (hasilBinary == -1) {
            System.out.println("Kosong");
        } else {
            System.out.println("Index ke - " + hasilBinary);
        }
    }

//    public static void hasilIntepolation(Object[] mhs, Object cariMhs, int x) {
//        int hasilBinary = larik.cetakIntepolation(mhs, cariMhs, 0, x);
//        if (hasilBinary == -1) {
//            System.out.println("Kosong");
//        } else {
//            System.out.println("Index ke - " + hasilBinary);
//        }
//    }
}
