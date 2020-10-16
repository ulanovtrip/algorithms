package petrs.converting_an_array;

import petrs.Array;
import petrs.IntegerArray;
import petrs.Utils;

import java.util.ArrayList;

/**
 * Удалить в массиве все наибольшие элементы.
 */

public class Task_64 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 13);
        inputArray.generateRandom(1);
        inputArray.print();
        Utils.newLine();
        deleteAllMaximums(inputArray);
    }

    private static void deleteAllMaximums(IntegerArray inputArray) {
        ArrayList<Integer> outputList = new ArrayList<>();
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.getSize(); i++) {
            if (inputArray.getSize() == 0) break;
            if (inputArray.getElement(i) > maximum) {
                maximum = inputArray.getElement(i);
            }
        }
        for (int i = 0; i < inputArray.getSize(); i++) {
            if (inputArray.getElement(i) == maximum) {
                continue;
            } else {
                outputList.add(inputArray.getElement(i));
            }
        }

        Utils.print("Without maximums: ");
        for (Integer number : outputList) {
            System.out.print(number + "; ");
        }
    }
}
