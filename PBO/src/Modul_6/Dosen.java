package Modul_6;
public class Dosen {

    private String nip;
    private String nama;
    private Mahasiswa[] bimbingan;

    public Dosen(String no, String nm) {
        this.nip = no;
        this.nama = nm;
    }

    public String getNip() {
        return this.nip;
    }
    
    public String getNama() {
        return this.nama;
    }

    public void setMahasiswa(Mahasiswa[] mhs) {
        this.bimbingan = mhs;
    }

    public Mahasiswa[] getMahasiswa() {
        return bimbingan;
    }

    public void addMahasiswa(int n, Mahasiswa mhs) {
        this.bimbingan[n] = new Mahasiswa(mhs.getNim(), mhs.getNama());
        this.bimbingan[n].setEmail(mhs.getEmail());
        this.bimbingan[n].setUmur(mhs.getUmur());
    }
    
    public Mahasiswa cariMahasiswaTermuda() {
        int min = this.bimbingan[0].getUmur();
        int indeks = 0;
        for (int i = 1; i < this.bimbingan.length; i++) {
            if (this.bimbingan[i].getUmur() < min) {
                min = this.bimbingan[i].getUmur();
                indeks = i;
            }
        }
    return bimbingan[indeks];
    }
}


