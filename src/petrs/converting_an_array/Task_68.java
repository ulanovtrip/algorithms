package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Преобразовать массив таким образом, чтобы сначала располагались все элементы,
 * модуль которых не превышает единицу, а потом – все остальные.
 */

public class Task_68 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(20, 7);
        inputArray.generateRandom(-2);
        inputArray.print();
        Utils.newLine();
        transformation(inputArray);
    }

    private static void transformation(IntegerArray inputArray) {
        IntegerArray outputArray = new IntegerArray(inputArray.getSize(), 7);
        int countOfNumbers = -1;

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (Math.abs(inputArray.getElement(i)) <= 1 && inputArray.getElement(i) != 0) {
                countOfNumbers += 1;
                outputArray.setValue(countOfNumbers, inputArray.getElement(i));
                continue;
            }
        }

        for (int i = countOfNumbers; i < outputArray.getSize(); i++) {
            if (Math.abs(inputArray.getElement(i)) > 1)
                outputArray.setValue(i, inputArray.getElement(i));
        }

        outputArray.print();
    }
}
