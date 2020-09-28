package petrs.analysis;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В данном массиве найдите два наименьших элемента.
 */

public class Task_51 {
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

        findTwoSmallestElements(numbers);
    }

    private static void findTwoSmallestElements(int[] numbers) {
        Arrays.sort(numbers);
        int firstMinimum = numbers[0];
        int secondMinimum = numbers[1];
        System.out.println("firstMinimum = " + firstMinimum);
        System.out.println("secondMinimum = " + secondMinimum);
    }
}
