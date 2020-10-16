package petrs.analysis;

import petrs.Utils;

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
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                Utils.print("Not unique.");
                break;
            }
            if (i == numbers.length - 2) {
                Utils.print("Unique");
            }
        }
    }
}
