package jetbrains_academy.java.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Enter cells: " + userInput);
        char[] chars = userInput.toCharArray();
        printFields(chars);
        String userCoordinates;
        char[] coordinatesInChars = new char[2];

        boolean isTwoElements = false;
        while (!isTwoElements) {
            userCoordinates = scanner.nextLine();
            System.out.println("Enter the coordinates: " + userCoordinates);
            coordinatesInChars = userCoordinates.replaceAll(" ", "").toCharArray();
            isTwoElements = checkInputErrors(coordinatesInChars, chars);
        }

        char[] updateMatrix = updateMatrix(coordinatesInChars, chars);
        printFields(updateMatrix);
        //analiseInput(updateMatrix);
    }

    public static char[] updateMatrix(char[] coordinatesInChars, char[] matrix) {
        int row = convertCharInInt(coordinatesInChars[0]);
        int column = convertCharInInt(coordinatesInChars[1]);
        int index = getIndex(row, column);
        matrix[index] = 'X';
        return matrix;
    }

    public static int getIndex(int row, int column) {
        return (((row - 1) * 3) + column) - 1;
    }

    public static boolean checkInputErrors(char[] coordinatesInChars, char[] chars) {
        String regexDigits = "[1-3]";
        boolean flag = true;

        if (coordinatesInChars.length > 2) {
            System.out.println("You should enter numbers!");
            return false;
        }

        try {
            if (convertCharInInt(coordinatesInChars[0]) > 3 || convertCharInInt(coordinatesInChars[1]) > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                return false;
            } else if (!isEmptyCell(chars, convertCharInInt(coordinatesInChars[0]), convertCharInInt(coordinatesInChars[1]))) {
                flag = false;
                System.out.println("This cell is occupied! Choose another one!");
            }
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers!");
            return false;
        }
        return flag;
    }

    public static boolean isEmptyCell(char[] chars, int row, int column) {
        int index = getIndex(row, column);
        if (chars[index] != '_') {
            return false;
        }
        return true;
    }

    public static int convertCharInInt(char elem) {
        return Integer.parseInt(String.valueOf(elem));
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

        if (countZeros == countX && countZeros == emptyCell && isXWins(chars) && !isZeroWins(chars)) {
            System.out.println("Game not finished");
            return;
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
