package perusahaan;

public class Honorer extends Pegawai {

    private double lemburan;

    public double getLemburan() {
        return lemburan;
    }

    public void setLemburan(double lemburan) {
        this.lemburan = lemburan;
    }

    @Override
    public double hitungGaji() {
        double totalGaji = getGajiPokok() + getLemburan();
        return totalGaji;
    }
}
