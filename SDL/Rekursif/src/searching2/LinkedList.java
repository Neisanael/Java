package searching2;

import java.util.NoSuchElementException;

public class LinkedList {

    ListNode head;
    int size;

    public LinkedList() {
        head = new ListNode();
        head.next = head;
        head.prev = head;
        size = 0;
    }

    private void addBefore(int a, ListNode bantu) {
        ListNode baru = new ListNode(a);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
        size++;
    }

    public void addFirst(int a) {
        addBefore(a, head.next);
    }

    public void addLast(int a) {
        addBefore(a, head);
    }

    private int remove(ListNode bantu) {
        if (!isEmpty()) {
            throw new NoSuchElementException();
        }
        int elemen = bantu.getElemen();
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

    public ListNode search(int a) {
        if (!isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode bantu = head.next;
        while (bantu != head) {
            if (a == bantu.elemen) {
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }

    public void cetak() {
        ListNode bantu = new ListNode();
        bantu = head.next;
        while (bantu != head) {
            System.out.print(bantu.elemen + " ");
            bantu = bantu.next;
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

}
