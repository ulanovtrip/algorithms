package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Найти наибольший четный элемент массива и поменять его местами с наименьшим нечетным элементом.
 * Если одного из таких элементов нет, то всем элементам массива присвоить значение, равное нулю.
 */

public class Task_59 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 10);
        inputArray.generateRandom(1);
        inputArray.print();
        Utils.newLine();
        //inputArray.arrayForTask59();
        swapMaxEvenAndMinOdd(inputArray);
    }

    private static void swapMaxEvenAndMinOdd(IntegerArray inputArray) {
        int maxEven = -1;
        int maxEvenIndex = 0;
        int minOdd = inputArray.getElement(1);
        int minOddIndex = 1;

        for (int i = 0; i < inputArray.getSize(); i++) {
            int currentTakingElement = inputArray.getElement(i);
            if ((i % 2 == 0) && currentTakingElement > maxEven) {
                maxEven = inputArray.getElement(i);
                maxEvenIndex = i;
            } else {
                if (i % 2 != 0 && inputArray.getElement(i) < minOdd) {
                    minOdd = inputArray.getElement(i);
                    minOddIndex = i;
                }
            }
        }

        if (maxEvenIndex == 0 || minOddIndex == 1) {
            for (int i = 0; i < inputArray.getSize(); i++) {
                inputArray.setValue(i, 0);
            }
        } else {
            System.out.println("maxEven = " + maxEven + " || " + "minOdd = " + minOdd);
            System.out.println("maxEvenIndex = " + maxEvenIndex + " || " + "minOddIndex = " + minOddIndex);
            int temp = inputArray.getElement(maxEvenIndex);
            inputArray.setValue(maxEvenIndex, inputArray.getElement(minOddIndex));
            inputArray.setValue(minOddIndex, temp);
        }
        inputArray.print();
    }
}
