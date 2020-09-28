package petrs.analysis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Определите, есть ли в массиве повторяющиеся элементы.
 */

public class Task_52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        try {
            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }
        } catch (Exception e) {
            System.out.println("Input is empty!!!");
        }

        findRepeatingElements(numbers);
    }

    private static void findRepeatingElements(int[] numbers) {
        Arrays.sort(numbers);
        int countOfRepeating = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    countOfRepeating++;

                }
            }
        }

        if (countOfRepeating == 0) {
            System.out.println("All elements is unique!!!");
        } else {
            System.out.println("There are the same elements!!!");
        }
    }
}
