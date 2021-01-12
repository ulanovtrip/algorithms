package jetbrains_academy.java.tictactoe;

import java.util.Scanner;

public class FillTheMatrixByNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.abs(i - j);
            }
        }

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
