package tij4.chapter_15.exercise_7;

import java.util.Iterator;

public class IterableFibonaCompoz implements Generator<Integer>, Iterable<Integer> {

    private int count = 0;
    private int m;

    public IterableFibonaCompoz() {
    }

    IterableFibonaCompoz(int m) {
        this.m = m;
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return m > 0;
            }

            @Override
            public Integer next() {
                m--;
                return IterableFibonaCompoz.this.next();
            }
        };
    }

    @Override
    public Integer next() {
        return fib(count++);
    }


    public static void main(String[] args) {
        IterableFibonaCompoz gen = new IterableFibonaCompoz();
        for (int i = 2; i < 13; i++) {
            System.out.print(gen.next() + "; ");
        }
        System.out.println();

        Iterator iterator = new IterableFibonaCompoz(13).iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "; ");
        }

    }
}
