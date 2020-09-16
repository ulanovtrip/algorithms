package petrs.analysis;

import petrs.RandomArray;
import static petrs.Utils.*;

/**
 * Дан массив x из n элементов. Найдите x1xn+x2xn−1+…+xnx1.
 * Левые множитель - i элемент массива. Второй множитель можно получить на основе размера n и текущего индекса i
 * Первое произведение это первый элемент * на последний. Второе - второй элемент * на предпоследний
 */

public class Task_30 {
    public static void main(String[] args) {
        RandomArray array = new RandomArray(10, 13);
        array.generate(1);
        array.printIntArray();
        newLine();
        int sumOfProducts = 0;
        int N = array.getSize();

        for (int i = 0, j = 1; i < array.getSize(); i++, j++) {
            sumOfProducts = sumOfProducts + array.getElement(i) * array.getElement(N - j);
            print("step " + i + " = " + sumOfProducts);
        }
        newLine();
        print("sumOfProducts = " + sumOfProducts);
    }
}
