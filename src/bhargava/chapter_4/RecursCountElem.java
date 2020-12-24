package bhargava.chapter_4;

import java.util.Arrays;

public class RecursCountElem {
    public static void main(String[] args) {
        System.out.println(countElem(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    private static int countElem(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            int[] copyArr = (Arrays.copyOfRange(arr, 1, arr.length));
            return 1 + countElem(copyArr);
        }
    }
}
