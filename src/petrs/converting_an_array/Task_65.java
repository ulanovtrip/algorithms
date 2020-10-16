package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Переставить элементы массива в обратном порядке.
 */

public class Task_65 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(17, 13);
        inputArray.generateRandom(0);
        inputArray.print();
        Utils.newLine();
        reverseArray(inputArray);
    }

    private static void reverseArray(IntegerArray inputArray) {
        if (inputArray.getSize() == 0) {
            Utils.print("Input is empty!");
            return;
        }
        for (int i = 0; i < inputArray.getSize() / 2; i++) {
            int temp = inputArray.getElement(i);
            inputArray.setValue(i, inputArray.getElement(inputArray.getSize() - 1 - i));
            inputArray.setValue(inputArray.getSize() - 1 - i, temp);
        }
        inputArray.print();
    }
}
