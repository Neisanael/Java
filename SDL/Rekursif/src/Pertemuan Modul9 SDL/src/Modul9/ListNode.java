package Modul9;

public class ListNode {
    int elemen;
    ListNode next;
    ListNode prev;
    public ListNode() {
        elemen = 0;
        next = null;
        prev = null;
    }
    public ListNode(int a) {
        this.elemen = a;
    }
    public ListNode(int a, ListNode b, ListNode c) {
        this.elemen = a;
        this.next = b;
        this.prev = c;
    }
    public int getElemen() {
        return elemen;
    }
    public void setElemen(int elemen) {
        this.elemen = elemen;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public ListNode getPrev() {
        return prev;
    }
    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}

