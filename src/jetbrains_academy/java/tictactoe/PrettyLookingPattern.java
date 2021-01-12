package jetbrains_academy.java.tictactoe;

import java.util.Scanner;

public class PrettyLookingPattern {

    public static char[][] fillTheArray(
            String firstLine,
            String lineSecond,
            String lineThird,
            String lineForth,
            char[][] array
    ) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = firstLine.charAt(j);
                if (j == 3) break;
            }
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = lineSecond.charAt(j);
                if (j == 3) break;
            }
        }
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = lineThird.charAt(j);
                if (j == 3) break;
            }
        }
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = lineForth.charAt(j);
                if (j == 3) break;
            }
        }

        return array;
    }

    public static boolean analiseArray(char[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i][j] == array[i + 1][j] && array[i][j] == array[i][j + 1] && array[i][j] == array[i + 1][j + 1]
                ) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = new char[4][4];
        String firstLine = scanner.nextLine();
        String lineSecond = scanner.nextLine();
        String lineThird = scanner.nextLine();
        String lineForth = scanner.nextLine();
        char[][] filledArray = fillTheArray(firstLine, lineSecond, lineThird, lineForth, array);
        if (analiseArray(filledArray)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
