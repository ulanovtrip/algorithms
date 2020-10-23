package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * В данном массиве каждый элемент равен 0, 1  или 2.
 * Переставить элементы массива так, чтобы сначала располагались все нули, затем все единицы и, наконец, все двойки.
 * Дополнительный массив не использовать.
 */

public class Task_78 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(40, 3);
        inputArray.generateRandom(0);
        inputArray.print();
        swap(inputArray);
        Utils.newLine();
    }

    private static void swap(IntegerArray inputArray) {
        int zeros = 0, ones = 0, twos = 0;
        for (int i = 0; i < inputArray.getSize(); i++) {
            switch (inputArray.getElement(i)) {
                case 0 -> zeros += 1;
                case 1 -> ones += 1;
                case 2 -> twos += 1;
            }
        }
        Utils.newLine();
        System.out.println("zeros: " + zeros + "; " + "ones: " + ones + "; " + "twos: " + twos);

        fillArray(inputArray, 0, zeros, 0);
        fillArray(inputArray, zeros, ones, 1);
        fillArray(inputArray, zeros + ones, twos, 2);
        inputArray.print();
    }

    private static void fillArray(IntegerArray inputArray, int startPos, int gap, int value) {
        for (int i = startPos; i < startPos + gap; i++) {
            inputArray.setValue(i, value);
        }
    }
}
