package Modul_11;

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
        Object elemen = bantu.getElemen();
        bantu.prev.next = bantu.next;
        bantu.next.prev = bantu.prev;
        bantu.prev = null;
        bantu.next = null;
        size--;
        return elemen;
    }

    public void removeFirst() {
        remove(head.next);
    }

    public void removeLast() {
        remove(head.prev);
    }

    public ListNode search(Object o) {
        ListNode bantu = head.next;
        while (bantu != head) {
            if (((Comparable)o).compareTo(bantu.elemen)==0) {
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }

    public void print() {
        ListNode bantu1 = new ListNode();
        bantu1 = head.next;
        while (bantu1 != head) {
            System.out.println(bantu1.elemen);
            bantu1 = bantu1.next;
        }
        System.out.println("");
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Mahasiswa mhs;
        LinkedList link = new LinkedList();
        if (link.isEmpty()) {
        } else {
            System.out.println("Kosong ");
        }
        link.addFirst(mhs = new Mahasiswa(33, "Dwikki"));
        link.print();
        link.addFirst(mhs = new Mahasiswa(40, "Angel"));
        link.print();
        link.addLast(mhs = new Mahasiswa(52, "Chella"));
        link.print();
        link.addLast(mhs = new Mahasiswa(58, "Nael"));
        link.print();
        
        System.out.println("Remove");
        link.removeFirst();
        link.print();
        link.removeLast();
        link.print();
        if (link.search(new Mahasiswa(40, "Angel")) != null) {
            System.out.println("ada");
        } else {
            System.out.println("Tidak ada");
        }
        if (link.search(new Mahasiswa(52, "Chella")) != null) {
            System.out.println("ada");
        } else {
            System.out.println("Tidak ada");
        }
    }
}
