package petrs.converting_an_array;

import petrs.Utils;

/**
 * Дан массив. Заменить все числа, меньшие последнего элемента массива, на первый элемент.
 */

public class Task_57 {
    public static void main(String[] args) {
        int[] inputArray = {2, 5, 7, 1, 4, 9, 8, 5};
        changeElement(inputArray);
    }

    private static void changeElement(int[] inputArray) {
        int first = inputArray[0];
        int last = inputArray[inputArray.length - 1];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < last) {
                inputArray[i] = first;
            }
        }
        Utils.printArray("inputArray", inputArray);
    }
}