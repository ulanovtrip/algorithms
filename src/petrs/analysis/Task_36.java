package petrs.analysis;

import petrs.RandomArray;

import static petrs.Utils.newLine;
import static petrs.Utils.print;

/**
 * Среди элементов с нечетными номерами найдите наибольший элемент массива, который делится на 3.
 */

public class Task_36 {
    public static void main(String[] args) {
        RandomArray inputArray = new RandomArray(13, 33);
        inputArray.generate(1);
        inputArray.printIntArray();
        int biggestThatIsDivisibleBy3;
        biggestThatIsDivisibleBy3 = -1;

        biggestThatIsDivisibleBy3 = findBiggestThatIsDivisibleBy3(inputArray, biggestThatIsDivisibleBy3);
        newLine();
        print("biggestThatIsDivisibleBy3 = " + biggestThatIsDivisibleBy3);
    }

    private static int findBiggestThatIsDivisibleBy3(RandomArray inputArray, int biggestThatIsDivisibleBy3) {
        for (int i = 0; i < inputArray.getSize(); i++) {
            if (inputArray.getSize() == 0) {
                System.out.println("input array is Empty!");
            }
            if (i % 2 != 0 && inputArray.getElement(i) % 3 == 0) {
                if (inputArray.getElement(i) > biggestThatIsDivisibleBy3) {
                    biggestThatIsDivisibleBy3 = inputArray.getElement(i);
                }
            }
        }
        if (biggestThatIsDivisibleBy3 == -1) {
            newLine();
            System.out.println("The array doesn't contains multiples of three.");
        }
        return biggestThatIsDivisibleBy3;
    }
}
