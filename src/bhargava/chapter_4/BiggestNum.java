package bhargava.chapter_4;

import java.util.Arrays;

public class BiggestNum {
    public static void main(String[] args) {
        System.out.println(biggestNum(new int[]{3, 1, 10, 2, 4, 5}));
    }

    private static int biggestNum(int[] arr) {
        if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        } else {
            int[] copyArr = Arrays.copyOfRange(arr, 1, arr.length);
            int subMax = biggestNum(copyArr);
            return Math.max(arr[0], subMax);
        }
    }
}
