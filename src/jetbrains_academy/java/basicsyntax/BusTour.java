package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class BusTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        String heightOfBus = firstLine[0];
        String[] lineBridges = scanner.nextLine().split(" ");

        for (int i = 0; i < lineBridges.length; i++) {
            if (Integer.parseInt(heightOfBus) >= Integer.parseInt(lineBridges[i])) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
            if (i == lineBridges.length - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}
