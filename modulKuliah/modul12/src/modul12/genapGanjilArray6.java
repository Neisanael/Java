/*
Andreas Nathanael Priambodo
Program Ganjil Genap menggunakan Array
 */
package modul12;
public class genapGanjilArray6 {
    public static void main(String[] args) {
        int[] bil = { 23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        System.out.print("Bilangan Genap : ");
        for(int a = 0;a < bil.length ; a++){
            if(bil[a]%2 == 0){
                System.out.print(bil[a]+", ");
            }
        }
        System.out.println();
        System.out.print("Bilangan Ganjil : ");
        for(int a = 0;a < bil.length ; a++){
            if(bil[a]%2 != 0){
                System.out.print(bil[a]+", ");
            }
        }
        System.out.println();
    }
}
