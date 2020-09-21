package petrs.fillingarray;

import java.util.HashSet;
import java.util.Random;

/**
 * Сформировать массив из случайных целых чисел от 0 до 9 , в котором единиц от 3 до 5 и двоек больше троек.
 */

public class Task_15 {
    public static void main(String[] args) {
        Integer[] arrayOfFreeIndex;
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        int treeOreFour = 3 + random.nextInt(2);
        int[] outputArray = new int[15];
        int twos = 0;
        int threes = 0;
        int emptyCells;

        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = -1;
            set.add(i);
        }

        for (int i = 0; i < treeOreFour; i++) {
            //тут каждую итерацию создаётся новый массив из set
            arrayOfFreeIndex = set.toArray(new Integer[]{set.size()});
            //выбираем рандомную позицию из нового массива
            int randomIndexes = random.nextInt(arrayOfFreeIndex.length);
            //достаём под индексом содержимое массива, кот. получилось после удаления из set элемента
            int randomCellIndex = arrayOfFreeIndex[randomIndexes];
            outputArray[randomCellIndex] = 1;
            //убираем из set номер ячейки, куда уже положена 1
            set.remove(randomCellIndex);
        }

        while (!set.isEmpty()) {
            arrayOfFreeIndex = set.toArray(new Integer[]{set.size()});
            int randomNumber = 2 + random.nextInt(7);
            int randomIndexes = random.nextInt(arrayOfFreeIndex.length);
            int randomCellIndex = arrayOfFreeIndex[randomIndexes];
            emptyCells = (arrayOfFreeIndex.length - 1) - (twos + threes);

            if (randomNumber == 2) {
                outputArray[randomCellIndex] = 2;
                set.remove(randomCellIndex);
                twos++;
            } else {
                if (randomNumber == 3) threes++;
                if (twos - threes + emptyCells < 0) {
                    Integer[] arrayOfFreeIndexes = set.toArray(new Integer[]{set.size()});
                    for (int i = 0; i < arrayOfFreeIndexes.length; i++) {
                        outputArray[arrayOfFreeIndexes[i]] = 2;
                    }
                } else {
                    outputArray[randomCellIndex] = randomNumber;
                    set.remove(randomCellIndex);
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
