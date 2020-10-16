package petrs.converting_an_array;

import petrs.IntegerArray;
import petrs.Utils;

import java.util.HashSet;
import java.util.Set;

/**
 * Удалите в целочисленном массиве все положительные числа, которые являются палиндромами.
 * https://www.java67.com/2012/09/palindrome-java-program-to-check-number.html#ixzz4emXfiD7V
 */

public class Task_74 {
    public static void main(String[] args) {
        IntegerArray inputArray = new IntegerArray(10, 30);
        inputArray.generateRandom(10);
        inputArray.print();
        Utils.newLine();
        findPalindromeAndDelete(inputArray);
    }

    private static void findPalindromeAndDelete(IntegerArray inputArray) {
        Set<Integer> palindromes = new HashSet<>();
        int flag = 0;

        for (int i = 0; i < inputArray.getSize(); i++) {
            int palindrome = inputArray.getElement(i); // считаю первое чсло палиндромом
            int reverse = 0; // хранит реверсивное значение числа

            //в цикле while разворачиваем взятое число
            while (palindrome > 0) {
                int remainder = palindrome % 10; //вытащили последнее число из многозначного
                reverse = reverse * 10 + remainder;
                palindrome = palindrome / 10; // остаток отбросится и так сохраним первое число
            }

            // if original and reverse of number is equal means number is palindrome
            if (reverse == inputArray.getElement(i)) {
                flag = 1;
                Utils.print("Palindrome: " + inputArray.getElement(i));
                palindromes.add(inputArray.getElement(i));
            }
        }

        if (flag == 0) {
            Utils.print("Palindrome not found!");
        }

        for (int i = 0; i < inputArray.getSize(); i++) {
            if (!palindromes.contains(inputArray.getElement(i))) {
                System.out.print(inputArray.getElement(i) + "; ");
            }
        }
    }
}
