package petrs.analysis;

/**
 * Найти количество четных чисел в массиве.
 */

public class Task_20 {
    public static void main(String[] args) {
        int N = 10;
        int countEvenNumber = 0;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * N);
            System.out.print(array[i] + "-");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            if (array[i] % 2 == 0) {
                countEvenNumber += 1;
                System.out.print(array[i] + "-");
            }
        }
        System.out.println();
        System.out.println("Even number is: " + countEvenNumber);
    }
}
