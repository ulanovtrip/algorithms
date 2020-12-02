package tij4.chapter_15.exercise_4;

import java.util.LinkedList;
import java.util.List;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class GenericSequence<E> {
    private List<E> list;

    public GenericSequence(List<E> list) {
        this.list = list;
    }

    public void add(E a) {
        list.add(a);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == list.size();
        }

        public Object current() {
            return list.get(i);
        }

        public void next() {
            if (i < list.size()) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        GenericSequence<String> sequence = new GenericSequence<>(list);

        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
