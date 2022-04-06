package UTS_PBO1;
public class Dosen {

    private String nip;
    private String nama;
    private String email;
    private String gelar;
    private Mahasiswa[] mahas;
    

    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public String getNIP() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getGelar() {
        return gelar;
    }

    public Mahasiswa[] getMahas() {
        return mahas;
    }

    public void setMahas(Mahasiswa[] mahas) {
        this.mahas = mahas;
    }
    
}
