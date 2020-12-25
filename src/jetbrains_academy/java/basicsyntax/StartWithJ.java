package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class StartWithJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String start = in.substring(0, 1);

        if (start.equalsIgnoreCase("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
