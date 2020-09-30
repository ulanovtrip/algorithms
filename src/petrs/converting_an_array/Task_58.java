package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.Arrays;

/**
 * Поменять местами наибольший и наименьший элементы массива.
 */

public class Task_58 {
    public static void main(String[] args) {
        IntegerArray integerArray = new IntegerArray(10, 13);
        integerArray.generateRandom(0);
        integerArray.print();
        Utils.newLine();
        int min = findMin(integerArray);
        int max = findMax(integerArray);
        changeLastAndFirst(integerArray, min, max);
    }

    private static void changeLastAndFirst(IntegerArray integerArray, int min, int max) {
        for (int i = 0; i < integerArray.getSize(); i++) {
            if (integerArray.getElement(i) == min) {
                integerArray.setValue(i, max);
                break;
            }
        }

        for (int i = 0; i < integerArray.getSize(); i++) {
            if (integerArray.getElement(i) == max) {
                integerArray.setValue(i, min);
                break;
            }
        }
        integerArray.print();
    }

    private static int findMin(IntegerArray integerArray) {
        Integer[] tempArray = new Integer[integerArray.getSize()];
        for (int i = 0; i < integerArray.getSize(); i++) {
            tempArray[i] = integerArray.getElement(i);
        }
        Arrays.sort(tempArray);
        return tempArray[0];
    }

    private static int findMax(IntegerArray integerArray) {
        Integer[] tempArray = new Integer[integerArray.getSize()];
        for (int i = 0; i < integerArray.getSize(); i++) {
            tempArray[i] = integerArray.getElement(i);
        }
        Arrays.sort(tempArray);
        return tempArray[tempArray.length - 1];
    }
}
