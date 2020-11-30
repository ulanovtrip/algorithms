package tij4.chapter_14.exercise_5;

import java.util.Arrays;
import java.util.List;

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

public class ShapesEx5_14 {
    public static void main(String[] args) {
        // upcasting to Shape:
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        // downcasting back to specific shape:
        for (Shape shape : shapeList)
            shape.draw();

        for (Shape shape : shapeList) {
            rotate(shape);
        }
    }

    public static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("It's Circle");
        } else {
            System.out.println("It's not a Circle");
        }
    }
}