package petrs.analysis;

import petrs.RandomArray;
import petrs.Utils;

/**
 * Проверьте, содержит ли данный массив из n чисел, все числа от 1 до n.
 */

public class Task_42 {
    public static void main(String[] args) {
        RandomArray inputArray = new RandomArray(10, 9);
        inputArray.generate(1);
        inputArray.printIntArray();
        int N = inputArray.getSize() - 1;
        int[] bandZeroToN = new int[N];
        int countFindNumbers = 0;

        for (int i = 0; i < N; i++) {
            bandZeroToN[i] = i + 1;
        }

        for (int i = 0; i < inputArray.getSize(); i++) {
            int number = inputArray.getElement(i);
            if (binarySearch(number, bandZeroToN)) {
                countFindNumbers++;
            }
        }

        if (countFindNumbers + 2 == N) {
            Utils.print("Success");
        }
    }

    static boolean binarySearch(int number, int[] band) {
        int loPosition = 0;
        int hiPosition = band.length;
        while (loPosition <= hiPosition) {
            int middlePosition = (hiPosition + loPosition) / 2;
            if (number < band[middlePosition]) {
                hiPosition = middlePosition - 1;
            } else if (number > band[middlePosition]) {
                loPosition = middlePosition + 1;
            } else {
                return true;
            }
            if (loPosition == hiPosition) {
                return false;
            }
        }
        return true;
    }
}
