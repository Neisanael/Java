package tokosupermurah;

import Lib.Barang;
import Lib.Obat;
import Lib.Pakaian;
import Lib.Makanan;
import java.util.*;

public class TokoSuperMurah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah Barang : ");
        int jumBarang = sc.nextInt();
        Barang[] brg = new Barang[jumBarang];
        for (int i = 0; i < brg.length; i++) {
            System.out.println("1.Pakaian\n2.Makanan\n3.Obat");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            System.out.print("Nama Barang : ");
            String namaBarang = sc.next();
            System.out.print("Harga Barang : ");
            String hargaBarang = sc.next();
            switch (pilih) {
                case 1:
                    brg[i] = new Pakaian();
                    brg[i].setNamaBarang(namaBarang);
                    brg[i].setHargaBarang(hargaBarang);
                    System.out.println("[1].S\n[2].M\n[3].L\n[4].XL\n[5].XXL\n[6].3XL");
                    System.out.print("Ukuran : ");
                    int pilihUkuran = sc.nextInt();
                    String ukuran = "";
                    switch (pilihUkuran) {
                        case 1:
                            ukuran = "S";
                            break;
                        case 2:
                            ukuran = "M";
                            break;
                        case 3:
                            ukuran = "L";
                            break;
                        case 4:
                            ukuran = "XL";
                            break;
                        case 5:
                            ukuran = "XXL";
                            break;
                        case 6:
                            ukuran = "3XL";
                            break;
                        default:
                            System.out.println("Salah Input");
                            break;
                    }
                    System.out.print("Warna : ");
                    String warna = sc.next();
                    System.out.print("Discount : ");
                    String discount = sc.next();
                    Pakaian pakaian = (Pakaian) brg[i];
                    pakaian.setDiscount(discount);
                    pakaian.setUkuran(ukuran);
                    pakaian.setWarna(warna);
                    break;
                case 2:
                    brg[i] = new Makanan();
                    brg[i].setNamaBarang(namaBarang);
                    brg[i].setHargaBarang(hargaBarang);
                    System.out.print("Tanggal Kadaluarsa : ");
                    String tglMakanan = sc.next();
                    System.out.print("Asal Daerah : ");
                    String asal = sc.next();
                    Makanan makanan = (Makanan) brg[i];
                    makanan.setAsalDaerah(asal);
                    makanan.setTanggalKadaluarsa(tglMakanan);
                    break;
                case 3:
                    brg[i] = new Obat();
                    brg[i].setNamaBarang(namaBarang);
                    brg[i].setHargaBarang(hargaBarang);
                    System.out.print("Tanggal Kadaluras : ");
                    String tglObat = sc.next();
                    System.out.print("Dosis Obat : ");
                    String dosis = sc.next();
                    Obat obat = (Obat) brg[i];
                    obat.setDosis(dosis);
                    obat.setTanggalKadaluarsa(tglObat);
                    break;
            }
        }
        for (int i = 0; i < brg.length; i++) {
            System.out.println("Nama Barang " + brg[i].getNamaBarang());
            System.out.println("Harga Barang " + brg[i].getHargaBarang());
            int castHarga = Integer.parseInt(brg[i].getHargaBarang());
            if (brg[i] instanceof Pakaian pakaian) {
                System.out.println("Warna : " + pakaian.getWarna());
                System.out.println("Ukuran : " + pakaian.getUkuran());
                System.out.println("Discount : " + pakaian.getDiscount());
                int castDiscount = Integer.parseInt(pakaian.getDiscount());
                System.out.println("Total : " + (castHarga - castDiscount));
            } else if (brg[i] instanceof Makanan makanan) {
                System.out.println("Asal Daerah : " + makanan.getAsalDaerah());
                System.out.println("Tanggal Kadalursa : " + makanan.getTanggalKadaluarsa());
            } else if (brg[i] instanceof Obat obat) {
                System.out.println("Dosis : " + obat.getDosis());
                System.out.println("Tanggal Kadaluarsa : " + obat.getTanggalKadaluarsa());
            }
        }
    }
}
