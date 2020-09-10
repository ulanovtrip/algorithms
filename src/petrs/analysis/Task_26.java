package petrs.analysis;

/**
 * Найдите сумму чисел массива, которые расположены до первого четного числа массива.
 * Если четных чисел в массиве нет, то найти сумму всех чисел за исключением крайних.
 */

public class Task_26 {
    public static void main(String[] args) {
        int N = 9;
        int sumOfNumberBeforeFirstEven = 0;
        int sumWithOutFirstAndLast = 0;

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "-");
        }

        //четных чисел в массиве нет
        //int[] array = {1,3,5,7,9,13,11,5,7};

        System.out.println();

        for (int i = 0; i < N; i++) {
            if (array[i] == 0) continue;
            if (array[i] % 2 != 0) {
                sumOfNumberBeforeFirstEven = sumOfNumberBeforeFirstEven + array[i];
                if (i == N - 1) {
                    sumWithOutFirstAndLast = sumOfNumberBeforeFirstEven - (array[0] + array[N - 1]);
                }
            } else {
                break;
            }
        }

        System.out.println("sumOfNumberBeforeFirstEven = " + sumOfNumberBeforeFirstEven);
        System.out.println("sumWithOutFirstAndLast = " + sumWithOutFirstAndLast);
    }
}
