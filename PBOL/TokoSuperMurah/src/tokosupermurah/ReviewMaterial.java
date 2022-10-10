package tokosupermurah;

import Lib.Kelas;
import Lib.Dosen;
import Lib.Mahasiswa;
import java.util.Scanner;

public class ReviewMaterial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kelas pbo2 = new Kelas();
        Dosen dosen = new Dosen();
        dosen.setNama("Robertus Adi N.");
        dosen.setNip("2208");

        pbo2.setDosen(dosen);

        System.out.print("Masukan Jumlah daftar Mahasiswa : ");
        int jumMahasiswa = sc.nextInt();
        Mahasiswa[] mhs = new Mahasiswa[jumMahasiswa];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.print("Masukan nama Mahasiswa " + (i + 1) + " : ");
            String nama = sc.next();
            mhs[i].setNama(nama);
            System.out.print("Masukan nim Mahasiswa : ");
            String nim = sc.next();
            mhs[i].setNim(nim);
        }
        pbo2.setMahasiswa(mhs);
        System.out.println("Nama Dosen : " + dosen.getNama());
        System.out.println("Nip Dosen : " + dosen.getNip());
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Nama Mahasiswa " + (i + 1) + " : " + mhs[i].getNama());
            System.out.println("Nim Mahasiswa : " + mhs[i].getNim());
        }
    }
}
