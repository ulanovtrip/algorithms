package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class Tst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfSequence = scanner.nextInt();

        int maxDivisibleBy4 = 0;

        for (int i = 0; i < lengthOfSequence; i++) {
            int nextNum = scanner.nextInt();
            if (nextNum % 4 == 0 && nextNum > maxDivisibleBy4) {
                maxDivisibleBy4 = nextNum;
            }
        }
        System.out.print(maxDivisibleBy4);
    }
}
