package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();

        int result = 0;
        while (result != 1) {
            if (result == 0 && naturalNumber != 1) {
                System.out.print(naturalNumber + " ");
            } else if (result == 0) {
                System.out.print(naturalNumber + " ");
                break;
            }
            if (naturalNumber % 2 == 0) {
                result = naturalNumber / 2;
                naturalNumber = result;
            } else {
                result = naturalNumber * 3 + 1;
                naturalNumber = result;
            }
            System.out.print(result + " ");
        }
    }
}
