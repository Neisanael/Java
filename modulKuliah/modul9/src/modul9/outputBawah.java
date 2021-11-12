package modul9;
public class outputBawah {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 4; i >= 0; i--) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 5; k > i; k--){
                System.out.print(a+" ");
            } 
            a++;
            System.out.println();
        }
    }
}
