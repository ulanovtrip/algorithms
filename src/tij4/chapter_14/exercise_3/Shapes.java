package tij4.chapter_14.exercise_3;

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        Rhomboid rhomboid = new Rhomboid();
        ((Shape) rhomboid).draw();

        //inconvertible types
        //((Circle) rhomboid).draw();
    }
}