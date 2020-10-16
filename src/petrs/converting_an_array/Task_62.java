package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Integer> set = new HashSet<>();
        IntegerArray copyOfInput = new IntegerArray(inputArray.getSize(), 10);

        for (int i = 0; i < inputArray.getSize(); i++) {
            copyOfInput.setValue(i, inputArray.getElement(i));
        }

        Utils.print("Sort array: ");
        inputArray.sort();
        inputArray.print();

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (i == inputArray.getSize() - 1) break;
            int currentNumber = inputArray.getElement(i);
            if (currentNumber == inputArray.getElement(i + 1)) {
                set.add(inputArray.getElement(i));
            }
        }

        Utils.newLine();
        Utils.print("New Array: ");
        for (int i = 0; i < copyOfInput.getSize(); i++) {
            if (set.contains(copyOfInput.getElement(i))) {
                continue;
            } else {
                System.out.print(copyOfInput.getElement(i) + "; ");
            }
        }
    }
}
