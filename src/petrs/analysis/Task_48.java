package petrs.analysis;

import petrs.IntegerArray;
import petrs.Utils;

/**
 * Найти наиболее часто встречающийся элемент в массиве целых чисел.
 */

public class Task_48 {
    public static void main(String[] args) {
        IntegerArray integerArray = new IntegerArray(10, 9);
        integerArray.generateRandom(1);
        //integerArray.arrayForTask48();
        findMostCommonElement(integerArray);
    }

    private static void findMostCommonElement(IntegerArray integerArray) {
        integerArray.sort();
        integerArray.print();
        Utils.newLine();
        //колличество повторений наиболее часто встречающегося эелемента
        int max_count = 0;
        //значение наиболее часто встречающегося элемента
        int max_element = 0;
        //число найденных повторений
        int count = 1;
        //беру первый элемент массива
        int element = integerArray.getElement(0);

        for (int i = 1; i < integerArray.getSize(); i++) {
            int current = integerArray.getElement(i);
            if (element == current) {
                count += 1;
            } else {
                if (max_count < count) {
                    max_element = element;
                    max_count = count;
                } else {
                    count = 1;
                    element = current;
                }
            }
        }

        if (max_count < count) {
            max_element = element;
            max_count = count;
        }

        System.out.println("max_element = " + max_element + " || " + "max_count = " + max_count);
    }
}
