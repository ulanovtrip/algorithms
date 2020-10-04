package petrs.analysis;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * В данном массиве найти максимальное количество одинаковых элементов.
 */

public class Task_47 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(9, 10);
        inputArray.generateRandomWithNegativeNumbers(1, 10);
        //inputArray.generateTask47();
        inputArray.print();
        Utils.newLine();
        int countOfNumbers = 0;
        countOfNumbers = countMaxCountOfEqualsElement(inputArray, countOfNumbers);
        Utils.newLine();
        System.out.println(countOfNumbers);
    }

    private static int countMaxCountOfEqualsElement(IntegerArray integerArray, int countOfNumbers) {
        int maximum = 1;
        int countOfFoundNumbers = 0;
        int nextStartPosition = 0;
        integerArray.sort();
        integerArray.print();
        int[] outArray = new int[integerArray.getSize()];

        for (int i = 0; i < integerArray.getSize(); i = nextStartPosition) {
            if (i + countOfFoundNumbers > integerArray.getSize() - 1) {
                maximum = countOfFoundNumbers;
                break;
            }
            countOfFoundNumbers = 1;
            for (int j = i + 1; j < integerArray.getSize(); j++) {
                if (integerArray.getElement(i) == integerArray.getElement(j)) {
                    countOfFoundNumbers++;
                }
                if (integerArray.getElement(i + countOfFoundNumbers) > integerArray.getElement(i)) {
                    nextStartPosition += countOfFoundNumbers;
                    if (countOfFoundNumbers > maximum) {
                        maximum = countOfFoundNumbers;
                        outArray[i] = maximum;
                        countOfFoundNumbers = 0;
                        break;
                    }
                    maximum = countOfFoundNumbers;
                    outArray[i] = maximum;
                    countOfFoundNumbers = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < outArray.length - 1; i++) {
            if (outArray[i] > maximum) {
                maximum = outArray[i];
            }
        }
        return maximum;
    }
}
