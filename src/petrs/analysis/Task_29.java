package petrs.analysis;

import petrs.RandomArray;

/**
 * Дан массив x из n элементов. Найдите X1 − X2 + X3 − … − Xn − 1 + Xn.
 */

public class Task_29 {
    public static void main(String[] args) {
        RandomArray array = new RandomArray(20, 13);
        array.generate();
        array.printArray();
    }
}
