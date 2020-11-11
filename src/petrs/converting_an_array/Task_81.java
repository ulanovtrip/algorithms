package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Дан массив натуральных чисел.
 * Найти наименьшее натуральное число, не представимое суммой никаких элементов массива.
 * Сумма может состоять и из одного слагаемого, но каждый элемент массива может входить в нее только один раз.
 * https://www.cyberforum.ru/pascalabc-net/thread1728220.html
 */

public class Task_81 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 17);
        inputArray.generateRandom(1);
        inputArray.print();
        Utils.newLine();
        findMinNaturalNumber(inputArray);
    }

    private static void findMinNaturalNumber(IntegerArray inputArray) {
        inputArray.sort();
        inputArray.print();
        Utils.newLine();

        int s = 0;

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (inputArray.getElement(i) > s + 1) {
                System.out.println(s + 1);
                break;
            } else {
                s += inputArray.getElement(i);
            }
        }
        System.out.println(s + 1);
    }
}
