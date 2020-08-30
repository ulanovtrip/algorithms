package petrs;

/**
 * Создать массив, на четных местах в котором стоят единицы,
 * а на нечетных местах - числа, равные остатку от деления своего номера на 5.
 */

public class Task_10 {
    public static void main(String[] args) {
        int[] resultArray = new int[20];

        for (int i = 0; i <= resultArray.length - 1; i++) {
            if (i % 2 != 0) {
                resultArray[i] = i % 5;
            } else {
                resultArray[i] = 1;
            }
        }
        for (int i = 0; i <= resultArray.length - 1; i++) {
            System.out.println(resultArray[i] + "-" + i);
        }
    }
}
