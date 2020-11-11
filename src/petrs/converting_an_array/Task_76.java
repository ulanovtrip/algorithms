package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Даны два массива.
 * Определите все серии подряд идущих элементов из первого массива (серия может состоять и из одного элемента),
 * каждая из которых совпадает с какой-нибудь серией подряд идущих элементов второго массива.
 */

public class Task_76 {
    public static void main(String[] args) {
        IntegerArray inputOne = new IntegerArray(20, 13);
        IntegerArray inputTwo = new IntegerArray(20, 13);
        inputOne.generateRandom(0);
        inputTwo.generateRandom(0);
        inputOne.print();
        Utils.newLine();
        inputTwo.print();
        Utils.newLine();
        findSequences(inputOne, inputTwo);
    }

    private static void findSequences(IntegerArray inputOne, IntegerArray inputTwo) {
        for (int i = 0; i < inputOne.getSize(); i++) {
            if(inputOne.getElement(i) == inputTwo.getElement(i)) {
                  Utils.print(inputOne.getElement(i) + "; ");
            }
        }
    }
}
