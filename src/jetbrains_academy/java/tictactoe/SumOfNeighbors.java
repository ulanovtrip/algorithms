package jetbrains_academy.java.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNeighbors {

    public static int[][] readRectangularMatrix() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        //read all digits as integers
        while (scanner.hasNext()) {
            try {
                int num = scanner.nextInt();
                integers.add(num);
            } catch (Exception e) {
                break;
            }
        }
        int sizeOfMatrix = (int) Math.sqrt(integers.size());
        int[][] arrayTwoDimensional = new int[sizeOfMatrix][sizeOfMatrix];

        //insert all integers in two dimensional array
        int counterForList = 0;
        for (int i = 0; i < arrayTwoDimensional.length; i++) {
            for (int j = 0; j < arrayTwoDimensional.length; j++) {
                arrayTwoDimensional[i][j] = integers.get(counterForList);
                counterForList += 1;
            }
        }
        return arrayTwoDimensional;
    }

    public static int[][] changeMatrix(int[][] matrix) {
        int[][] changedMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (i - 1 >= 0 && j - 1 < 0) {
                    int a = matrix[matrix.length - 1][j];
                    int b = matrix[i + 1][j];
                    int c = matrix[i][j - 1];
                    int d = matrix[i][(matrix.length - 1) - j];
                    changedMatrix[i][j] = a + b + c + d;
                }

                if (i - 1 < 0 && j - 1 > 0) {
                    int a = matrix[matrix.length - 1][j];
                    int b = matrix[i + 1][j];
                    int c = matrix[i][j - 1];
                    int d = matrix[i][(matrix.length - 1) - j];
                    changedMatrix[i][j] = a + b + c + d;
                }

                if (i - 1 < 0 && j - 1 == 0) {
                    int a = matrix[matrix.length - 1][j];
                    int b = matrix[i + 1][j];
                    int c = matrix[i][j - 1];
                    int d = matrix[i][j + 1];
                    changedMatrix[i][j] = a + b + c + d;
                }

                if (i - 1 < 0 && j - 1 < 0) {
                    int a = matrix[matrix.length - 1][j];
                    int b = matrix[i + 1][j];
                    int c = matrix[i][matrix.length - 1];
                    int d = matrix[i][j + 1];
                    changedMatrix[i][j] = a + b + c + d;
                }
            }
        }

        return changedMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = readRectangularMatrix();
        int[][] changedMatrix = changeMatrix(matrix);

    }
}
