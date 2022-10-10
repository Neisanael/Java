package perusahaan;

public class Marketing extends Pegawai implements TugasBelajar {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double hitungGaji() {
        double totalGaji = getGajiPokok() + getBonus();
        return totalGaji;
    }

    @Override
    public boolean isSelesai() {
        return true;
    }
}
