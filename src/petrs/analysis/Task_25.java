package petrs.analysis;

/**
 * Найдите сумму нечетных чисел массива, которые не превосходят 11.
 */

public class Task_25 {
    public static void main(String[] args) {
        int N = 50;
        int sumOfOddNumberLessEleven = 0;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + "-");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            if (array[i] % 2 != 0 && array[i] < 11) {
                sumOfOddNumberLessEleven = sumOfOddNumberLessEleven + array[i];
            }
        }

        System.out.println("sumOfEvenNumber = " + sumOfOddNumberLessEleven);
    }
}
