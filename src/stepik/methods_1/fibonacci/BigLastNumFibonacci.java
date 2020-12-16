package stepik.methods_1.fibonacci;

import java.util.Scanner;

public class BigLastNumFibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int requiredNum = scanner.nextInt();
        int sizeArray = 10000000;

        int[] array = new int[sizeArray];
        array[0] = 0;
        array[1] = 1;

        int lastNum = 0;
        for (int i = 2; i <= requiredNum; i++) {
            int sum = array[i - 1] + array[i - 2];
            lastNum = array[i] = sum % 10;
        }
        System.out.println(lastNum);
    }
}
