package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class EqualsThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        boolean answer = first != second && (second == third || first != third);
        System.out.println(answer);
    }
}
