package tij4.chapter_18.exercise_21;

import java.util.Scanner;

public class Ex21_18_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(line.toUpperCase());
        System.out.println(stringBuilder);
    }
}
