package petrs.converting_an_array;

import edu.princeton.cs.algs4.In;
import petrs.IntegerArray;
import petrs.Utils;

/**
 * Дан массив A из n элементов.
 * Сформировать новый массив B такого же размера так,
 * что элемент Bk равен сумме первых элементов массива A до номера k включительно.
 */

public class Task_66 {
    private static final int band = 10;
    private static final int size = 10;

    public static void main(String[] args) {
        IntegerArray A = new IntegerArray(size, band);
        A.generateRandom(1);
        A.print();
        Utils.newLine();
        createArrayB(A);
    }

    private static void createArrayB(IntegerArray A) {
        IntegerArray B = new IntegerArray(A.getSize(), band);
        for (int i = 0; i < B.getSize(); i++) {
            int bk = sumOfFirstNElemArrayA(A, i);
            B.setValue(i, bk);
        }
        B.print();
    }

    private static int sumOfFirstNElemArrayA(IntegerArray A, int steps) {
        int sumOfElement = 0;
        for (int i = 0; i <= steps; i++) {
            sumOfElement = sumOfElement + A.getElement(i);
        }
        return sumOfElement;
    }
}
