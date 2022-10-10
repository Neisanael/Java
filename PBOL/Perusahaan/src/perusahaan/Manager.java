package perusahaan;

public class Manager extends Pegawai implements TugasBelajar {

    private double tunjanganJabatan, lemburan;

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public void setTunjanganJabatan(double tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public double getLemburan() {
        return lemburan;
    }

    public void setLemburan(double lemburan) {
        this.lemburan = lemburan;
    }

    @Override
    public double hitungGaji() {
        double totalGaji = getGajiPokok() + getTunjanganJabatan() + getLemburan();
        return totalGaji;
    }

    @Override
    public boolean isSelesai() {
        return true;
    }

}
