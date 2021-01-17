package jetbrains_academy.java.basicsyntax;

import java.math.BigInteger;
import java.util.Scanner;

public class ExpressionWithBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();
        BigInteger d = scanner.nextBigInteger();
        BigInteger result = ((a.negate()).multiply(b)).add(c.subtract(d));
        System.out.println(result);
    }
}
