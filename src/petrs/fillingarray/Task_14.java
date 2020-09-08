package petrs.fillingarray;

import java.util.*;

/**
 * Заполните массив случайным образом нулями и единицами так, чтобы количество единиц было больше количества нулей.
 */

public class Task_14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sizeArray = 10;
        int[] outputArray = new int[sizeArray];
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int ones = 0;
        int zeroes = 0;
        int emptyCells = 0;

        for (int i = 0; i < sizeArray; i++) {
            outputArray[i] = -1;
            set.add(i);
        }

        while (!(zeroes > ones)) {

            Integer[] setOfIndex = set.toArray(new Integer[]{set.size()});

            int randomOneOreZero = (int) (0 + Math.random() * 2);
            if (randomOneOreZero == 1) {
                ones++;
            } else {
                zeroes++;
            }

            emptyCells = sizeArray - (ones + zeroes);

            int randomArrayCell = rand.nextInt(set.size());

            if (randomOneOreZero == 1) {
                outputArray[randomArrayCell] = 1;
                set.remove(randomArrayCell);
            } else {
                if (ones - zeroes + emptyCells == 2) {
                    outputArray[randomArrayCell] = 1;
                    set.remove(randomArrayCell);
                } else {
                    outputArray[randomArrayCell] = 0;
                    set.remove(randomArrayCell);
                }
            }
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
