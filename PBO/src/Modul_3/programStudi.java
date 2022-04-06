package Modul_3;
public class programStudi {
    private String kode_prodi, nama_prodi;
    private pegawai ketua_prodi;
    public programStudi(String kode_prodi, String nama_prodi) {
        this.kode_prodi = kode_prodi;
        this.nama_prodi = nama_prodi;
    }
//KODE PRODI
    public String getKode_prodi() {
        return kode_prodi;
    }
    public void setKode_prodi(String kode_prodi) {
        this.kode_prodi = kode_prodi;
    }
//NAMA PRODI
    public String getNama_prodi() {
        return nama_prodi;
    }
    public void setNama_prodi(String nama_prodi) {
        this.nama_prodi = nama_prodi;
    }
//KETUA PRODI
    public pegawai getKetua_prodi() {
        return ketua_prodi;
    }
    public void setKetua_prodi(pegawai ketua_prodi) {
        this.ketua_prodi = ketua_prodi;
    }
}
