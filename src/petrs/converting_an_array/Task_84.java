package petrs.converting_an_array;


import java.util.stream.IntStream;

/**
 * Дано натуральное число n от 9 до 10^7.
 * Необходимо найти минимальное число k такое, что произведение цифр этого числа равно n.
 * Например, для n=20 ответ равен 45.
 */

public class Task_84 {
    public static void main(String[] args) {
        int end = (int) Math.pow(10, 7);
        int start = 9;
        int[] input = IntStream.range(start,end).toArray();


    }
}
