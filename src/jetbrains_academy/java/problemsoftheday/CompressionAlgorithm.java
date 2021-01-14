package jetbrains_academy.java.problemsoftheday;

import java.util.Scanner;

public class CompressionAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charsOrigin = scanner.nextLine().toCharArray();
        StringBuilder builder = new StringBuilder();

        if (charsOrigin.length == 1) {
            String symbol = String.valueOf(charsOrigin[0]);
            builder.append(symbol + "1");
        }

        int countChar = 0;
        for (int i = 0; i < charsOrigin.length - 1; i++) {

            if (i == charsOrigin.length - 2 && charsOrigin[i] == charsOrigin[i - 1] && charsOrigin[i] != charsOrigin[i + 1]) {
                String symbol = String.valueOf(charsOrigin[i]);
                builder.append(symbol + ++countChar);
                countChar = 0;
            }

            if (charsOrigin.length == 3 && countChar == 0 && i == charsOrigin.length - 2) {
                String symbol = String.valueOf(charsOrigin[i + 1]);
                builder.append(symbol + "1");
                break;
            }

            if (charsOrigin[i] == charsOrigin[i + 1]) {
                countChar++;
            }

            if (i == charsOrigin.length - 2 && countChar > 0) {
                String symbol = String.valueOf(charsOrigin[i]);
                builder.append(symbol + ++countChar);
            }

            if (charsOrigin[i] != charsOrigin[i + 1] && countChar == 0) {
                String symbol = String.valueOf(charsOrigin[i]);
                builder.append(symbol + "1");
                countChar = 0;
            }

            if (charsOrigin[i] != charsOrigin[i + 1] && countChar > 0) {
                countChar++;
                String symbol = String.valueOf(charsOrigin[i]);
                builder.append(symbol + countChar);
                countChar = 0;
            }

            if (i == charsOrigin.length - 2 && charsOrigin[i] != charsOrigin[i - 1] && countChar == 0) {
                builder.append(charsOrigin[i + 1] + "1");
            }
        }
        System.out.println(builder.toString());
    }
}
