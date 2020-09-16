package petrs.analysis;

import petrs.RandomArray;

import static petrs.Utils.*;

/**
 * Дан массив x из n элементов. Найдите X1 − X2 + X3 − … − Xn − 1 + Xn.
 * сумма элементов на чётных позициях - сумма элементов на нечётных.
 */

public class Task_29 {
    public static void main(String[] args) {

        int sumOfOddsPositions = 0;
        int sumOfEvenPositions = 0;
        RandomArray array = new RandomArray(20, 13);
        array.generate(0);
        array.printIntArray();

        for (int i = 1; i < array.getSize(); i++) {
            if (i % 2 != 0) {
                sumOfOddsPositions = sumOfOddsPositions + array.getElement(i);
            } else {
                sumOfEvenPositions = sumOfEvenPositions + array.getElement(i);
            }
        }

        newLine();
        print("sumOfOddsPositions = " + sumOfOddsPositions);
        print("sumOfEvenPositions = " + sumOfEvenPositions);
    }
}
