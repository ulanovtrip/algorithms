package petrs.analysis;

/**
 * Найдите сумму и произведение элементов массива.
 */

public class Task_23 {
    public static void main(String[] args) {
        int N = 20;
        int sumOfElements = 0;
        int multiplicationOfElements = 1;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = i;
        }

        for (int i = 1; i < N; i++) {
            sumOfElements = array[i] + sumOfElements;
            multiplicationOfElements = array[i] * multiplicationOfElements;
        }

        System.out.println("Sum = " + sumOfElements);
        System.out.println("Multiplication = " + multiplicationOfElements);
    }
}
