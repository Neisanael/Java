package searching2;

public class SenaraiBerantaiGanda {

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        try {
            if (link.search(14) != null) {
                System.out.println("ada");
            } else {
                System.out.println("Tidak ada");
            }
        } catch (Exception e) {
            System.out.println("Elemen kosong");
        }

        if (link.isEmpty()) {
            System.out.println("Ada isi");
        } else {
            System.out.println("Tidak ada isi");
        }
        link.addFirst(8);
        link.cetak();
        System.out.println("Ukuran : " + link.size);
        link.addFirst(15);
        link.cetak();
        System.out.println("Ukuran : " + link.size);
        link.addLast(26);
        link.cetak();
        System.out.println("Ukuran : " + link.size);
        link.addLast(14);
        link.cetak();
        System.out.println("Ukuran : " + link.size);
        if (link.search(14) != null) {
            System.out.println("ada");
        } else {
            System.out.println("Tidak ada");
        }
        if (link.search(15) != null) {
            System.out.println("Ada");
        } else {
            System.out.println("Tidak ada");
        }
        if (link.isEmpty()) {
            System.out.println("Ada isi");
        } else {
            System.out.println("Tidak ada isi");
        }
        try {
            link.removeFirst();
            link.cetak();
            link.removeFirst();
            link.cetak();
            link.removeFirst();
            link.cetak();
            link.removeFirst();
            link.cetak();
            link.removeFirst();
            link.cetak();
        } catch (Exception e) {
            System.out.println("gagalRemove");
        }
    }
}
