package petrs.analysis;

import petrs.RandomArray;
import petrs.Utils;

/**
 * Дан массив. Найдите три последовательных элемента в массиве, сумма которых максимальна.
 */

public class Task_39 {
    public static void main(String[] args) {
        RandomArray inputArray = new RandomArray(10, 13);
        inputArray.generate(1);
        inputArray.printIntArray();
        find3ElementsMaxSum(inputArray);
    }

    private static void find3ElementsMaxSum(RandomArray inputArray) {
        int index1 = 0;
        int index2 = 1;
        int index3 = 2;

        int maxSumOfElements = inputArray.getElement(0)
                + inputArray.getElement(1)
                + inputArray.getElement(2);

        for (int i = 1; i < inputArray.getSize() - 2; i++) {
            if(inputArray.getSize() == 0) {
                System.out.println("inputArray id empty!");
                break;
            }
            int j = i + 1;
            int k = i + 2;
            int newMaxSum = inputArray.getElement(i) + inputArray.getElement(j) + inputArray.getElement(k);
            if (newMaxSum > maxSumOfElements) {
                index1 = i;
                index2 = j;
                index3 = k;
                maxSumOfElements = newMaxSum;
            }
        }
        Utils.newLine();
        Utils.print("index1 = " + index1 + " / " + "index2 = " + index2 + " / " + "index3 = " + index3);
        Utils.print("maxSumOfElements = " + maxSumOfElements);
    }
}
