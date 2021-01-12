package jetbrains_academy.java.tictactoe;

import java.util.Scanner;

public class CheckSudoku {

    public static boolean analiseArray(int[][] array) {

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firsNum = scanner.nextLine();
        int input = Integer.parseInt(firsNum);
        int size = input * input;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            String nextNum = scanner.nextLine().replaceAll(" ", "");
            for (int j = 0; j < size; j++) {
                array[i][j] = Integer.parseInt(String.valueOf(nextNum.charAt(j)));
            }
        }

        System.out.println(analiseArray(array));
    }
}
