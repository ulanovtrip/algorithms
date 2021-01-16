package jetbrains_academy.java.problemsoftheday;

import java.util.Scanner;

public class DoubleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        StringBuilder outputString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            String currentSymbol = String.valueOf(inputString.charAt(i));
            outputString.append(currentSymbol);
            outputString.append(currentSymbol);
        }
        System.out.println(outputString.toString());
    }
}
