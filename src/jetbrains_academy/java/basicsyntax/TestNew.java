package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class TestNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (k % m == 0 || k % n == 0) {
            if (k < n * m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
