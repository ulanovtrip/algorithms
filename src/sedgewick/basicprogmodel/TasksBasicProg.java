package sedgewick.basicprogmodel;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TasksBasicProg {
    public static void main(String[] args) {
        TasksBasicProg tasksBasicProg = new TasksBasicProg();
//        System.out.println("----------------------------");
//        tasksBasicProg.t_1_1_9();
//        System.out.println("----------------------------");
//        tasksBasicProg.t_1_1_11();
//        System.out.println("----------------------------");
        //       tasksBasicProg.t_1_1_13();
//        System.out.println(lg(8));
        //System.out.println(tasksBasicProg.t_1_1_18_mystery(2, 25));
        //System.out.println(tasksBasicProg.t_1_1_18_mystery(3, 11));
        //System.out.println(tasksBasicProg.t_1_1_20(5));
        //tasksBasicProg.t_1_1_21("Petr", 12, 6);
    }

    private void t_1_1_8() {
        double a, b, c;
        a = 1.0;
        b = 0.0;
        c = a / b;
        double d = 2.0e-6 * 100000000.1;
        boolean f = true && false || true && true;
        System.out.println(c + " / " + d + " / " + f);
        System.out.println("----------------------------");

        double x, y, z;
        x = 0.5;
        y = 1;
        z = 3;

        if ((x < 1 && x > 0) && (y < 1 && y > 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("----------------------------");

        int h = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(h + "/");
            h = h + g;
            g = h - g;
        }
        System.out.println("----------------------------");

        double t = 0.9;
        while (Math.abs(t - 0.9 / t) > .001)
            t = (0.9 / t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
        System.out.println((char) 'f' + 4);
    }

    private void t_1_1_9() {
        int N = 3;
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            System.out.print(" ->" + n % 2 + "/ ");
            s = (n % 2) + s;
        }
        System.out.println("result: " + s);
    }

    private void t_1_1_11() {
        boolean[][] array = new boolean[2][3];
        array[0][0] = true;
        array[0][1] = false;
        array[0][2] = true;
        array[1][0] = false;
        array[1][1] = true;
        array[1][2] = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == true) {
                    System.out.println("row= " + i + " /column= " + j + " \'*\'");
                } else if (array[i][j] == false) {
                    System.out.println("row= " + i + " /column= " + j + " \'+\'");
                }
            }
        }
    }

    private void t_1_1_13() {
        int[][] a;
        int n = 2;
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(" // row= " + i + " /column= " + j + "%4d", a[i][j]);
            }
        }
        System.out.println();
        System.out.println("-----------------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(" // row= " + i + " /column= " + j + "%4d", a[i][j]);
            }
        }
        /* Результат
        0 1   0 2
        2 3   1 3
         */
    }

    private static int lg(int N) {
        //возвращает наибольшее целое число, не больше чем двоичный логарифм N.
        //Двоичный логарифм — логарифм по основанию 2. Другими словами,
        // двоичный логарифм числа b есть решение уравнения 2^{x}=b.
        int res = 0;
        //При каждом сдвиге вправо выполняется деление на два с отбрасыванием любого остатка.
        //Это позволит узнать степень
        while ((N >>= 1) != 0) {
            res++;
        }
        return res;
    }

    private int t_1_1_18_mystery(int a, int b) {
        /*
        (3 11) -> (150 5) + 3 = 153
        (6 5) -> (144 2) + 6 = 150
        (12 2) -> (144 1) = 144
        (144 1) -> 0 + 144 = 144
        (288 0) -> 0
        Когда обратно идешь, надо не забыть, что один раз ты вошел в условие кратности 2

        (3 11) -> (150) + 3 = 153
        (6 5) -> (144) + 6 = 150
        (144) -> (144 1) = 144
        (0) -> 0+ 144 = 144
        (288 0) -> 0

        */

        if (b == 0) return 0;

        //условие кратности двум
        if (b % 2 == 0) return t_1_1_18_mystery(a * a, b / 2);

        return t_1_1_18_mystery(a + a, b / 2) + a;
    }

    private double t_1_1_20(int N) {
        /*
        b1 = 1.6(a) + recurs_b2        N = 5
        b2 = 1.3 + recurs_b3           N = 4
        b3 = 1.09 + recurs_b4          N = 3
        b4 = 0.69 + b5(return 0)       N = 2
        b5 = return 0;                 N = 1

        //обратный ход рекурсии
        b4 = 0.69(a) + 0 = 0.69(b)     N = 2
        b3 = 1.09(a) + 0.69 = 1.79(b)  N = 3
        b2 = 1.3(a) + 1.79 = 3.17      N = 4
        b1 = 1.6(a) + 3.17 = 4.78      N = 5
         */
        if (N == 1) return 0;
        double a = Math.log(N);
        double b = a + t_1_1_20(N - 1);
        return b;
    }

    private void t_1_1_21(String name, int a, int b) {
        int c = a / b;
        System.out.printf("%s | %,d | %,d | %,d |", name, a, b, c);
    }

}
