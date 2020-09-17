package petrs.analysis;

import petrs.RandomArray;

import static petrs.Utils.newLine;
import static petrs.Utils.print;

/**
 * Найдите наименьший четный элемент массива.
 */

public class Task_35 {
    public static void main(String[] args) {
        RandomArray inputArray = new RandomArray(20, 13);
        inputArray.generate(1);
        inputArray.printIntArray();

        int smallestEvenElement = 0;

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (i == 0) smallestEvenElement = inputArray.getElement(i);
            if (i % 2 == 0) {
                if (inputArray.getElement(i) < smallestEvenElement) {
                    smallestEvenElement = inputArray.getElement(i);
                }
            }
        }
        newLine();
        print("smallestEvenElement= " + smallestEvenElement);
    }
}
