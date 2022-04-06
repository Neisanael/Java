package Modul_4;
import java.util.*;
public class mainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan berapa banyak Mahasiswa untuk diinput : ");
        int n = sc.nextInt();
        Mahasiswa[] siswa =  new Mahasiswa[n];
        
        String nma, tglLahir, nim;
        double ut1, ut2, us;
        
        for (int i = 0; i < siswa.length ; i++){
            System.out.print("Masukan nama mahasiswa : ");
            nma = sc.next();
            System.out.print("Masukan tanggal Lahir mahasiswa : ");
            tglLahir = sc.next();
            System.out.print("Masukan nim mahasiswa : ");
            nim = sc.next();
            System.out.print("Masukan Uts1 : ");
            ut1 = sc.nextDouble();
            System.out.print("Masukan Uts2 : ");
            ut2 = sc.nextDouble();
            System.out.print("Masukan Uas : ");
            us = sc.nextDouble();
            
            siswa[i] = new Mahasiswa(nma, tglLahir, nim, ut1, ut2, us);
        }
        System.out.println("Daftar Mahasiswa Informatika Peserta PBO");
        System.out.println("============================================================================");
        System.out.println("No.  NIM\tNama\tTanggal Lahir\tUs1\tUs2\tUas\tFinal\tNilai");
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < siswa.length; i++){
            System.out.println((i+1)+".  "+siswa[i].getNim()+"\t"+siswa[i].getNama()
                    +"\t"+siswa[i].getTglLahir()+"\t"+siswa[i].getUts1()+"\t"+siswa[i].getUts2()
                    +"\t"+siswa[i].getUas()+"\t"+siswa[i].nilaiFinal()+"\t"+siswa[i].konversiNilai());
        }
        
        Mahasiswa nilaiTinggi = siswa[0];
        for (int i=1;i<siswa.length;i++){
            if (siswa[i].nilaiFinal()>nilaiTinggi.nilaiFinal()){
                nilaiTinggi=siswa[i];
            }
        }
        
        System.out.println("Nilai Tertinggi Nim \t: "+nilaiTinggi.getNim());
        System.out.println("\tNama \t: "+nilaiTinggi.getNama());
        System.out.println("\tTgl lhr : "+nilaiTinggi.getTglLahir());
        System.out.println("\tFinal \t: "+nilaiTinggi.nilaiFinal());
        System.out.println("\tNilai \t: "+nilaiTinggi.konversiNilai());
    }
}
