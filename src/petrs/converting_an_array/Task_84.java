package petrs.converting_an_array;


import petrs.Utils;

import java.util.stream.IntStream;

/**
 * Дано натуральное число n от 9 до 10^7.
 * Необходимо найти минимальное число k такое, что произведение цифр этого числа равно n.
 * Например, для n=20 ответ равен 45.
 */

public class Task_84 {
    public static void main(String[] args) {
        int end = (int) Math.pow(10, 7);
        int start = 9;
        int[] input = IntStream.range(start, end).toArray();
        int k = 30;
        findMinimumNumber(k, input);
    }

    private static void findMinimumNumber(int k, int[] input) {
        for (int j : input) {
            if (j < 10) continue;
            if (k == multiplyDigits(j)) {
                Utils.print("Find: " + j);
                break;
            }
        }
    }

    private static int multiplyDigits(int input) {
        int number = input;
        int resultOfMultiply = 1;

        while (number > 0) {
            int lastDigit = number % 10;
            resultOfMultiply = resultOfMultiply * lastDigit;
            number = number / 10;
        }
        return resultOfMultiply;
    }
}
