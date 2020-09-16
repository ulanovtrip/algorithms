package petrs.analysis;

import petrs.RandomArray;
import static petrs.Utils.*;

/**
 * Найти наибольший элемент массива.
 */

public class Task_32 {
    public static void main(String[] args) {

        int maximumOfArray = 0;

        RandomArray array = new RandomArray(20, 27);
        array.generate(0);
        array.printIntArray();

        for (int i = 0; i < array.getSize(); i++) {
            if(array.getElement(i) > maximumOfArray) {
                maximumOfArray = array.getElement(i);
            }
        }
        newLine();
        print("maximumOfArray = " + maximumOfArray);
    }
}
