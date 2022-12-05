/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinamis;

import java.io.ByteArrayOutputStream;

/**
 *
 * @author natha
 */
public class NewClass {

    public static void main(String[] args) {
        String str = "|geekss|for|geekss|";
        String[] arrOfStr = str.split("|", -5);

        for (String a : arrOfStr) {
            System.out.println(a);
        }
    }
}
