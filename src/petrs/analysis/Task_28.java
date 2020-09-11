package petrs.analysis;

import petrs.RandomArray;
import static petrs.Utils.*;

/**
 * Найдите сумму чисел массива, которые стоят на нечетных местах и при этом превосходят сумму крайних элементов массива.
 */

public class Task_28 {
    public static void main(String[] args) {

        int sumOfOddNum = 0;
        int sumOfFirstAndLastElem;

        RandomArray array = new RandomArray(20, 15);
        array.generate();
        sumOfFirstAndLastElem = array.getElement(0) + array.getElement(array.getSize() - 1);

        for (int i = 0; i < array.getSize(); i++) {
            if (i % 2 != 0) {
                if (array.getElement(i) > sumOfFirstAndLastElem) {
                    sumOfOddNum = array.getElement(i) + sumOfOddNum;
                }
            }
        }
        array.printArray();
        newLine();
        print("sumOfFirstAndLastElem = " + sumOfFirstAndLastElem);
        print("sumOfOddNum = " + sumOfOddNum);

    }
}
