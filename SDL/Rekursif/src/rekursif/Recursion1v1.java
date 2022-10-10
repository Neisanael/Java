/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rekursif;

/**
 *
 * @author Rheakles
 */
public class Recursion1v1 {
    public static void main(String[] args) {
        count(3);
        System.out.println("");
    }
    public static void count(int index){
        if(index < 1 ){
            count (index +1);
        }
        System.out.print(index);
    }
}
