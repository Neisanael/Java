package modul6;
public class bensinLiter {
    public static void main(String[] args) {           
            int bensinLiter = 6500, jumlah = 1;
            
            System.out.println("Harga per liter Rp "+bensinLiter);
            System.out.println("Jumlah Liter\tHarga (Rp)");
            System.out.println("=============================");
            while(jumlah <=20){
                System.out.println(jumlah+".\t\t"+bensinLiter);
                bensinLiter = bensinLiter + 6500;
                jumlah += 1;
            }
            System.out.println("=============================");
    }
}

