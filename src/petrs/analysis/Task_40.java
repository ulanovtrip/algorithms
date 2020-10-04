package petrs.analysis;

import petrs.RandomArray;
import petrs.Utils;

/**
 * В данном массиве найдите количество чисел, соседи у которых отличаются более чем в 2 раза.
 */

public class Task_40 {
    public static void main(String[] args) {
        RandomArray inputArray = new RandomArray(30, 23);
        inputArray.generate(1);
        inputArray.printIntArray();
        int countOfNumbers = 0;

        countOfNumbers = findCountNumbersNeighboursMoreThanTwice(inputArray, countOfNumbers);
        Utils.newLine();
        Utils.print("countOfNumbers = " + countOfNumbers);
    }

    private static int findCountNumbersNeighboursMoreThanTwice(RandomArray inputArray, int countOfNumbers) {
        for (int i = 1; i < inputArray.getSize() - 1; i++) {
            int leftNeighbour = Math.abs(inputArray.getElement(i - 1));
            int rightNeighbour = Math.abs(inputArray.getElement(i + 1));
            int squareOfCurrent = (int) Math.pow(inputArray.getElement(i), 2);
            if (leftNeighbour > squareOfCurrent && rightNeighbour > squareOfCurrent) {
                countOfNumbers++;
            }
        }
        return countOfNumbers;
    }
}
