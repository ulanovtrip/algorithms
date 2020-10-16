package petrs.analysis;

import petrs.Utils;

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
        //findTwoSmallestElements(numbers);
        findTwoSmallestElementVerTwo(numbers);
    }

    private static void findTwoSmallestElements(int[] numbers) {
        Arrays.sort(numbers);
        int firstMinimum = numbers[0];
        int secondMinimum = numbers[1];
        System.out.println("firstMinimum = " + firstMinimum);
        System.out.println("secondMinimum = " + secondMinimum);
    }

    private static void findTwoSmallestElementVerTwo(int[] numbers)     {
        int firstMin = numbers[0];
        int secondMin = numbers[1];

        if (firstMin > secondMin) {
            firstMin = numbers[1];
            secondMin = numbers[0];
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < firstMin) {
                secondMin = firstMin;
                firstMin = numbers[i];
            } else if (numbers[i] < secondMin) {
                secondMin = numbers[i];
            }
        }

        Utils.print("firstMin = " + firstMin + "; 3secondMin = " + secondMin);
    }
}
