package stepik.methods_1;

import java.util.Scanner;

public class SmallFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = 40;
        int size = scanner.nextInt();
        int[] numbers = new int[sizeArray];

        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < size; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        System.out.println(numbers[size - 1] % 10);
    }
}
