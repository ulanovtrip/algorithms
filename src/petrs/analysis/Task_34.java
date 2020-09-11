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

        RandomArray arrayDouble = new RandomArray(10, 10);
        arrayDouble.generateDouble();
        newLine();

        for (int i = 0; i < arrayDouble.getSize(); i++) {
            if (arrayDouble.getElement(i) > maximumOfArray) {
                maximumOfArray = arrayDouble.getElement(i);
            }
        }

        tenPercentOfMaximum = (maximumOfArray * 10) / 100;

        for (int i = 0; i < arrayDouble.getSize(); i++) {
            if (maximumOfArray - arrayDouble.getElement(i) > tenPercentOfMaximum ||
                    maximumOfArray - arrayDouble.getElement(i) < tenPercentOfMaximum) {
                continue;
            } else {
                countNumMoreThan10Percents += 1;
            }
        }

        print("countNumMoreThan10Percents = " + countNumMoreThan10Percents);
    }
}

