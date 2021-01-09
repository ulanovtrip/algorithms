package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class Quadratic {

    public static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void calculateRoots(double a, double b, double c, double discriminant) {
        double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
        if (x1 == x2) {
            System.out.println("x = " + x1);
        } else if (x1 < x2){
            System.out.println(x1 + " " + x2);
        } else if (x1 > x2) {
            System.out.println(x2 + " " + x1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = calculateDiscriminant(a, b, c);
        calculateRoots(a, b, c, discriminant);

    }
}

