package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        String regexDigits = "\\d+";
        for (String word : strings) {
            stringBuilder.append(word);
        }
        String out = (stringBuilder.toString()).replaceAll(regexDigits, "");
        return out;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}