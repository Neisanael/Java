package uassdl_215314043;
public class Stack {

    private char[] element;
    private int front, size;

    Stack() {

    }

    Stack(int ukuran) {
        element = new char[ukuran];
        front = -1;
        size = 0;
    }

    public boolean push(char o) {
        if (size < element.length) {
            front++;
            size++;
            element[front] = o;
            return true;
        } else {
            return false;
        }
    }

    public char pop() {
        if (isEmpty()) {
            return 0;
        } else {
            char a = element[front];
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
        String aku = "Andreas Nathanael Priambodo";
        Stack s = new Stack(aku.length());
        for (int i = 0; i < aku.length(); i++) {
            System.out.print(aku.charAt(i));
            s.push(aku.charAt(i));
        }
        System.out.println("");
        for (int i = 0; i < aku.length(); i++) {
            System.out.print(s.pop());
        }
        System.out.println("");
    }
}
