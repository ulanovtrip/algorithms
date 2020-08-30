package petrs;

/**
 * Заполнить массив заданной длины различными простыми числами.
 * Натуральное число, большее единицы, называется простым, если оно делится только на себя и на единицу.
 * Нужно решето Эротосфена.
 * https://habr.com/ru/post/333350/
 *
 */

public class Task_8 {
    public static void main(String[] args) {
        int length = 998;
        int p = 2;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = i + 2;
        }

        int flag = -1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array[j] = flag;
            }
        }
    }
}
