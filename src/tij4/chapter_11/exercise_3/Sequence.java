package tij4.chapter_11.exercise_3;

import java.util.ArrayList;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;


    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        int size = 15;
        Sequence sequence = new Sequence(size);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
     }
}
