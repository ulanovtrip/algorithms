package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Дан массив.
 * Осуществите циклический сдвиг массив на k единиц вправо,
 * если первый наименьший элемент массива расположен раньше последнего наибольшего элемента массива,
 * и влево, если иначе.
 * https://devenergy.ru/archives/614
 */

public class Task_70 {
    public static void main(String[] args) {
        int k = 2;
        IntegerArray inputArray = new IntegerArray(5, 13);
        inputArray.generateRandom(1);
        inputArray.print();
        Utils.newLine();
        findMaximumAndMinimumAndRotate(inputArray, k);
    }

    private static void findMaximumAndMinimumAndRotate(IntegerArray inputArray, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (inputArray.getElement(i) > max) {
                max = inputArray.getElement(i);
            }

            if (inputArray.getElement(i) < min) {
                min = inputArray.getElement(i);
            }
        }

        Utils.print("max = " + max);
        Utils.print("min = " + min);

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (inputArray.getElement(i) == min) {
                cyclicShiftRight(inputArray, k);
                break;
            }
            if (inputArray.getElement(i) == max) {
                cyclicShiftLeft(inputArray, k);
                break;
            }
        }
    }

    private static void cyclicShiftRight(IntegerArray inputArray, int k) {
        //слева направо
        for (int i = 0; i < k; i++) {
            int buffer = inputArray.getElement(inputArray.getSize() - 1);
            inputArray.setValue(inputArray.getSize() - 1, inputArray.getElement(0));
            for (int j = 1; j < inputArray.getSize() - 1; j++) {
                inputArray.setValue(j - 1, inputArray.getElement(j));
            }
            inputArray.setValue(inputArray.getSize() - 2, buffer);
        }
        inputArray.print();
    }

    private static void cyclicShiftLeft(IntegerArray inputArray, int k) {
        // справа налево при отрицательном
        for (int i = 0; i < k; i++) {
            int buffer = inputArray.getElement(0);
            inputArray.setValue(0, inputArray.getElement(inputArray.getSize() - 1));

            for (int j = 1; j < inputArray.getSize() - 1; j++) {
                inputArray.setValue(inputArray.getSize() - j, inputArray.getElement(inputArray.getSize() - j - 1));
            }
            inputArray.setValue(1, buffer);
        }
        inputArray.print();
    }
}
