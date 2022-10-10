/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib;

/**
 *
 * @author Rheakles
 */
public class Paijo {

    public static int Paijo(int x) {
        if (x == 0) {
            return 0;
        }
        return 2 * Paijo(x - 1) + x * x;

    }
}
