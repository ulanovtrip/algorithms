package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Удалить в массиве первый и последний элементы.
 */

public class Task_61 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 10);
        inputArray.generateRandom(1);
        inputArray.print();
        Utils.newLine();
        deleteFirstAndLastElements(inputArray);
        System.gc();
    }

    private static void deleteFirstAndLastElements(IntegerArray inputArray) {
        IntegerArray outputArray = new IntegerArray(inputArray.getSize() - 2, 10);
        for (int i = 0; i < outputArray.getSize(); i++) {
            if(i == inputArray.getSize() - 1) break;
            outputArray.setValue(i, inputArray.getElement(i + 1));
        }
        outputArray.print();
    }
}
