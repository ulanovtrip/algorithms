package petrs.analysis;

import java.util.Scanner;

/**
 * Напишите программу, которая вводит с клавиатуры непустой массив целых чисел,
 * и выводит число локальных максимумов
 * (элемент является локальным максимумом, если он не имеет соседей, больших, чем он сам).
 */

public class Task_50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int[] numbers = new int[data.length];

        try {
            for (int i = 0; i < data.length; i++) {
                numbers[i] = Integer.parseInt(data[i]);
            }
        } catch (Exception e) {
            System.out.println("Input is empty!!!");
        }

        findLocalMaximum(numbers);
    }

    private static void findLocalMaximum(int[] array) {
        int localMaximum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] < array[i] && array[i + 1] < array[i]) {
                localMaximum += 1;
            }
        }
        System.out.println("localMaximum = " + localMaximum);
    }
}
