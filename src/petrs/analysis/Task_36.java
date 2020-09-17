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
        int biggestThatIsDivisibleBy3 = -1;

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (i % 2 != 0 && inputArray.getElement(i) % 3 == 0) {
                if (inputArray.getElement(i) > biggestThatIsDivisibleBy3) {
                    biggestThatIsDivisibleBy3 = inputArray.getElement(i);
                }
            }
        }

        newLine();
        print("biggestThatIsDivisibleBy3 = " + biggestThatIsDivisibleBy3);
    }
}
