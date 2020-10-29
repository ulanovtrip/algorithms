package petrs.dynamic;

/**
 * https://www.youtube.com/watch?v=vcPqOYswqlw&t=2479s&ab_channel=Pytonich
 */

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        char[] A = {'b', 'a', 'c', 'c', 'b', 'c', 'a'};
        char[] B = {'a', 'b', 'c', 'a', 'b', 'a', 'a', 'c'};
        gcs(A, B);
    }

    private static void gcs(char[] A, char[] B) {
        int[][] F = new int[9][9];
        int n = A.length;
        int m = B.length;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (A[i - 1] == B[j - 1]) {
                    F[i][j] = F[i - 1][j - 1] + 1;
                } else {
                    int num1 = F[i][j];
                    int num2 = F[i][j - 1] + 1;
                    F[i][j] = max(num1, num2);
                }
            }
        }
        //System.out.println(F[n][m]);

        String ans = "";
        int i = n;
        int j = m;

        while (F[i][j] > 0) {
            if (F[i][j] == F[i - 1][j]) {
                j -= 1;
            }

            if (F[i][j] == F[i][j - 1]) {
                j -= 1;
            } else {
                char letter = A[i - 1];
                ans = letter + ans;
                i -= 1;
                j -= 1;
            }
        }
        System.out.println(ans);
    }

    private static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
