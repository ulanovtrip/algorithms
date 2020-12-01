package tij4.chapter_15.exercise_5;//: generics/LinkedStack.java
// A stack implemented with an internal linked structure.

public class LinkedStack<T> {
    private static class Node {
        String item;
        Node next;

        Node() {
            item = null;
            next = null;
        }

        Node(String item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node top = new Node(); // End sentinel

    public void push(String item) {
        top = new Node(item, top);
    }

    public String pop() {
        String result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();

        for (String s : "Phasers on stun!".split(" "))
            lss.push(s);

        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }
}

/* Output:
stun!
on
Phasers
*///:~
