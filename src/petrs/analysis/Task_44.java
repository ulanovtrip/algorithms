package petrs.analysis;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Проверьте, является ли данный массив возрастающим или убывающим.
 */

public class Task_44 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(5, 10);
        inputArray.generateDecreasingArray(1);
        inputArray.print();
        Utils.newLine();
        System.out.println(checkDecreasing(inputArray));
        inputArray.generateArithmeticProgression(1);
        inputArray.print();
        Utils.newLine();
        System.out.println(checkIncreasing(inputArray));
    }

    private static boolean checkDecreasing(IntegerArray integerArray) {
        for (int i = 0; i < integerArray.getSize() - 1; i++) {
            if (integerArray.getElement(i) < integerArray.getElement(i + 1)) {
                continue;
            }
            if (i == integerArray.getSize() - 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIncreasing(IntegerArray integerArray) {
        for (int i = 0; i < integerArray.getSize() - 1; i++) {
            if (integerArray.getElement(i) > integerArray.getElement(i + 1)) {
                continue;
            }
            if (i == integerArray.getSize() - 2) {
                return true;
            }
        }
        return false;
    }
}
