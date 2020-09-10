package petrs.analysis;

/**
 * Найдите сумму четных чисел массива.
 */

public class Task_24 {
    public static void main(String[] args) {
        int N = 20;
        int sumOfEvenNumber = 0;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * N);
            System.out.print(array[i] + "-");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            if (array[i] % 2 == 0) {
                sumOfEvenNumber = sumOfEvenNumber + array[i];
            }
        }
        System.out.println("sumOfEvenNumber = " + sumOfEvenNumber);
    }
}
