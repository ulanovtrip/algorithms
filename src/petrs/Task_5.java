package petrs;

/**
 * Сформировать возрастающий массив из четных чисел.
 */

public class Task_5 {
    public static void main(String[] args) {
        int[] inputArray = new int[40];
        int counter = 2;

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = counter;
            counter += 2;
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
