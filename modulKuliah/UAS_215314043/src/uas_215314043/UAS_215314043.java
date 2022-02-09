package uas_215314043;
public class UAS_215314043 {
    public static void main(String[] args) {
        int[] jmlPasienDaerah = {4, 48, 35, 86, 9, 23, 59, 8, 40, 100};
        System.out.printf("%s%15s%20s\n","Daerah","Jml Pasien","Kategori");
        System.out.println("===========================================");
        int a = 0, hijau = 0, orange = 0, merah = 0;
        int totalPasien = 0, rataPasien, terbanyak = jmlPasienDaerah[0], terendah = jmlPasienDaerah[0];
        for(int i : jmlPasienDaerah){
            a++;
            System.out.printf("%2d%15d%23s\n",a,i,kate(i));
            totalPasien = totalPasien + i;
            terbanyak = Math.max(terbanyak, i);
            terendah = Math.min(terendah, i);
            if("Hijau".equals(kate(i))){
                hijau++;
            }if("Orange".equals(kate(i))){
                orange++;
            }if("Merah".equals(kate(i))){
                merah++;
            }
        }
        System.out.println("===========================================");
        rataPasien = totalPasien/jmlPasienDaerah.length;
        System.out.println("Jumlah Total Pasien \t\t= "+totalPasien);
        System.out.println("Rata-rata Jumlah Pasien \t= "+rataPasien);
        System.out.println("Jumlah Pasien Terbanyak \t= "+terbanyak);
        System.out.println("Jumlah Pasien Paling Sedikit \t= "+terendah);
        System.out.println("Jumlah Daerah Zona Hijau \t= "+hijau);
        System.out.println("Jumlah Daerah Zona Orange \t= "+orange);
        System.out.println("Jumlah Daerah Zona Merah \t= "+merah);
    }

    static String kate(int i){
        String a = "";
        if(i >= 0 && i <= 10){
            a = "Hijau";
        }else if(i >= 11 && i<= 50){
            a = "Orange";
        }else if(i >= 51){
            a = "Merah";
        }
        return a;
    }
    
}
