package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.Random;

/**
 * Дана упорядоченная последовательность An чисел от 1 до N.
 * Из копии данной последовательности Bn удалили одно число, а оставшиеся перемешали.
 * Найти удаленное число.
 */

public class Task_72 {
    public static void main(String[] args) {
        IntegerArray A = new IntegerArray(10, 9);
        A.generateRandom(1);
        A.sort();
        A.print();
        Utils.newLine();
        findDeletedNumber(A);
    }

    private static void findDeletedNumber(IntegerArray A) {
        Random random = new Random();
        IntegerArray B = new IntegerArray(A.getSize(), 7);

        if (A.getSize() == 0) {
            Utils.print("Input is empty!");
            return;
        }

        for (int i = 0; i < A.getSize(); i++) {
            B.setValue(i, A.getElement(i));
        }

        int randomIndexForDelete = random.nextInt(B.getSize() - 1);

        for (int i = 0; i < B.getSize(); i++) {
            if (i == randomIndexForDelete) {
                B.setValue(i, 0);
            }
        }
        B.print();
        Utils.newLine();
        int requiredNumber = sumOfElementArray(A) - sumOfElementArray(B);
        Utils.print("requiredNumber = " + requiredNumber);
    }

    private static int sumOfElementArray(IntegerArray A) {
        int sum = 0;
        for (int i = 0; i < A.getSize(); i++) {
            sum += A.getElement(i);
        }
        return sum;
    }
}
