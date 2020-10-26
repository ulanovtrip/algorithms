package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Осуществить поиск данного числа в упорядоченном по возрастанию массиве методом бинарного поиска.
 */

public class Task_80 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 13);
        inputArray.generateArithmeticProgression(3);
        inputArray.print();
        Utils.newLine();
        binarySearch(inputArray, 11);
    }

    private static void binarySearch(IntegerArray inputArray, int key) {
        int left = inputArray.getElement(0);
        int right = inputArray.getElement(inputArray.getSize() - 1);

        while (left + 1 < right) {
            int middle = (left + right) / 2;
            if (key < middle) {
                right = middle;
            } else {
                left = middle;
            }
        }
        System.out.println("index of x: " + inputArray.getIndex(left));
    }
}
