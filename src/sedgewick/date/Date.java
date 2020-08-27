package sedgewick.date;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Date {
    private final int day;
    private final int month;
    private final int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public static void main(String[] args) {
//        int m = Integer.parseInt(args[0]);
//        int d = Integer.parseInt(args[1]);
//        int y = Integer.parseInt(args[2]);

        int m = 12;
        int d = 9;
        int y = 1999;

        Date date = new Date(d, m, y);
        StdOut.println(date);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(stack.push(i) + " ");
        }
        System.out.println();
//        for (int j = 0; j < 10; j++) {
//            System.out.print(stack.pop() + " ");
//        }

        for(Integer i : stack) {
            StdOut.print(i);
        }

        Stack<Integer> stack1 = new Stack<>();
        while (!StdIn.isEmpty()) {
            stack1.push(StdIn.readInt());
        }

        for (int i : stack1) {
            StdOut.println(i);
        }
    }
}
