package petrs.converting_an_array;

/**
 * Даны два упорядоченных по возрастанию массива.
 * Образовать из этих двух массивов единый упорядоченный по возрастанию массив.
 * https://pas1.ru/arrayconflux
 */

public class Task_79 {
    public static void main(String[] args) {
        int[] first = {1, 6, 8, 12};
        int[] second = {3, 7, 9, 10};
        crateCommonArray(first, second);
    }

    private static void crateCommonArray(int[] first, int[] second) {
        if (first.length == 0 || second.length == 0) return;
        int[] output = new int[first.length + second.length];

        int outputIndex = 0;
        for (int i = 0; i < output.length - 4; i++, outputIndex++) {

            if (first[i] < second[i]) {
                output[outputIndex] = first[i];
                output[outputIndex + 1] = second[i];
                outputIndex++;
            } else {
                output[outputIndex] = second[i];
                output[outputIndex + 1] = first[i];
                outputIndex++;
            }
        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + "; ");
        }
    }
}
