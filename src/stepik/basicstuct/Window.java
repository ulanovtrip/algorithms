package stepik.basicstuct;

/**
 * вход: последовательность чисесл a1, a2 ... an.
 * число m: десятичное число
 * выход: пройтись по последовательности окном размера m и вывести минимум в каждом из них.
 * шаг сдвига окна - 1 элемент.
 */

//решение в лоб для окна на 3 клетки
public class Window {
    public static void main(String[] args) {

        int m = 3;
        int[] stackOfSymbols = {5, 1, 3, 2, 4, 6, 1, 7, 3, 2, 8};
        int[] minimums = new int[stackOfSymbols.length];

        for (int i = 0; i < stackOfSymbols.length - 1; ) {
            if ((stackOfSymbols.length - i) < m) {
                break;
            }

            if (stackOfSymbols[i] > stackOfSymbols[i + 1]) {
                if (stackOfSymbols[i + 1] < stackOfSymbols[i + 2]) {
                    minimums[i] = stackOfSymbols[i + 1];
                    i++;
                    continue;
                } else {
                    minimums[i] = stackOfSymbols[i + 2];
                    i++;
                    continue;
                }
            }

            if (stackOfSymbols[i] < stackOfSymbols[i + 1]) {
                if (stackOfSymbols[i] < stackOfSymbols[i + 2]) {
                    minimums[i] = stackOfSymbols[i];
                    i++;
                    continue;
                } else {
                    minimums[i] = stackOfSymbols[i + 2];
                    i++;
                    continue;
                }
            }
        }
        for (int j = 0; j < minimums.length - 2; j++) {
            System.out.print(minimums[j] + " - ");
        }
    }
}
