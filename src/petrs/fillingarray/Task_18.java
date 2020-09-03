package petrs.fillingarray;

/**
 * Придумайте правило генерации массива заданной длины.
 * Определите, сгенерирован ли данный массив вашим правилом или нет.
 */

public class Task_18 {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 - 1;
        }

        checkRule(array);

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + "|");
            }
        }
    }

    static void checkRule(int[] array) {
        int current = 0;
        int step = 1;
        if((array[current] +2 ) == array[step]) {
            System.out.println("Success");
        }
    }
}
