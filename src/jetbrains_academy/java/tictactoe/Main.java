package jetbrains_academy.java.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Enter cells: " + userInput);
        char[] chars = userInput.toCharArray();
        printFields(chars);
        analiseInput(chars);
    }

    public static boolean isZerosMoreThanX(int countZeros, int countX) {
        if (countZeros > countX) {
            return true;
        }
        return false;
    }

    public static boolean isZeroWins(char[] chars) {
        if (chars[0] == 'O' && chars[1] == 'O' && chars[2] == 'O' ||
                chars[3] == 'O' && chars[4] == 'O' && chars[5] == 'O' ||
                chars[6] == 'O' && chars[7] == 'O' && chars[8] == 'O' ||
                chars[0] == 'O' && chars[3] == 'O' && chars[6] == 'O' ||
                chars[1] == 'O' && chars[4] == 'O' && chars[7] == 'O' ||
                chars[2] == 'O' && chars[5] == 'O' && chars[8] == 'O' ||
                chars[0] == 'O' && chars[4] == 'O' && chars[8] == 'O' ||
                chars[2] == 'O' && chars[4] == 'O' && chars[6] == 'O'
        ) {
            return true;
        }
        return false;
    }

    public static boolean isXWins(char[] chars) {
        if (chars[0] == 'X' && chars[1] == 'X' && chars[2] == 'X' ||
                chars[3] == 'X' && chars[4] == 'X' && chars[5] == 'X' ||
                chars[6] == 'X' && chars[7] == 'X' && chars[8] == 'X' ||
                chars[0] == 'X' && chars[3] == 'X' && chars[6] == 'X' ||
                chars[1] == 'X' && chars[4] == 'X' && chars[7] == 'X' ||
                chars[2] == 'X' && chars[5] == 'X' && chars[8] == 'X' ||
                chars[0] == 'X' && chars[4] == 'X' && chars[8] == 'X' ||
                chars[2] == 'X' && chars[4] == 'X' && chars[6] == 'X'

        ) {
            return true;
        }
        return false;
    }

    public static void analiseInput(char[] chars) {
        int countZeros = 0;
        int countX = 0;
        int emptyCell = 0;

        for (Character ch : chars) {
            if (ch == 'X') {
                countX += 1;
            } else if (ch == 'O') {
                countZeros += 1;
            } else {
                emptyCell += 1;
            }
        }

        if (isZeroWins(chars) && !isXWins(chars)) {
            System.out.println("O wins");
            return;
        }

        if (isXWins(chars) && !isZeroWins(chars)) {
            System.out.println("X wins");
            return;
        }

        if (isZerosMoreThanX(countZeros, countX) || !isZerosMoreThanX(countZeros, countX) && emptyCell > 0) {
            System.out.println("Impossible");
            return;
        }

        if (countZeros == countX && emptyCell > 0) {
            System.out.println("Game not finished");
            return;
        }

        if (isZerosMoreThanX(countZeros, countX) || !isZerosMoreThanX(countZeros, countX) && emptyCell == 0) {
            System.out.println("Draw");
            return;
        }
    }

    public static void printFields(char[] chars) {
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", chars[0], chars[1], chars[2]);
        System.out.printf("| %c %c %c |\n", chars[3], chars[4], chars[5]);
        System.out.printf("| %c %c %c |\n", chars[6], chars[7], chars[8]);
        System.out.println("---------");
    }
}
