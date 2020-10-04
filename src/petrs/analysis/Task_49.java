package petrs.analysis;

/**
 * В одномерном массиве, состоящем из n вещественных элементов,
 * вычислите номер минимального элемента массива и сумму элементов массива,
 * расположенных между первым и вторым отрицательными элементами.
 */

public class Task_49 {
    public static void main(String[] args) {
        int[] inputArray = {3, 2, -1, 5, 7, -2, 9, 3, -5, 1};
        findMinAndSum(inputArray);
    }

    private static void findMinAndSum(int[] inputArray) {
        int indexOfMinElement = 0;
        int sumBetweenFirsAndSecond = 0;
        int countFoundNegativeNumbers = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (i == inputArray.length - 2) break;
            if (inputArray[i] > inputArray[i + 1]) {
                indexOfMinElement = i + 1;
            } else {
                for (int j = indexOfMinElement; j < inputArray.length; j = indexOfMinElement) {
                    if (j == inputArray.length - 2) break;
                    for (int k = indexOfMinElement + 1; k < inputArray.length; k++) {
                        if (inputArray[k] < inputArray[j]) {
                            indexOfMinElement = k;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("indexOfMinElement = " + indexOfMinElement);

        for (int i = 0; i < inputArray.length; i++) {
            if (countFoundNegativeNumbers == 2) break;
            if (inputArray[i] < 0) {
                countFoundNegativeNumbers += 1;
                for (int j = i; j < inputArray.length; j++) {
                    sumBetweenFirsAndSecond = inputArray[i + 1] + inputArray[j + 2];
                    if (inputArray[j + 3] < 0) {
                        countFoundNegativeNumbers += 1;
                        break;
                    }
                }
            }
        }
        System.out.println("sumBetweenFirsAndSecond = " + sumBetweenFirsAndSecond);
    }
}
