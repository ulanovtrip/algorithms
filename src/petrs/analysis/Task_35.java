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
        int smallestEvenElement = inputArray.getElement(0);
        smallestEvenElement = searchMaxOfEven(inputArray, smallestEvenElement);
        newLine();
        printSmallestEvenElement(inputArray, smallestEvenElement);
    }

    private static int searchMaxOfEven(RandomArray inputArray, int smallestEvenElement) {
        for (int i = 1; i < inputArray.getSize(); i++) {
            if (inputArray.getSize() == 0) {
                System.out.println("Array is Empty!");
                break;
            }
            if (inputArray.getElement(i) % 2 == 0) {
                if (inputArray.getElement(i) < smallestEvenElement) {
                    smallestEvenElement = inputArray.getElement(i);
                }
            }
        }
        return smallestEvenElement;
    }

    private static void printSmallestEvenElement(RandomArray inputArray, int smallestEvenElement) {
        if (smallestEvenElement == inputArray.getElement(0)) {
            System.out.println("Array consist only odd elements");
        } else {
            newLine();
            print("smallestEvenElement= " + smallestEvenElement);
        }
    }
}
