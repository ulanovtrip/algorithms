package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Поменять местами наибольший и наименьший элементы массива.
 */

public class Task_58 {
    public static void main(String[] args) {
        IntegerArray integerArray = new IntegerArray(10, 13);
        integerArray.generateRandom(0);
        integerArray.print();
        Utils.newLine();
        swapMaxAndMin(integerArray);
    }

    private static void swapMaxAndMin(IntegerArray integerArray) {
        int min = integerArray.getElement(0);
        int indexOfMin = 0;
        int max = integerArray.getElement(0);
        int indexOfMax = 0;
        for (int i = 1; i < integerArray.getSize(); i++) {
            if (integerArray.getElement(i) < min) {
                min = integerArray.getElement(i);
                indexOfMin = i;
            }

            if (integerArray.getElement(i) > max) {
                max = integerArray.getElement(i);
                indexOfMax = i;
            }
        }

        System.out.println("min = " + min + "; max = " + max);

        int temp = integerArray.getElement(indexOfMin);
        integerArray.setValue(indexOfMin, max);
        integerArray.setValue(indexOfMax, temp);
        integerArray.print();
    }
}
