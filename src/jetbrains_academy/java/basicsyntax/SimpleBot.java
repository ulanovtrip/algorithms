package jetbrains_academy.java.basicsyntax;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SimpleBot {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int userNumber = scanner.nextInt();

        for (int i = 0; i <= userNumber; i++) {
            System.out.println(i + "!");
        }

        test();
        end();
    }

    static void test() {
        List<String> answers = new LinkedList<>();
        answers.add("1. To repeat a statement multiple times.");
        answers.add("2. To decompose a program into several small subroutines.");
        answers.add("3. To determine the execution time of a program.");
        answers.add("4. To interrupt the execution of a program.");

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");

        for (String s : answers) {
            System.out.println(s);
        }

        String wrongAns = "Please, try again.";

        boolean flag = false;
        while (!flag) {
            int userAnswer = scanner.nextInt();
            switch (userAnswer) {
                case (1):
                case (3):
                case (4):
                    System.out.println(wrongAns);
                    continue;
                case (2):
                    flag = true;
                    break;
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}