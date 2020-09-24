package petrs.analysis;

import petrs.IntegerArray;
import petrs.Utils;
import java.util.HashSet;
import java.util.Set;

/**
 * Найдите количество различных элементов данного массива.
 */

public class Task_45 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(7, 13);
        inputArray.generateRandom(0);
        inputArray.print();
        Utils.newLine();
        System.out.println(findValueDifferentElements(inputArray));
    }

    private static int findValueDifferentElements(IntegerArray integerArray) {
        Set<Integer> integerSet = new HashSet<>();
        int[] arr = new int[integerArray.getSize()];

        for (int i = 0; i < integerArray.getSize(); i++) {
            arr[i] = integerArray.getElement(i);
        }

        for (int x : arr) {
            integerSet.add(x);
        }
        return integerSet.size();
    }
}
