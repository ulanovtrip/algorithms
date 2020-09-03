package petrs.fillingarray;

/**
 * Создайте массив,
 * в котором количество отрицательных чисел равно количеству положительных и
 * положительные числа расположены на случайных местах в массиве.
 */

public class Task_16 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int middleArray = (array.length / 2) - 1;

        for (int i = 0; i < array.length; i++) {
            if (positiveNumbers <= middleArray) {
                int randomPosition = (int) (1 + Math.random() * 9);
                if (array[randomPosition] == 4) {
                    continue;
                } else {
                    array[randomPosition] = 4;
                }
                positiveNumbers++;
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] != 4) {
                array[j] = -2;
                negativeNumbers++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + "|");
            }
        }
        System.out.println("Positive = " + positiveNumbers + " || " + "Negative = " + negativeNumbers);
    }
}
