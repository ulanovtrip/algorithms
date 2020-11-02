package petrs.converting_an_array;

import edu.princeton.cs.algs4.In;
import petrs.IntegerArray;
import petrs.Utils;

/**
 * Выполните сортировку массива следующими тремя способами:
 * сортировкой выбором,
 * сортировкой вставками,
 * сортировкой обменом.
 */

public class Task_83 {
    public static void main(String[] args) {
        IntegerArray inputSelection = new IntegerArray(10, 13);
        IntegerArray inputInsertion = new IntegerArray(5, 13);
        IntegerArray inputBubble = new IntegerArray(10, 13);
        inputSelection.generateRandom(0);
        inputInsertion.generateRandom(1);
        inputBubble.generateRandom(1);
        selectionSort(inputSelection);
        Utils.newLine();
        Utils.newLine();
        insertionSort(inputInsertion);
        Utils.newLine();
        bubbleSort(inputBubble);
    }

    private static void selectionSort(IntegerArray inputArray) {
        for (int i = 0; i < inputArray.getSize(); i++) {
            int least = i;
            for (int j = i + 1; j < inputArray.getSize(); j++) {
                if (inputArray.getElement(j) < inputArray.getElement(least)) {
                    least = j;
                }
            }
            int temp = inputArray.getElement(i);
            inputArray.setValue(i, inputArray.getElement(least));
            inputArray.setValue(least, temp);
        }
        Utils.println("Selection Sort:");
        inputArray.print();
    }

    private static void insertionSort(IntegerArray inputArray) {
        for (int j = 0; j < inputArray.getSize(); j++) {
            int key = inputArray.getElement(j);
            int i = j - 1;
            while (i >= 0 && inputArray.getElement(i) > key) {
                inputArray.setValue(i + 1, inputArray.getElement(i));
                i = i - 1;
            }
            inputArray.setValue(i + 1, key);
        }
        Utils.println("InsertionSort Sort:");
        inputArray.print();
    }

    private static void bubbleSort(IntegerArray integerArray) {
        for (int i = 0; i < integerArray.getSize(); i++) {
            for (int j = i + 1; j < integerArray.getSize(); j++) {
                if (integerArray.getElement(i) > integerArray.getElement(j)) {
                    int temp = integerArray.getElement(i);
                    integerArray.setValue(i, integerArray.getElement(j));
                    integerArray.setValue(j, temp);
                }
            }
        }

        Utils.print("BubbleSort: ");
        Utils.newLine();
        integerArray.print();
    }
}