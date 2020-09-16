package petrs.analysis;

import petrs.RandomArray;

import static petrs.Utils.*;

/**
 * Найдите количество элементов массива, которые отличны от наибольшего элемента не более чем на 10%.
 */

public class Task_34 {
    public static void main(String[] args) {

        double maximumOfArray = 0.0;
        int countNumMoreThan10Percents = 0;
        double tenPercentOfMaximum;

        RandomArray arrayDouble = new RandomArray(20, 20);
        arrayDouble.generateDouble(0.0, 10.0);
        newLine();

        for (int i = 0; i < arrayDouble.getSizeDoubleArray(); i++) {
            if(arrayDouble.getElementFromDoubleArray(i) > maximumOfArray) {
                maximumOfArray = arrayDouble.getElementFromDoubleArray(i);
            }
        }

        tenPercentOfMaximum = (maximumOfArray * 10.0) / 100.0;

        for (int i = 0; i < arrayDouble.getSizeDoubleArray(); i++) {
            if(Math.abs(arrayDouble.getElementFromDoubleArray(i)) <= tenPercentOfMaximum) {
                countNumMoreThan10Percents++;
            }
        }

        arrayDouble.printDoubleArray();
        newLine();
        print("countNumMoreThan10Percents = " + countNumMoreThan10Percents);
    }
}

