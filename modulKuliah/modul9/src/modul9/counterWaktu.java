package modul9;
public class counterWaktu {
    public static void main(String[] args) {
        int n = 1, m = 1;
        for(int i = 1; m <= 12; i++){//detik sekaligus ngubah jam
            if(i==1){
                System.out.print("Detik : ");
            }
            System.out.print(i+", ");
            if(i==60){//Ngubah detik
                System.out.println("");
                i = 0;
                for(int j = 1; j <= 1; j++){//menit
                    if(j==1){
                        System.out.print("Menit : ");
                    }
                    System.out.println(n);
                    n++;
                    if(n==61){//Ngubah menit
                        n = 1;
                        j = 1;
                        for(int k =1; k <=1; k++){//jam
                            if(k>=1){
                                System.out.print("\nJam : ");
                            }
                            System.out.println(m+"\n");
                            m++;
                        }
                    }
                }
            }
            
        }
    }
}
