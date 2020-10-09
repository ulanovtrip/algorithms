package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Удалить в массиве все числа, которые повторяются более двух раз.
 */

public class Task_62 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 10);
        inputArray.generateRandom(1);
        inputArray.print();
        Utils.newLine();
        deleteRepeatingMoreThanTwice(inputArray);
    }

    private static void deleteRepeatingMoreThanTwice(IntegerArray inputArray) {
        List<Integer> output = new ArrayList<>();
        Utils.print("Sort array: ");
        inputArray.sort();
        inputArray.print();
        int count = 1;

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (i + count >= inputArray.getSize()) break;
            int currentNumber = inputArray.getElement(i);
            if (currentNumber == inputArray.getElement(i + 1)) {
                count += 1;
            } else {
                if (count == 1) {
                    output.add(currentNumber);
                }
                count = 1;
            }
        }

        Utils.newLine();
        Utils.print("New Array: ");
        for (int num : output) {
            System.out.print(" - " + num);
        }
    }
}
