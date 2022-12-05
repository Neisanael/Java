/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_11;

public class Stack {

    private Object[] element;
    private int front, size;

    Stack() {

    }

    Stack(int ukuran) {
        element = new Object[ukuran];
        front = -1;
        size = 0;
    }

    public boolean push(Object o) {
        if (size < element.length) {
            front++;
            size++;
            element[front] = o;
            return true;
        } else {
            return false;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            return 0;
        } else {
            Object a = element[front];
            front--;
            size--;
            return a;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String temp = " ";
        for (int i = 0; i < size; i++) {
            temp = temp + "\n" + String.valueOf(element[i]);
        }
        return temp;
    }

    public static void main(String[] args) {

//        Stack s = new Stack(7); //1
//        s.push(23); //2
//        s.push(45); //3
//        s.push(56); //4
//        System.out.println("Ukuran : " + s.size() + " => " + s.toString()); //5
//        if (s.isEmpty()) //6
//        {
//            System.out.println("data sudah habis");
//        } else {
//            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
//        }
//        int e = s.pop(); //7
//        System.out.println("Data yang di pop : " + e);
//        if (s.isEmpty()) {
//            System.out.println("data sudah habis");
//        } else {
//            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
//        }
//        System.out.println("Push 56");
//        s.push(56); //8
//        if (s.isEmpty()) {
//            System.out.println("data sudah habis");
//        } else {
//            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
//        }
//        if (s.isEmpty()) //9
//        {
//            System.out.println("data sudah habis");
//        } else {
//            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
//        }
        Stack s = new Stack(7);
        s.push(new Mahasiswa(33, "Victoria"));
        s.push(new Mahasiswa(43, "Nael"));
        s.push(new Mahasiswa(52, "Dwikki"));
        s.push(new Mahasiswa(59, "Chella"));
        System.out.println("Ukuran : " + s.size() + " => " + s.toString());
        
        System.out.println("\nPop Data : "+s.pop());
        if (s.isEmpty()) //6
        {
            System.out.println("data sudah habis");
        } else {
            System.out.println("Ukuran : " + s.size() + " => " + s.toString());
            System.out.println();
        }
    }
}
