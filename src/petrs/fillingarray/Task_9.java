package petrs.fillingarray;

/**
 * Создать массив, каждый элемент которого равен квадрату своего номера.
 */

public class Task_9 {
    public static void main(String[] args) {
        int length = 20;
        int[] resultArray = new int[length];

        for (int i = 0; i <= length - 1; i++) {
            resultArray[i] = i * i;
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + "-");
        }
    }
}
