/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;
import java.util.Scanner;
public class kurusGemuk {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double beratIdeal, beratBadan, tinggiBadan;
        
        System.out.print("Masukan Berat badan = ");
        beratBadan = keyboard.nextDouble();
        System.out.print("Masukan Tinggi badan = ");
        tinggiBadan = keyboard.nextDouble();
        
        beratIdeal = tinggiBadan - beratBadan;
        
        if (beratIdeal < 90){
            System.out.println("Terlalu Gemuk");
        }
        else if (beratIdeal > 110){
            System.out.println("Terlalu Kurus");
        }
        else {
            System.out.println("Berat Ideal");
        }
    }
}
