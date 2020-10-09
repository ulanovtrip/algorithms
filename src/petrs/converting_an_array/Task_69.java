package petrs.converting_an_array;

import petrs.Utils;

/**
 * Даны два массива. Сформировать третий массив, состоящий из тех элементов, которые:
 * а) присутствуют в обоих массивах;
 * б) присутствуют только в одном из массивов.
 */

public class Task_69 {
    public static void main(String[] args) {
        int[] A = {1, 4, 5, 8, 3, 2, 9};
        int[] B = {2, 4, 6, 8, 7, 11, 9};
        int[] C = {-1, -1, -1};
        //findInBothArray(A, B, C);
        findInOnlyOneArray(A, B, C);
    }

    private static void findInBothArray(int[] A, int[] B, int[] C) {
        int countFindNumbers = 0;
        for (int k : A) {
            if (countFindNumbers == 3) break;
            for (int j = 0; j < A.length; j++) {
                if (k == B[j]) {
                    if (countFindNumbers < 3) {
                        C[countFindNumbers] = k;
                        countFindNumbers += 1;
                    }
                }
            }
        }

        Utils.printArray("C = ", C);
    }

    private static void findInOnlyOneArray(int[] A, int[] B, int[] C) {
        int uniqueNumbers = 0;
        int cellsFromC = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (C[2] != -1) break;
                if (A[i] == B[j]) {
                    uniqueNumbers = 0;
                    break;
                }
                if (A[i] != B[j]) {
                    uniqueNumbers += 1;
                    if (uniqueNumbers == A.length - 1) {
                        C[cellsFromC] = A[i];
                        cellsFromC += 1;
                        uniqueNumbers = 0;
                    }
                }
            }
        }

        Utils.printArray("C = ", C);
    }
}
