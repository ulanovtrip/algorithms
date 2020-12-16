package stepik.basicstuct_2;

/**
 * вход: последовательность чисесл a1, a2 ... an.
 * число m: десятичное число
 * выход: пройтись по последовательности окном размера m и вывести минимум в каждом из них.
 * шаг сдвига окна - 1 элемент.
 */

//Решение для любого размера окна
public class WindowPassFull {
    public static void main(String[] args) {
        int[] array = {2, 3, 6, 2, 1, 5, 6, 6, 7};
        int windowSize = 4;

        for (int i = 0; i <= array.length - windowSize; i++) {
            int start = i;
            int end = i + (windowSize - 1);
            int minimum = findMinimum(start, end, array);
            System.out.print(minimum + " - ");
        }
    }

    public static int findMinimum(int start, int end, int[] array) {
        int minimum = array[start];
        int next = start + 1;

        for (int j = next; j <= end; j++) {
            if (array[j] < minimum) {
                minimum = array[j];
            }
        }
        return minimum;
    }
}