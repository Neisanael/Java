package Modul_2;

public class GajiPegawaiMain {

    public static void main(String[] args) {

        GajiPegawai pegawai1 = new GajiPegawai();
        pegawai1.setNPP("1122");
        pegawai1.setNama("Novi");
        pegawai1.setGolongan("gol.1");
        pegawai1.setStatus("Menikah");
        pegawai1.setJumlah_anak(2);

        System.out.println(pegawai1.getNPP() + " atas nama " + pegawai1.getNama() + " golongan " 
                + pegawai1.getGolongan()
                + " Status " + pegawai1.getStatus() + " Memiliki Anak " + pegawai1.getJumlah_anak() 
                + " Gaji Pokok " + pegawai1.hitungGajiPokok()
                + " Tunjangan sebesar " + pegawai1.hitungTunjanganKeluarga() 
                + " TOTAL GAJI " + pegawai1.hitungGajiTotal());
    }
}
