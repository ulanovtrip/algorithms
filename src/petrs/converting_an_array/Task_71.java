package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Даны два массива.
 * Определите, существуют ли в первом массиве такие два элемента,
 * что их сумма равна сумме каких-либо трех элементов второго массива.
 */

public class Task_71 {
    public static void main(String[] args) {
        IntegerArray inputArray1 = new IntegerArray(6, 10);
        IntegerArray inputArray2 = new IntegerArray(6, 10);
        inputArray1.generateRandom(1);
        inputArray2.generateRandom(1);
        inputArray1.print();
        Utils.newLine();
        inputArray2.print();
        Utils.newLine();
        checkTwoElements(inputArray1, inputArray2);
    }

    private static void checkTwoElements(IntegerArray inputArray1, IntegerArray integerArray2) {
        int sumOfTwos;
        int sumOfTriplets;
        int countOfFoundPairs = 0;

        for (int i = 0; i < inputArray1.getSize() - 1; i++) {
            if (countOfFoundPairs >= 1) {
                break;
            }
            sumOfTwos = inputArray1.getElement(i) + inputArray1.getElement(i + 1);
            for (int j = 0; j < inputArray1.getSize() - 2; j++) {
                sumOfTriplets =
                        integerArray2.getElement(j) + integerArray2.getElement(j + 1) + integerArray2.getElement(j + 2);
                if (sumOfTwos == sumOfTriplets) {
                    countOfFoundPairs += 1;
                    Utils.print("Found!!!");
                    break;
                }
            }
        }
        if (countOfFoundPairs == 0) {
            Utils.print("Not Found!");
        }
    }
}
