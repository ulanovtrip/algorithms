package petrs.analysis;

import petrs.RandomArray;
import petrs.Utils;

/**
 * Найдите количество чисел,
 * каждое из которых равно сумме квадратов своих соседей и при этом не является наибольшим в массиве.
 */

public class Task_41 {
    public static void main(String[] args) {
        RandomArray inputArray = new RandomArray(100000, 11);
        inputArray.generate(1);
        inputArray.printIntArray();
        int countOfNumbers = 0;

        countOfNumbers = findNumbersEqualsSumOfSquareNeighboursNotMax(inputArray, countOfNumbers);
        Utils.newLine();
        Utils.print("countOfNumbers = " + countOfNumbers);
    }

    private static int findNumbersEqualsSumOfSquareNeighboursNotMax(RandomArray inputArray, int countOfNumbers) {
        int maximum = -1;
        for (int i = 0; i < inputArray.getSize(); i++) {
            if(inputArray.getSize() == 0) {
                System.out.println("inputArray id empty!");
                break;
            }
            if (inputArray.getElement(i) > maximum) {
                maximum = inputArray.getElement(i);
            }
        }
        for (int i = 1; i < inputArray.getSize() - 1; i++) {
            int squareLeftNeighbour = (int) Math.pow(inputArray.getElement(i - 1), 2);
            int squareRightNeighbour = (int) Math.pow(inputArray.getElement(i + 1), 2);
            int sumOfSquareNeighbours = squareLeftNeighbour + squareRightNeighbour;
            if (inputArray.getElement(i) == sumOfSquareNeighbours && inputArray.getElement(i) < maximum) {
                countOfNumbers++;
            }
        }
        return countOfNumbers;
    }
}
