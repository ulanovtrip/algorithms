package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.Collections;
import java.util.HashSet;

/**
 * В данном массиве найти серию подряд идущих элементов наибольшей длины,
 * в которой первое число равно последнему, второе - предпоследнему и так далее.
 * https://www.cyberforum.ru/cpp-beginners/thread1544440.html
 */

public class Task_82 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 13);
        inputArray.setValue(0, 4);
        inputArray.setValue(1, 4);
        inputArray.setValue(2, 1);
        inputArray.setValue(3, 4);
        inputArray.setValue(4, 3);
        inputArray.setValue(5, 5);
        inputArray.setValue(6, 2);
        inputArray.setValue(7, 2);
        inputArray.setValue(8, 5);
        inputArray.print();
        Utils.newLine();
        findMaxPalindrome(inputArray);
    }

    private static void findMaxPalindrome(IntegerArray inputArray) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < inputArray.getSize(); i++) {
            int currentNumber = 0;
            currentNumber = currentNumber + inputArray.getElement(i);

            for (int j = 1 + i; j < inputArray.getSize() - 1; j++) {

                currentNumber = currentNumber * 10 + inputArray.getElement(j);

                if (inputArray.getElement(i) == inputArray.getElement(j)) {

                    if (isPalindrome(currentNumber)) {
                        set.add(currentNumber);
                    }

                } else {
                    continue;
                }
            }
        }

        Utils.print("Palindromes: ");
        for (Integer x : set) {
            System.out.print(x + "; ");
        }

        Utils.newLine();
        Utils.print("Maximum palindrome: " + Collections.max(set));
    }

    private static boolean isPalindrome(int number) {
        int palindrome = number;
        int revers = 0;
        while (palindrome > 0) {
            int remainder = palindrome % 10;
            revers = revers * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return revers == number;
    }
}
