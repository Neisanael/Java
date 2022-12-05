/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_11;

import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

public class Queue {

    private Object[] element;
    private int front, size, rear;

    Queue() {

    }

    Queue(int ukuran) {
        element = new Object[ukuran];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean enqueue(Object o) {
        if (size < element.length) {
            element[rear] = o;
            rear++;
            size++;
            if (rear == element.length) {
                rear = 0;
            }
            return true;
        } else {
            return false;
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Object a = element[front];
            front++;
            size--;
            if (front == element.length) {
                front = 0;
            }
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

    public String cetak() {
        String hasil = "";
        int counter = 0;
        int bantu = front;
        while (counter < size) {
            hasil = hasil + "\n" + ((Mahasiswa)element[bantu]);
            bantu++;
            if (bantu == element.length) {
                bantu = 0;
            }
            counter++;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Queue antrian = new Queue(7);
        Mahasiswa mhs;
        antrian.enqueue(mhs = new Mahasiswa(33, "Angel"));
        antrian.enqueue(mhs = new Mahasiswa(43, "Nael"));
        antrian.enqueue(mhs = new Mahasiswa(52, "Dwikki"));
        antrian.enqueue(mhs = new Mahasiswa(59, "Chella"));
        try {
            System.out.println(((Mahasiswa)antrian.dequeue()));
            System.out.println(((Mahasiswa)antrian.dequeue()));
            System.out.println(((Mahasiswa)antrian.dequeue()));
            System.out.println(((Mahasiswa)antrian.dequeue()));
            System.out.println(((Mahasiswa)antrian.dequeue()));
        } catch (NoSuchElementException e) {
            System.out.println("Antrian kosong");
        }
        antrian.enqueue(mhs = new Mahasiswa(33, "Angel"));
        antrian.enqueue(mhs = new Mahasiswa(43, "Nael"));
        antrian.enqueue(mhs = new Mahasiswa(52, "Dwikki"));
        antrian.enqueue(mhs = new Mahasiswa(59, "Chella"));
        System.out.println(antrian.cetak());
    }
}
