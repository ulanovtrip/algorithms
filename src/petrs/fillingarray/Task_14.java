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

            Integer[] setOfFreeIndexes = set.toArray(new Integer[]{set.size()});

            int randomOneOreZero = (int) (0 + Math.random() * 2);
            emptyCells = sizeArray - (ones + zeroes);

            //индекс ячейки множества в кот. хранится индекс ячейки массива куда кладём
            int randomSetCellIndex = (int) (Math.random() * setOfFreeIndexes.length);

            //индекс ячейки массива куда кладём
            int arrayCellIndex = setOfFreeIndexes[randomSetCellIndex];

            if (randomOneOreZero == 1) {
                outputArray[arrayCellIndex] = 1;
                set.remove(arrayCellIndex);
                ones++;
            } else {
                if (ones - zeroes + emptyCells == 2) {
                    fillFreeCellsWithOnes(outputArray, set);
                    break;
                } else {
                    outputArray[arrayCellIndex] = 0;
                    set.remove(arrayCellIndex);
                    zeroes++;
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

    //этим методом добиваем единицами
    private static void fillFreeCellsWithOnes(int[] array, HashSet<Integer> freeIndexes) {
        Integer[] arrayOfFreeIndexes = freeIndexes.toArray(new Integer[]{freeIndexes.size()});
        for (int i = 0; i < arrayOfFreeIndexes.length; i++) {
            array[arrayOfFreeIndexes[i]] = 1;
        }
    }
}
