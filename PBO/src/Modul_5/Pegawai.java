// Andreas Nathanael Priambodo 215314043
package Modul_5;
public class Pegawai {

    private String NPP, nama, golongan, status;
    private int jumlah_anak;

    public Pegawai(String NPP, String nama, String golongan, String status, int jumlah_anak) {
        this.NPP = NPP;
        this.nama = nama;
        this.golongan = golongan;
        this.status = status;
        this.jumlah_anak = jumlah_anak;
    }

    public String getNPP() {
        return NPP;
    }

    public void setNPP(String NPP) {
        this.NPP = NPP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getJumlah_anak() {
        return jumlah_anak;
    }

    public void setJumlah_anak(int jumlah_anak) {
        this.jumlah_anak = jumlah_anak;
    }

    int hitungGajiPokok() {
        int gaji = 0;
        switch (getGolongan()) {
            case "1":
                gaji = 1300000;
                break;
            case "2":
                gaji = 1750000;
                break;
            case "3":
                gaji = 2000000;
                break;
        }
        return gaji;
    }

    int hitungTunjanganKeluarga() {
        int tunjangan = 300000 + (getJumlah_anak() * 100000);
        return tunjangan;
    }

    int hitungGajiTotal() {
        int total = hitungGajiPokok() + hitungTunjanganKeluarga();
        return total;
    }
}
