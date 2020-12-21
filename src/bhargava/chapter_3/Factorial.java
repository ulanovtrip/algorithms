package bhargava.chapter_3;

import static edu.princeton.cs.algs4.StdOut.print;

public class Factorial {
    public static void main(String[] args) {
        int answer = fact(3);
        print(answer);
    }

    private static int fact(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * fact(i - 1);
        }
    }
}
