package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String inWord = scanner.nextLine();
        int lengthWord = inWord.length();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if(start >= 0 && end >= 0 && start < lengthWord && end < lengthWord) {
            String substring = inWord.substring(start, end + 1);
            System.out.println(substring);
        } else {
         throw new Exception();
        }
    }
}
