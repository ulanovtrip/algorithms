package tij4.chapter_16.exercise_20;

import java.util.Arrays;

import static tij4.examples.util.Print.print;

class A {}

public class Ex20_16 {
    public static void main(String[] args) {
        int[][][] a1 = new int[4][3][2];
        int[][][] a2 = new int[4][3][2];
        print(Arrays.deepToString(a1));
        print(Arrays.deepEquals(a1, a2));

        A[][][] aa1 = new A[4][3][2];
        A[][][] aa2 = new A[4][3][2];
        print(Arrays.deepToString(aa1));
        print(Arrays.deepEquals(aa1, aa2));
        print(Arrays.deepEquals(a1, aa1));
    }
}
