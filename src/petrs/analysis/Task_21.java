package petrs.analysis;

/**
 * Найти количество чисел в массиве, которые делятся на 3, но не делятся на 7.
 */

public class Task_21 {
    public static void main(String[] args) {
        int N = 20;
        int countNumber = 0;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * N);
            if (array[i] % 3 == 0 && array[i] % 7 != 0) {
                System.out.print(array[i] + " ");
                countNumber += 1;
            }
        }
        System.out.println();
        System.out.println("countNumbers = " + countNumber);
        for (int j = 0; j < N; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
