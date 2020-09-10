package petrs.analysis;

/**
 * Определите, каких чисел в массиве больше:
 * которые делятся на первый элемент массива или которые делятся на последний элемент массива.
 */

public class Task_22 {
    public static void main(String[] args) {
        int N = 10;
        int countDividedByTheFirsElement = 0;
        int countDividedByTheLastElement = 0;
        int[] inputArray = new int[N];

        for (int i = 0; i < N; i++) {
            inputArray[i] = (int) (1 + Math.random() * N);
            System.out.print(inputArray[i] + "-");
        }

        System.out.println();
        int firstElement = inputArray[0];
        int lastElement = inputArray[inputArray.length - 1];

        System.out.println("FirstElement = " + firstElement + ", " +
                "" + "LastElement = " + lastElement);

        for (int i = 1; i < N - 1; i++) {
            if (inputArray[i] % firstElement == 0) {
                countDividedByTheFirsElement++;
            } else if (inputArray[i] % lastElement == 0) {
                countDividedByTheLastElement++;
            }
        }

        System.out.println("CountDividedByTheFirsElement = " + countDividedByTheFirsElement + "," +
                " " + "CountDividedByTheLastElement = " + countDividedByTheLastElement);
    }
}
