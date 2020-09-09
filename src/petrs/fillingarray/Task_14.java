package petrs.fillingarray;

import java.util.*;

/**
 * Заполните массив случайным образом нулями и единицами так, чтобы количество единиц было больше количества нулей.
 */

public class Task_14 {
    public static void main(String[] args) {
        int sizeArray = 10;
        int[] outputArray = new int[sizeArray];
        HashSet<Integer> set = new HashSet<>();
        int ones = 0;
        int zeroes = 0;
        int emptyCells = 0;

        for (int i = 0; i < sizeArray; i++) {
            outputArray[i] = -1;
            set.add(i);
        }

        while (!set.isEmpty()) {

            Integer[] setOfIndex = set.toArray(new Integer[]{set.size()});

            int randomOneOreZero = (int) (0 + Math.random() * 2);
            if (randomOneOreZero == 1) {
                ones++;
            } else {
                zeroes++;
            }

            emptyCells = sizeArray - (ones + zeroes);

            int randomArrayCell = (int) (Math.random() * setOfIndex.length);
            int cell = setOfIndex[randomArrayCell];

            if (randomOneOreZero == 1) {
                outputArray[cell] = 1;
                set.remove(cell);
            } else {
                if (ones - zeroes + emptyCells == 2) {
                    outputArray[cell] = 1;
                    set.remove(cell);
                } else {
                    outputArray[cell] = 0;
                    set.remove(cell);
                }
            }

            if(ones > zeroes) break;
        }

        for (int i = 0; i < outputArray.length; i++) {
            if (i == outputArray.length - 1) {
                System.out.println(outputArray[i]);
            } else {
                System.out.print(outputArray[i] + " | ");
            }
        }
    }
}
