package tij4.chapter_13.exercise_20;

import java.util.Scanner;

class TypesContainer {
    private int anInt;
    private long aLong;
    private float aFloat;
    private String name;

    TypesContainer(String string) {
        Scanner scanner = new Scanner(string);
        name = scanner.nextLine();
        anInt = scanner.nextInt();
        aFloat = scanner.nextFloat();
        aLong = scanner.nextLong();
    }

    public String toString() {
        return name + "; " + anInt + "; " + aLong + "; " + aFloat;
    }
}

public class Ex20_13 {
    public static void main(String[] args) {
        String string = "Sir Robin of Camelot\n23 1.675 586778";
        TypesContainer typesContainer = new TypesContainer(string);
        System.out.println(typesContainer);
    }
}
