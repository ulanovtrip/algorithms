package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class TensDigit {
    public static boolean checkOrder(int[] array, int n, int m) {

        if (array[0] == n || array[0] == m && array[1] == n || array[1] == m) {
            return false;
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == n || array[i] == m) {
                if (array[i - 1] == m || array[i + 1] == m || array[i - 1] == n || array[i + 1] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthArray = scanner.nextInt();
        int[] array = new int[lengthArray];

        for (int i = 0; i < lengthArray; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.print(checkOrder(array, n, m));
    }
}
