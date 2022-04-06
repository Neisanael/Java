package Modul_6;
import javax.swing.*;
public class MainMahasiswa {
    public static void main (String[] args)  {
  
        //deklarasi variabel
        Mahasiswa[] mhs= new Mahasiswa[2];
        //memasukkan data mahasiswa
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke- "+(i+1));
            String nim = JOptionPane.showInputDialog("NIM : ");
            String nama = JOptionPane.showInputDialog("Nama : ");
            String email = JOptionPane.showInputDialog("Email : ");
            String umr = JOptionPane.showInputDialog("Umur : ");
            int umur = Integer.parseInt(umr);
          
           //membuat objek Mahasiswa dan menyimpannya di dalam array mhs indeks ke-i
            mhs[i] = new Mahasiswa(nim, nama);
            mhs[i].setEmail(email);
            mhs[i].setUmur(umur);
        }

        //membuat objek dosen dsn1 
        Dosen dsn1=new Dosen("67","Agung");
        //mengeset mahasiswa bimbingan dosen dsn1 berdasar data array mhs
        dsn1.setMahasiswa(mhs);
        //menambah 1 orang mahasiswa ke dalam array mahasiswa di objek dosen dsn1
        
        Mahasiswa m1 = new Mahasiswa("213114005", "Ani");
        m1.setEmail("ani@gmail.com");
        m1.setUmur(20);
        dsn1.addMahasiswa(1, m1);
        
        //menampilkan isi array mahasiswa yang dibimbing dosen dsn1
        Mahasiswa[] tampung=dsn1.getMahasiswa();
        for (int i=0;i<tampung.length;i++)
        {
                System.out.println(tampung[i].getNama());
        }
        
        //memanggil metode cariMahasiswaTermuda yang dimbing dosen dsn1
        Mahasiswa m2 = dsn1.cariMahasiswaTermuda();
        
        //menampilkan data mahasiswa termuda yang dibimbing dosen dsn1.
        System.out.println("Mahasiswa termuda yang dimbing Dosen " + dsn1.getNama() +" adalah :");
        System.out.println("- Nama: " + m2.getNama());
        System.out.println("- NIM: " + m2.getNim());
        System.out.println("- Umur: " + m2.getUmur());
        System.out.println("- Email: " + m2.getEmail()); 
}}


