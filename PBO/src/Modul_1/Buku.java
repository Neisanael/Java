package Modul_1;
public class Buku {
    private String judul;
    private String pengarang;
    private String ISBN;
    private String penerbit;
    private String kategori;
    
    Buku(String judul, String ISBN){
        this.judul = judul;
        this.ISBN = ISBN;
    }
    public void pinjam(){
        System.out.print("Sedang Dipinjam ");
        System.out.println(judul + ISBN);
    }
    public void kembali(){
        System.out.print("Sudah Dikembalikan ");
        System.out.println(judul + ISBN);
    }
    public static void main(String[] args) {
        Buku book1 =  new Buku("Struktur Data", " 1304595");
        book1.pinjam();
        Buku book2 = new Buku("Java Fundamental", " 1304300");
        book2.kembali();
    }
}
