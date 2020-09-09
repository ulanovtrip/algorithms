package petrs.analysis;

import java.util.Arrays;

/**
 * Определить, содержит ли массив данное число x
 */

public class Task_19 {
    public static void main(String[] args) {
        int N = 10;
        int x = 4;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(array);

        int loPosition = 0;
        int hiPosition = array.length - 1;
        while (loPosition <= hiPosition) {
            int middlePosition = (hiPosition + loPosition) / 2;
            if (x < array[middlePosition]) {
                hiPosition = middlePosition - 1;
            } else if (x > array[middlePosition]) {
                loPosition = middlePosition + 1;
            } else {
                System.out.println("X in " + middlePosition + " position in the array");
                break;
            }
            if (loPosition == hiPosition) {
                System.out.println("X isn't present in this array");
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(array[i]+"-");
        }
    }
}
