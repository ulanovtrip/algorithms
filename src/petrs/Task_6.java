package petrs;

/**
 * Сформировать убывающий массив из чисел, которые делятся на 3.
 */

public class Task_6 {
    public static void main(String[] args) {
        int[] inputArr = {21, 20, 17, 12, 10, 9, 6, 2};
        int[] arrResult = new int[inputArr.length];
        int valueOfNumbers = 0;

        for (int i = 0; i <= inputArr.length - 1; i++) {
            if (inputArr[i] % 3 == 0) {
                arrResult[valueOfNumbers] = inputArr[i];
                valueOfNumbers++;
            }
        }
        for (int i = 0; i <= arrResult.length - 1; i++) {
            if (arrResult[i] == 0) {
                continue;
            } else {
                System.out.print(arrResult[i] + " - ");
            }
        }
    }
}
