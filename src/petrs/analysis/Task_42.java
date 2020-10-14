package petrs.analysis;

import petrs.RandomArray;
import petrs.Utils;

import static petrs.Utils.newLine;

/**
 * Проверьте, содержит ли данный массив из N чисел, все числа от 1 до N.
 */

public class Task_42 {
    public static void main(String[] args) {
        int N = 10;
        RandomArray inputArray = new RandomArray(N, 10);
        //генерится рандом
        inputArray.generate(0);

        //генерится для проверки арифметическая от 0 до N
        //inputArray.generateSorted();

        //соритирую рандом
        inputArray.sort();
        inputArray.printIntArray();
        newLine();

        isContainsFromZeroToN(inputArray);
    }

    private static boolean isContainsFromZeroToN(RandomArray inputArray) {
        if (inputArray.isEmpty()) {
            System.out.println("input array is empty!");
            return false;
        }
        for (int i = 0; i < inputArray.getSize(); i++) {

            if (i == inputArray.getElement(i)) {
                continue;
            } else {
                System.out.println("Fail");
                return false;
            }
        }
        System.out.println("Success");
        return true;
    }
}
