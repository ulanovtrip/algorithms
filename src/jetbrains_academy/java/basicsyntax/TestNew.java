package jetbrains_academy.java.basicsyntax;

import java.util.Scanner;

public class TestNew {
    public static String prepareFullName(String firstName, String lastName) {
        if (!(firstName == null) && !(lastName == null)) {
            return firstName + " " + lastName;
        } else if (firstName == null && !(lastName == null)) {
            return lastName;
        } else if (!(firstName == null) && lastName == null) {
            return firstName;
        }
        return null;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}

