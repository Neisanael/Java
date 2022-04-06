package Modul_3;
public class pegawai {
    private String nip;
    private String nama;
    private String email;
    private String gelar;
    public pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
//NIP
    public String getNIP() {
        return nip;
    }
//Nama
    public String getNama() {
        return nama;
    }
//Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
//Gelar
    public String getGelar() {
        return gelar;
    }
    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
}
