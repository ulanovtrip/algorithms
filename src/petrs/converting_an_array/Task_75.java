package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.ArrayList;

/**
 * Дан массив.
 * Сформировать новый массив, в котором идут сначала отрицательные элементы, затем нули, затем положительные.
 */

public class Task_75 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 13);
        inputArray.generateRandomWithNegativeNumbers(-2, 13);
        inputArray.print();
        Utils.newLine();
        sortArray(inputArray);
    }

    private static void sortArray(IntegerArray inputArray) {
        ArrayList<Integer> out = new ArrayList<>();
        inputArray.sort();
        for (int i = 0; i < inputArray.getSize(); i++) {
            out.add(inputArray.getElement(i));
        }

        for (Integer x : out) {
            Utils.print(x + "; ");
        }
    }
}
