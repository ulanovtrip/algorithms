package jetbrains_academy.java.basicsyntax;

import java.math.BigInteger;
import java.util.Scanner;

public class DoubleFactorial {

    public static BigInteger calcDoubleFactorial(int input) {
        BigInteger convertInt = BigInteger.valueOf(input);
        if (convertInt.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else if(convertInt.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            int temp = input - 2;
            return convertInt.multiply(calcDoubleFactorial(temp));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(calcDoubleFactorial(input));
    }
}
