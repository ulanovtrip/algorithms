package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Найти в массиве все серии подряд идущих одинаковых элементов и удалить из них все элементы кроме одного.
 */

public class Task_63 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 10);
        inputArray.generateRandom(1);
        inputArray.print();
        findAndDeleteEquals(inputArray);
    }

    private static void findAndDeleteEquals(IntegerArray inputArray) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < inputArray.getSize(); i++) {
            set.add(inputArray.getElement(i));
        }

        Utils.newLine();
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
    }
}
