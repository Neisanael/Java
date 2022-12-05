/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinamis;

/**
 *
 * @author natha
 */
public class Queue {

    private LinkedList antrian;

    public Queue() {
//        antrian.addLast(elemen);
        antrian = new LinkedList();
    }

    void enqueue(Object o) {
        antrian.addLast(o);

//    public boolean enqueue(Object o) {
//        if (size < element.length) {
//            element[rear] = o;
//            rear++;
//            size++;
//            if (rear == element.length) {
//                rear = 0;
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }
    }

    Object dequeue() {
        return antrian.removeFirst();
    }

    int size() {
        return antrian.size();
    }

    boolean isEmpty() {
        if (size() == 0) {
            return false;
        }
        return true;
    }

    public void cetak() {
        antrian.print2();
    }
    
    public String cetak2(){
        return antrian.print();
    }

//    public static void main(String[] args) {
//        Queue ue = new Queue();
//        ue.enqueue(new Mahasiswa(33, "Dwikki"));
//        ue.enqueue(new Mahasiswa(40, "Angel"));
//        ue.enqueue(new Mahasiswa(52, "Chella"));
//        ue.enqueue(new Mahasiswa(58, "Nael"));
//        
//        ListNode ln = new ListNode();
//        
//        ue.cetak();
//        ue.dequeue();
//        ue.cetak();
//        System.out.println(ue.cetak2());
//    }
}
