package petrs.fillingarray;

/**
 * Сформировать массив из случайных чисел, в которых ровно две единицы, стоящие на случайных позициях.
 */

public class Task_13 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (2 + Math.random() * 10);
        }

        int firstOne = (int) (2 + Math.random() * 10);
        int secondOne = 0;

        if (firstOne > 0 && firstOne < randomArray.length) {
            secondOne = firstOne - 1;
        }

        randomArray[firstOne] = 1;
        randomArray[secondOne] = 1;

        for (int i = 0; i < randomArray.length; i++) {
            if (i == randomArray.length - 1) {
                System.out.println(randomArray[i]);
            } else {
                System.out.print(randomArray[i] + "-");
            }
        }
    }
}
