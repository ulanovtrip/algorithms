package petrs.fillingarray;

/**
 * Заполните массив случайным образом нулями, единицами и двойками так, чтобы первая двойка в массиве встречалась
 * раньше первой единицы, количество единиц было в точности равно суммарному количеству нулей и двоек.
 */

public class Task_17 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int zeros = 0;
        int twos = 0;
        int ones = 0;

        int randomPosition = (int) (1 + Math.random() * 19) / 2;
        array[randomPosition] = 2;
        twos++;
        array[randomPosition + 1] = 1;
        ones++;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2 && array[i + 1] == 1) {
                continue;
            } else {
                int randomPosition2 = (int) (1 + Math.random() * 19);
                array[randomPosition2] = 1;
                ones++;
            }
        }
    }
}
