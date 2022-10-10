package perusahaan;

public class Kantor {

    private Manager manager;
    private Marketing marketing;
    private Pegawai[] pegawai;
    private Honorer[] honorer;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Marketing getMarketing() {
        return marketing;
    }

    public void setMarketing(Marketing marketing) {
        this.marketing = marketing;
    }

    public Pegawai[] getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai[] pegawai) {
        this.pegawai = pegawai;
    }

    public Honorer[] getHonorer() {
        return honorer;
    }

    public void setHonorer(Honorer[] honorer) {
        this.honorer = honorer;
    }

    public double totalGaji() {
        double gajiTotal = manager.getGajiPokok() + marketing.getGajiPokok();
        for (Pegawai pegawai1 : pegawai) {
            gajiTotal += pegawai1.getGajiPokok();
        }
        for (Honorer honorer1 : honorer) {
            gajiTotal += honorer1.getGajiPokok();
        }
        return gajiTotal;
    }
}
