package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Заменить каждый элемент массива с четным номером на соседний слева элемент.
 */

public class Task_60 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 10);
        inputArray.generateRandom(1);
        inputArray.print();
        swapEachEvenElementOnNeighbourLeft(inputArray);
    }

    private static void swapEachEvenElementOnNeighbourLeft(IntegerArray inputArray) {
        if (inputArray.getSize() == 0) {
            System.out.println("Array is empty!");
            return;
        }
        for (int i = 2; i < inputArray.getSize(); i++) {


            if (i % 2 == 0) {
                inputArray.setValue(i, inputArray.getElement(i - 1));
            }
        }
        Utils.newLine();
        inputArray.print();
    }
}
