/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamis;


public class ListNode {

    Object elemen;
    ListNode next;
    ListNode prev;

    public ListNode() {
        elemen = 0;
        next = null;
        prev = null;
    }

    public ListNode(Object o) {
        this.elemen = o;
    }

    public ListNode(Object o, ListNode b, ListNode c) {
        this.elemen = o;
        this.next = b;
        this.prev = c;
    }

    public Object getElemen() {
        return elemen;
    }

    public void setElemen(Object elemen) {
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
