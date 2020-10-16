package petrs.analysis;

import java.util.Arrays;

/**
 * В данном массиве найдите наибольшую серию подряд идущих элементов, расположенных по возрастанию.
 */

public class Task_53 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 8, 9, 10, 11, 13, 3, 4, 7, 8, 9};
        //int[] inputArray = {};
        if (inputArray.length == 0) {
            System.out.println("input is empty!");
        }
        findMaximumRiseSequence(inputArray);
    }

    private static void findMaximumRiseSequence(int[] inputArray) {
        int maximumOfNumbers = 0;
        int countOfNumbers = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i + 1] > inputArray[i]) {
                countOfNumbers += 1;
            } else {
                if (countOfNumbers > maximumOfNumbers) {
                    maximumOfNumbers = countOfNumbers;
                    countOfNumbers = 1;
                }
            }
        }
        if (countOfNumbers > maximumOfNumbers && countOfNumbers != 1) {
            maximumOfNumbers = countOfNumbers;
        }
        System.out.println("MaximumRiseSequence = " + maximumOfNumbers);
    }
}
