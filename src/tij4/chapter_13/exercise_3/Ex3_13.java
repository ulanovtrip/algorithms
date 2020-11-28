package tij4.chapter_13.exercise_3;

import java.io.PrintStream;
import java.util.Formatter;

class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
    }
}

public class Ex3_13 {
    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy", new Formatter(System.err));

        Turtle terry = new Turtle("Terry", new Formatter(outAlias));
        terry.move(7, 9);
        tommy.move(3, 5);
    }
}
