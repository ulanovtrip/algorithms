package petrs.fillingarray;

/**
 * Сформировать массив из элементов арифметической прогрессии с заданным первым элементом x и разностью d.
 */

public class Task_4 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        arr[0] = 2;
        int subtraction = 2;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + subtraction;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }
}
