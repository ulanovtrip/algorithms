package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class AngleBetweenVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double dotProduct = x1 * y1 + x2 * y2;
        double lengthX = Math.sqrt(x1 * x1 + x2 * x2);
        double lengthY = Math.sqrt(y1 * y1 + y2 * y2);
        double aCos = Math.acos((dotProduct) / (lengthX * lengthY));
        System.out.print(Math.toDegrees(aCos));
    }
}
