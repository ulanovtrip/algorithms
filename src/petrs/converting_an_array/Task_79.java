package petrs.converting_an_array;

import petrs.Utils;

import java.util.Arrays;

/**
 * Даны два упорядоченных по возрастанию массива.
 * Образовать из этих двух массивов единый упорядоченный по возрастанию массив.
 * https://pas1.ru/arrayconflux
 */

public class Task_79 {
    public static void main(String[] args) {
        int[] first = {1, 12, 23, 21};
        int[] second = {3, 10, 13, 14};
        //crateCommonArray(first, second);
        mergeAndSortArrays(first, second);
    }

    private static void crateCommonArray(int[] first, int[] second) {
        if (first.length == 0 || second.length == 0) return;
        int[] output = new int[first.length + second.length];
        int lengthArray;
        if (first.length > second.length) {
            lengthArray = first.length;
        } else if (second.length > first.length) {
            lengthArray = second.length;
        } else {
            lengthArray = first.length;
        }

        int outputIndex = 0;
        for (int i = 0; i < lengthArray - 1; i++, outputIndex++) {
            if (first[i] < second[i] && first[i] < second[i + 1]) {
                output[outputIndex] = first[i];
                output[outputIndex + 1] = second[i];
            } else if (first[i] > second[i] && first[i] > second[i + 1]) {
                output[outputIndex] = second[i];
                output[outputIndex + 1] = second[i + 1];
                output[outputIndex + 2] = first[i];
            } else {
                output[outputIndex] = second[i];
                output[outputIndex + 1] = first[i];
            }
            outputIndex++;
        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + "; ");
        }
    }

    private static void mergeAndSortArrays(int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];
        int j = 0;

        for (int i = 0; i < first.length; i++) {
            mergedArray[i] = first[i];
            if (i == first.length - 1) j = i;
        }

        for (int i = j + 1, k = 0; i < mergedArray.length; i++, k++) {
            mergedArray[i] = second[k];
        }

        Arrays.sort(mergedArray);
        Utils.printArray("mergedArray: ", mergedArray);
    }
}
