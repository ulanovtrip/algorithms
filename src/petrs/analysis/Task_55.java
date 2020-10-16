package petrs.analysis;

import petrs.Utils;

/**
 * Определите, можно ли вычеркнуть из данного массива одно число так,
 * чтобы оставшиеся числа оказались упорядоченными по возрастанию.
 */

public class Task_55 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 4, 3, 4, 5};
        check(inputArray);
    }

    private static void check(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 2; i++) {
            if (inputArray[i] <= inputArray[i + 1]) {
                continue;
            } else {
                if (inputArray[i] <= inputArray[i + 2]) {
                    Utils.print("Success");
                    continue;
                } else {
                    Utils.print("false");
                    break;
                }
            }
        }
    }
}
