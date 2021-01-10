package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("");

        int sumOfLeft = 0;
        int sumOfRight = 0;

        for (int i = 0; i < 3; i++) {
            sumOfLeft = sumOfLeft + Integer.parseInt(strings[i]);
        }
        for (int j = 3; j < 6; j++) {
            sumOfRight = sumOfRight + Integer.parseInt(strings[j]);
        }

        if (sumOfLeft - sumOfRight == 0) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
