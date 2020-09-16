package petrs.analysis;

import petrs.RandomArray;

import static petrs.Utils.*;

/**
 * Найдите сумму наибольшего и наименьшего элементов массива.
 */

public class Task_33 {
    public static void main(String[] args) {

        int minimumOfArray = 0;
        int maximumOfArray = 0;
        int sumOfMinAndMax = 0;

        RandomArray array = new RandomArray(10, 27);
        array.generate(0);
        array.printIntArray();

        for (int i = 0; i < array.getSize(); i++) {
            if (array.getElement(i) > maximumOfArray) {
                maximumOfArray = array.getElement(i);
            }
            if (i == 0) {
                minimumOfArray = array.getElement(i);
            }
            if (array.getElement(i) < minimumOfArray) {
                minimumOfArray = array.getElement(i);
            }
        }
        sumOfMinAndMax = maximumOfArray + minimumOfArray;
        newLine();
        print("sumOfMinAndMax = " + sumOfMinAndMax);
        print("minimumOfArray = " + minimumOfArray);
        print("maximumOfArray = " + maximumOfArray);
    }
}
