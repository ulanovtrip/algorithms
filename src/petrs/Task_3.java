package petrs;

/**
 * Заполнить массив последовательными нечетными числами, начиная с единицы.
 */

public class Task_3 {
    public static void main(String[] args) {
        int[] inputArray = new int[20];
        int x = 1;
        int d = 2;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == x) {
                continue;
            }
            inputArray[i] = x + i * d;
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (i == inputArray.length - 1) {
                System.out.println(inputArray[i]);
            } else {
                System.out.print(inputArray[i] + "-");
            }
        }
    }
}
