package Modul_3;
class penerbit {
    private String nama_penerbit, alamat_penerbit;
    private int tahun_terbit;
    public penerbit(String nama_penerbit, String alamat_penerbit,int tahun_terbit) {
        this.nama_penerbit = nama_penerbit;
        this.alamat_penerbit = alamat_penerbit;
        this.tahun_terbit = tahun_terbit;
    }
//Nama penerbit
    public String getNama_penerbit() {
        return nama_penerbit;
    }
    public void setNama_penerbit(String nama_penerbit) {
        this.nama_penerbit = nama_penerbit;
    }
//Alamat penerbit
    public String getAlamat_penerbit() {
        return alamat_penerbit;
    }
    public void setAlamat_penerbit(String alamat_penerbit) {
        this.alamat_penerbit = alamat_penerbit;
    }
//Tahun penerbit
    public int getTahun_terbit() {
        return tahun_terbit;
    }
    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }
//Kategori Buku
    String lamaBuku(){
        String a = null;
        if(getTahun_terbit()<2019){
            a = "Buku Lama";
        }else{
            a = "Buku Baru";
        }
        return a;
    }
}
