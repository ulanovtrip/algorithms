package petrs.analysis;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Определите количество перемен знаков элементов массива.
 */

public class Task_46 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 13);
        inputArray.generateRandomWithNegativeNumbers(-10, 10);
        inputArray.print();
        Utils.newLine();
        int countHowManyTimesChangedSign = 0;
        countHowManyTimesChangedSign = countChangesOfSign(inputArray, countHowManyTimesChangedSign);
        System.out.println(countHowManyTimesChangedSign);
    }

    private static int countChangesOfSign(IntegerArray integerArray, int countHowManyTimesChangedSign) {
        for (int i = 0; i < integerArray.getSize() - 1; i++) {
            if (integerArray.getElement(i) > 0 && integerArray.getElement(i + 1) < 0) {
                countHowManyTimesChangedSign++;
            }

            if (integerArray.getElement(i) < 0 && integerArray.getElement(i + 1) > 0) {
                countHowManyTimesChangedSign++;
            }
        }
        return countHowManyTimesChangedSign;
    }
}
