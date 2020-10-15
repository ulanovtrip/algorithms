package petrs;

/**
 * Дан массив, в котором количество отрицательных элементов равно количеству положительных.
 * Поменяйте местами первый отрицательный и первый положительный,
 * второй отрицательный и второй положительный и так далее.
 */

public class Task_73 {
    public static void main(String[] args) {
        int[] inputArray = {-1, -3, 3, 5, -6, -5, -2, 7, 4, 9};
        changeEvensAndOdds(inputArray);
    }

    private static void changeEvensAndOdds(int[] inputArray) {
        int indexOfOdd = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 0) {
                for (int j = i + 1; j < inputArray.length; j++) {
                    if (inputArray[j] > 0) {
                        if (j == indexOfOdd) break;
                        int temp = inputArray[i];
                        inputArray[i] = inputArray[j];
                        inputArray[j] = temp;
                        indexOfOdd = j;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + ";");
        }
    }
}
