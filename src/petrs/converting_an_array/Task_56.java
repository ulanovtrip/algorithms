package petrs.converting_an_array;

import petrs.Utils;

/**
 * В массиве заменить все числа, большие данного числа, на среднее арифметическое всех чисел массива.
 */

public class Task_56 {
    public static void main(String[] args) {
        int[] inputArray = {2, 5, 7, 1, 4, 9, 8, 3};
        int givenNum = 3;
        int average = 0;
        average = countAverage(inputArray, average);
        changeNumberOnAverage(inputArray, givenNum, average);
    }

    private static int countAverage(int[] inputArray, int average) {
        for (int i = 0; i < inputArray.length; i++) {
            average = average + inputArray[i];
        }
        return average;
    }

    private static void changeNumberOnAverage(int[] inputArray, int givenNumber, int average) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > givenNumber) {
                inputArray[i] = average;
            }
        }
        Utils.printArray("outputArray:", inputArray);
    }
}
