package petrs.analysis;

/**
 * Определите, можно ли вычеркнуть из данного массива одно число так,
 * чтобы оставшиеся числа оказались упорядоченными по возрастанию.
 */

public class Task_55 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 3, 6, 7, 8, 9};
        check(inputArray);
    }

    private static void check(int[] inputArray) {
        boolean result = true;
        boolean flag = false;

        for (int i = 0; i < inputArray.length - 2; i++) {
            if (inputArray[i] > inputArray[i + 1]) {
                if (flag || inputArray[i] > inputArray[i + 2]) {
                    result = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        System.out.println("Result = " + result);
    }
}
