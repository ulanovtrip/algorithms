package jetbrains_academy.java.basicsyntax;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int aLower = scanner.nextInt();
        int bUpper = scanner.nextInt();
        int seedOfGenerator = aLower + bUpper;
        Random random = new Random(seedOfGenerator);

        int count = 0;
        int sumOfNumbers = 0;
        while (count < n) {
            count++;
            int generatedNumber = random.nextInt(bUpper - aLower + 1) + aLower;
            sumOfNumbers += generatedNumber;
        }
        System.out.println(sumOfNumbers);
    }
}
