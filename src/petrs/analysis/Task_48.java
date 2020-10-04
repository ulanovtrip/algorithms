package petrs.analysis;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Найти наиболее часто встречающийся элемент в массиве целых чисел.
 */

public class Task_48 {
    public static void main(String[] args) {
        IntegerArray integerArray = new IntegerArray(8, 9);
        integerArray.generateRandom(1);
        integerArray.print();
        Utils.newLine();
        findMostCommonElement(integerArray);
    }

    private static void findMostCommonElement(IntegerArray integerArray) {
        int currentMaximum = 0;
        int repetitionsCurrentNumber = 0;
        int numberInMemory = 0;

        for (int i = 0; i < integerArray.getSize(); i++) {
            repetitionsCurrentNumber = 1;
            for (int j = i + 1; j < integerArray.getSize(); j++) {
                if (integerArray.getElement(i) == integerArray.getElement(j)) {
                    repetitionsCurrentNumber++;
                }
                if (repetitionsCurrentNumber > currentMaximum) {
                    currentMaximum = repetitionsCurrentNumber;
                    numberInMemory = integerArray.getElement(i);
                } else {
                    if (repetitionsCurrentNumber == currentMaximum) {
                        if (numberInMemory > integerArray.getElement(i)) {
                            continue;
                        } else {
                            numberInMemory = integerArray.getElement(i);
                        }
                    }
                }
            }
        }
        System.out.println(numberInMemory + " // " + currentMaximum);
    }
}
