package petrs.fillingarray;

/**
 * Создать массив из n первых чисел Фибоначчи.
 */

public class Task_7 {
    public static void main(String[] args) {
        int firstElement = 1;
        int secondElement = 1;
        int[] resultArray = new int[20];

        for (int i = 0; i < resultArray.length - 1; i++) {
            if (i == 0) {
                resultArray[i] = firstElement;
                resultArray[i + 1] = secondElement;
            } else {
                resultArray[i + 1] = resultArray[i] + resultArray[i - 1];
            }
        }
        for (int i = 0; i <= resultArray.length - 1; i++) {
            System.out.print(resultArray[i] + " - ");
        }
    }
}
