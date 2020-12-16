package stepik.methods_1.gcd;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        euclidGCD(firstNum, secondNum);
    }

    public static void euclidGCD(int firstNum, int secondNum) {
        if (firstNum == 0) {
            System.out.print(secondNum);
        } else if (secondNum == 0) {
            System.out.print(firstNum);
        } else if (firstNum >= secondNum) {
            int remainder = firstNum % secondNum;
            euclidGCD(remainder, secondNum);
        } else if (secondNum >= firstNum) {
            int remainder = secondNum % firstNum;
            euclidGCD(remainder, firstNum);
        }
    }
}
