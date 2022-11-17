package Modul9;

/**
 *
 * @author Andin
 */
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
        ListNode bantu = head.next;
        while(bantu != head) {
            if (a == bantu.elemen) {
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
            System.out.print(bantu1.elemen + " ");
            bantu1 = bantu1.next;
        }
        System.out.println("");
    }

    public int size() {
        return size;
    }
    
    public boolean isEmpty(){
        if(size==0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        if(link.isEmpty()){
        }else{
            System.out.println("Kosong goblok!");
        }
        link.addFirst(8);
        link.print();
        System.out.println("Ukuran : " + link.size);
        link.addFirst(15);
        link.print();
        System.out.println("Ukuran : " + link.size);
        link.addLast(26);
        link.print();
        System.out.println("Ukuran : " + link.size);
        link.addLast(14);
        link.print();
        System.out.println("Ukuran : " + link.size);
        if(link.search(14)!=null){
            System.out.println("ada");
        }else{
            System.out.println("Tidak ada");
        }
        link.removeFirst();
        link.print();
        if(link.search(15)!=null){
            System.out.println("ada");
        }else{
            System.out.println("Tidak ada");
        }
        if(link.isEmpty()){
            System.out.println("Ada isinya goblok!");
        }else{
        }
    }
}
