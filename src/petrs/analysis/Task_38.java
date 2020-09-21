package petrs.analysis;

import petrs.RandomArray;

import static petrs.Utils.newLine;
import static petrs.Utils.print;

/**
 * Дан массив. Найдите два соседних элемента, сумма которых минимальна.
 */

public class Task_38 {
    public static void main(String[] args) {
        RandomArray inputArray = new RandomArray(10, 13);
        inputArray.generate(1);
        inputArray.printIntArray();
        int index1 = 0;
        int index2 = 1;
        int minSumOfCloseElem = Math.abs(inputArray.getElement(index1) + inputArray.getElement(index2));

        for (int i = 1, j = i + 1; i < inputArray.getSize(); i++) {
            int newSum = inputArray.getElement(i) + inputArray.getElement(j);
            if (newSum <= minSumOfCloseElem) {
                index1 = i;
                index2 = j;
                minSumOfCloseElem = newSum;
            }
        }

        newLine();
        print("firstElem = " + inputArray.getElement(index1) + " // " + "second = " + inputArray.getElement(index2));
    }
}
