package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * В данном массиве найти все нулевые элементы и заменить их вместе с соседними элементами на 3.
 */

public class Task_67 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 5);
        inputArray.generateRandom(0);
        //inputArray.arrayForTask_67();
        inputArray.print();
        Utils.newLine();
        replaceOnZero(inputArray);
    }

    private static void replaceOnZero(IntegerArray inputArray) {
        int hardCodeValue = 3;
        for (int i = 1; i < inputArray.getSize(); i++) {
            if (i == inputArray.getSize() - 1) {
                if (inputArray.getElement(inputArray.getSize() - 1) == 0) {
                    inputArray.setValue(inputArray.getSize() - 1, hardCodeValue);
                    inputArray.setValue(inputArray.getSize() - 2, hardCodeValue);
                }
            }
            if (inputArray.getElement(0) == 0) {
                inputArray.setValue(0, hardCodeValue);
                inputArray.setValue(1, hardCodeValue);
            }

            if (inputArray.getElement(i) == 0) {
                inputArray.setValue(i - 1, hardCodeValue);
                inputArray.setValue(i, hardCodeValue);
                inputArray.setValue(i + 1, hardCodeValue);
            }
        }
        inputArray.print();
    }
}
