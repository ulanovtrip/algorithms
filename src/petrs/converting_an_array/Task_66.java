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
    private static final int size = 11;

    public static void main(String[] args) {
        IntegerArray A = new IntegerArray(size, band);
        A.generateRandom(1);
        A.print();
        Utils.newLine();
        createArrayB(A);
    }

    private static void createArrayB(IntegerArray A) {
        IntegerArray B = new IntegerArray(A.getSize(), band);
        int Bk = 0;

        if (A.getSize() == 0) {
            Utils.print("Input is empty!");
        }

        for (int i = 0; i < B.getSize(); i++) {
            Bk = Bk + A.getElement(i);
            B.setValue(i, Bk);
        }
        B.print();
    }
}
