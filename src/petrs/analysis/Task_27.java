package petrs.analysis;

import petrs.RandomArray;

/**
 * Найдите сумму чисел массива, которые стоят на четных местах.
 */

public class Task_27 {
    public static void main(String[] args) {

        int sumOfEvenNum = 0;

        RandomArray array = new RandomArray(20, 10);
        array.generate(0);
        array.printIntArray();

        for (int i = 0; i < array.getSize(); i++) {
            if (i % 2 == 0) {
                sumOfEvenNum = array.getElement(i) + sumOfEvenNum;
            }
        }
        System.out.println();
        System.out.println("sumOfEvenNum = " + sumOfEvenNum);
    }
}
