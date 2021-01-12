package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int temp = input % 100;
        int tens = (temp) / 10;
        System.out.println(tens);
    }
}
