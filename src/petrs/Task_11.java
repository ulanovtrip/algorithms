package petrs;

/**
 * Создать массив, состоящий из троек подряд идущих одинаковых элементов.
 */

public class Task_11 {
    public static void main(String[] args) {
        int[] resultArray = new int[100];

        for (int i = 0; i < resultArray.length; i += 3) {
            for (int j = i; j <= i + 2 && j < resultArray.length; j++) {
                resultArray[j] = i;
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
        }
    }
}
