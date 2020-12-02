package tij4.chapter_16.exercise_2;

import java.util.Arrays;

final class BerylliumSphere {
    private String name;

    BerylliumSphere(String name) {
        this.name = name;
    }
}

public class Ex2_16 {

    public static BerylliumSphere[] getArray(int n) {
        BerylliumSphere[] result = new BerylliumSphere[n];

        for (int i = 0; i < n; i++) {
            result[i] = new BerylliumSphere(String.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {

        BerylliumSphere[] a = getArray(7);
        System.out.println(Arrays.toString(a));
    }
}
