package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.HashSet;
import java.util.Random;

/**
 * Дан массив из n элементов. Переставьте его элементы случайным образом.
 */

public class Task_77 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 13);
        inputArray.generateArithmeticProgression(3);
        inputArray.print();
        Utils.newLine();
        randomizer(inputArray);
    }

    private static void randomizer(IntegerArray inputArray) {
        HashSet<Integer> set = new HashSet<>();
        int[] outputArray = new int[inputArray.getSize()];
        Random random = new Random();

        for (int i = 0; i < inputArray.getSize(); i++) {
            set.add(i);
        }

        int count = 0;
        while (!set.isEmpty()) {
            Integer[] setOfFreeIndexes = set.toArray(new Integer[]{set.size()});
            int randomIndexFromSet = random.nextInt(setOfFreeIndexes.length);
            int indexForInsert = setOfFreeIndexes[randomIndexFromSet];
            outputArray[indexForInsert] = inputArray.getElement(count);
            set.remove(indexForInsert);
            count += 1;
            if (count == outputArray.length) break;
        }

        Utils.print("New random array: ");
        Utils.newLine();
        for (int j = 0; j < outputArray.length; j++) {
            System.out.print(outputArray[j] + "; ");
        }
    }
}
