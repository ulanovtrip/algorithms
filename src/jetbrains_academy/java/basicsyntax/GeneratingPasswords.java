package jetbrains_academy.java.basicsyntax;

import java.util.Arrays;
import java.util.Scanner;

public class GeneratingPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperCaseLetters = scanner.nextInt();
        int lowerCaseLetters = scanner.nextInt();
        int digits = scanner.nextInt();
        int size = scanner.nextInt();
        int includesSymbols = size;
        char[] output = generate(upperCaseLetters, lowerCaseLetters, digits, size, includesSymbols);
        clearAndPrint(output);
    }

    public static char[] generate(int upperCaseLetters, int lowerCaseLetters, int digits, int size, int includesSymbols) {
        char[] output = new char[size];
        int step = 0;
        char a = 'A';
        char b = 'b';
        char num = '0';
        if (lowerCaseLetters == 0 && upperCaseLetters == 0 && digits == 0 && size == 1) {
            output[0] = '$';
            return output;
        }
        while (true) {
            if (upperCaseLetters > 0) {
                if (a == 'Z') {
                    a = 'A';
                }
                a = (char) (a + 1);
                output[step] = a;
                step += 1;
                upperCaseLetters -= 1;
                includesSymbols -= 1;
            } else if (lowerCaseLetters > 0) {
                if (b == 'z') {
                    b = 'b';
                }
                b = (char) (b + 1);
                output[step] = b;
                step += 1;
                lowerCaseLetters -= 1;
                includesSymbols -= 1;
            } else if (digits > 0) {
                if (num == '9') {
                    num = '0';
                }
                num = (char) (num + 1);
                output[step] = num;
                step += 1;
                digits -= 1;
                includesSymbols -= 1;
            }

            if (lowerCaseLetters + upperCaseLetters + digits == 0 && size > 1) {
                if (step == size) {
                    break;
                }
                if (num == '9') {
                    num = '0';
                }
                num = (char) (num + 1);
                output[step] = num;
                step += 1;
                includesSymbols -= 1;
            }

            if (includesSymbols == 0) {
                break;
            }
        }

        return output;
    }

    public static void clearAndPrint(char[] output) {
        String out = Arrays.toString(output);
        String clear = out.replaceAll(", ", "");
        String clear2 = clear.replaceAll("\\[", "");
        String clear3 = clear2.replaceAll("]", "");
        System.out.println(clear3);
    }
}
