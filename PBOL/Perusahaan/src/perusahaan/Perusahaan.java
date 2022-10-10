package perusahaan;

import java.util.Scanner;

public class Perusahaan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kantor kantor = new Kantor();
        Manager manager = new Manager();
        Marketing marketing = new Marketing();
        
        System.out.print("Nama Manager : ");
        manager.setNama(sc.next());
        System.out.print("No Induk Manager : ");
        manager.setNoInduk(sc.next());
        System.out.print("Gaji Pokok Manager : ");
        manager.setGajiPokok(sc.nextDouble());
        System.out.print("Gaji Lemburan Manager : ");
        manager.setLemburan(sc.nextDouble());
        System.out.print("Gaji Tunjangan Manager : ");
        manager.setTunjanganJabatan(sc.nextDouble());
        kantor.setManager(manager);

        System.out.println("------------------------------------");
        System.out.print("Nama Marketing : ");
        marketing.setNama(sc.next());
        System.out.print("No Induk Marketing : ");
        marketing.setNoInduk(sc.next());
        System.out.print("Gaji Pokok Marketing : ");
        marketing.setGajiPokok(sc.nextDouble());
        System.out.print("Gaji Bonus Marketing : ");
        marketing.setBonus(sc.nextDouble());
        kantor.setMarketing(marketing);
        
        System.out.println("------------------------------------");
        System.out.print("Masukan jumlah Honorer : ");
        int jumHon = sc.nextInt();
        Honorer[] honorer = new Honorer[jumHon];
        for (int i = 0; i < honorer.length; i++) {
            honorer[i] = new Honorer();
            System.out.print("Nama : ");
            String namaHonorer = sc.next();
            honorer[i].setNama(namaHonorer);
            System.out.print("No Induk : ");
            String noInduk = sc.next();
            honorer[i].setNoInduk(noInduk);
            System.out.print("Gaji Pokok : ");
            double gapok = sc.nextDouble();
            honorer[i].setGajiPokok(gapok);
            System.out.print("Gaji Lembur : ");
            double galem = sc.nextDouble();
            honorer[i].setLemburan(galem);
        }
        kantor.setHonorer(honorer);

        System.out.println("------------------------------------");
        System.out.print("Masukan Jumlah Pegawai : ");
        int jumPeg = sc.nextInt();
        Pegawai[] pgw = new Pegawai[jumPeg];
        for (int i = 0; i < honorer.length; i++) {
            pgw[i] = new Pegawai();
            System.out.print("Nama : ");
            String namaPeg = sc.next();
            pgw[i].setNama(namaPeg);
            System.out.print("No Induk : ");
            String noInduk = sc.next();
            pgw[i].setNoInduk(noInduk);
            System.out.print("Gaji Pokok : ");
            double gapokPeg = sc.nextInt();
            pgw[i].setGajiPokok(gapokPeg);
        }
        kantor.setPegawai(pgw);

        System.out.println("\n\n==============================\n");
        System.out.println("Manager : \nNama : " + kantor.getManager().getNama() + "\nNo Induk : " + 
                kantor.getManager().getNoInduk() + "\nGaji Total : " + manager.getGajiPokok());
        System.out.println("Marketing : \nNama : " + kantor.getManager().getNama() + "\nNo Induk : " + 
                kantor.getManager().getNoInduk() + "\nGaji Total : " + manager.getGajiPokok());
        System.out.println("\n================================\n");
        for (Honorer honorer1 : honorer) {
            System.out.println("Nama : " + honorer1.getNama() + "\nNo Induk : " + 
                    honorer1.getNoInduk() + "\nGaji Total : " + honorer1.getGajiPokok());
        }
        for (Pegawai pgw1 : pgw) {
            System.out.println("Nama : " + pgw1.getNama() + "\nNo Induk : " + 
                    pgw1.getNoInduk() + "\nGaji Pokok : " + pgw1.getGajiPokok());
        }
        System.out.println("\n=================================\n");
        System.out.println("Total Pengeluaran kantor : " + kantor.totalGaji());
    }
}
