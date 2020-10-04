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
        countOfNumbers = countMaxCountOfEqualsElement(inputArray);
        Utils.newLine();
        System.out.println(countOfNumbers);
    }

    private static int countMaxCountOfEqualsElement(IntegerArray integerArray) {
        integerArray.sort();
        int startElement = integerArray.getElement(0);
        int countOfFindNumbers = 1;
        int maxValueNumbers = 0;

        for (int i = 1; i < integerArray.getSize(); i++) {
            int currentElement = integerArray.getElement(i);

            if (currentElement == startElement) {
                countOfFindNumbers += 1;
            } else {
                if (maxValueNumbers < countOfFindNumbers) {
                    maxValueNumbers = countOfFindNumbers;
                } else {
                    countOfFindNumbers = 1;
                    startElement = currentElement;
                }
            }
        }
        if (maxValueNumbers < countOfFindNumbers) {
            maxValueNumbers = countOfFindNumbers;
        }
        return maxValueNumbers;
    }
}
