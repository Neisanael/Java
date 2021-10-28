/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        int uts1, uts2, uas, nilaiTotal;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("UTS 1 : ");
            uts1 = sc.nextInt();
            System.out.print("UTS 2 : ");
            uts2 = sc.nextInt();
            System.out.print("UAS : ");
            uas = sc.nextInt();
            nilaiTotal =(int) ((int) (30/100f * uts1) + (30/100f * uts2) + (40/100f * uas)) ;
        }while(nilaiTotal < 0);
        if (nilaiTotal >= 80){
            System.out.println("A");
        }if(nilaiTotal >= 65 && nilaiTotal < 80){
            System.out.println("B");
        }if(nilaiTotal >= 55 && nilaiTotal < 65){
            System.out.println("C");
        }if(nilaiTotal >= 50 && nilaiTotal < 55){
            System.out.println("D");
        }if(nilaiTotal < 50){
            System.out.println("E");
        }
    }
}
