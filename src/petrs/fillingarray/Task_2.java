package petrs.fillingarray;

/**
 * Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
 */

public class Task_2 {
    public static void main(String[] args) {
        int[] inputArray = new int[30];
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 != 0) {
                inputArray[i] = 1;
            } else {
                inputArray[i] = 0;
            }
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
