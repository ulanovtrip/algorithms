package jetbrains_academy.java.cinema;
/*
 2 3
 1 0 1
 1 1 1
 0 0 1
 2
 */

import java.util.Scanner;

class Main {
    public static void analiseSeats(int[][] array, int k, int nRows, int mSeats) {
        int countOfZeros = 0;
        for (int i = 0; i < nRows; i++) {
            countOfZeros = 0;
            for (int j = 0; j < mSeats; j++) {
                if (array[i][j] == 0) {
                    countOfZeros++;
                    if (countOfZeros == k) {
                        System.out.println(i + 1);
                        return;
                    }
                }
                if (array[i][j] == 1) {
                    countOfZeros = 0;
                }
            }
        }

        if (countOfZeros < k) {
            System.out.println(0);
        }
    }

    public static void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        int nRows = scanner.nextInt();
        int mSeats = scanner.nextInt();
        int[][] matrix = new int[nRows][mSeats];
        int countElem = 0;
        int k = 0;
        for (int i = 0; i <= nRows; i++) {
            for (int j = 0; j < mSeats; j++) {
                countElem++;
                int num = scanner.nextInt();
                if (countElem > nRows * mSeats) {
                    k = num;
                    break;
                }
                matrix[i][j] = num;
            }
        }
        analiseSeats(matrix, k, nRows, mSeats);
    }

    public static void main(String[] args) {
        readNumbers();
    }
}
