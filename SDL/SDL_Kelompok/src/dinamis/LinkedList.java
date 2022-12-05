/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamis;

public class LinkedList {

    ListNode head;
    int size;

    public LinkedList() {
        head = new ListNode();
        head.next = head;
        head.prev = head;
        size = 0;
    }

    private void addBefore(Object o, ListNode bantu) {
        ListNode baru = new ListNode(o);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
        size++;
    }

    public void addFirst(Object o) {
        addBefore(o, head.next);
    }

    public void addLast(Object o) {
        addBefore(o, head);
    }

    private Object remove(ListNode bantu) {
        if(size ==0){
            throw new NullPointerException();
        }
        Object elemen = bantu.getElemen();
        bantu.prev.next = bantu.next;
        bantu.next.prev = bantu.prev;
        bantu.prev = null;
        bantu.next = null;
        size--;
        return elemen;
    }

    public Object removeFirst() {
        return remove(head.next);
    }

    public Object removeLast() {
        return remove(head.prev);
    }

    public ListNode search(Object o) {
        ListNode bantu = head.next;
        while (bantu != head) {
            if (((Comparable) o).compareTo(bantu.elemen) == 0) {
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }

    public void print2() {
        ListNode bantu1 = new ListNode();
        bantu1 = head.next;
        while (bantu1 != head) {
            System.out.println(bantu1.elemen);
            bantu1 = bantu1.next;
        }
        System.out.println("");
    }

    public String print() {
        ListNode bantu1 = new ListNode();
        String a = "";
        bantu1 = head.next;
        while (bantu1 != head) {
            a = a + bantu1.elemen + "\n";
            bantu1 = bantu1.next;
        }
        return a;
    }
//    public String getPrint(){
//        String result = "";
//            ListNode current = head;
//            while(current.next != null){
//                result += current.elemen;
//                if(current.next != null){
//                     result += ", ";
//                }
//                current = current.next;
//            }
//            return "List: " + result;
//    }
//    public void toString(){
//        
//    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return false;
        }
        return true;
    }

//    public static void main(String[] args) {
//        Mahasiswa mhs;
//        LinkedList link = new LinkedList();
//        if (link.isEmpty()) {
//        } else {
//            System.out.println("Kosong ");
//        }
//        link.addFirst(mhs = new Mahasiswa(33, "Dwikki"));
//        link.print();
//        link.addFirst(mhs = new Mahasiswa(40, "Angel"));
//        link.print();
//        link.addLast(mhs = new Mahasiswa(52, "Chella"));
//        link.print();
//        link.addLast(mhs = new Mahasiswa(58, "Nael"));
//        link.print();
//        
//        System.out.println("Remove");
//        System.out.println(link.removeFirst());
//        link.removeFirst();
//        link.print();
//        link.removeLast();
//        link.print();
//        if (link.search(new Mahasiswa(40, "Angel")) != null) {
//            System.out.println("ada");
//        } else {
//            System.out.println("Tidak ada");
//        }
//        if (link.search(new Mahasiswa(52, "Chella")) != null) {
//            System.out.println("ada");
//        } else {
//            System.out.println("Tidak ada");
//        }
//    }
}
