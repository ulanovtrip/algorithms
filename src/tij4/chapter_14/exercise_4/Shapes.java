package tij4.chapter_14.exercise_4;

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

        //Shape shape = (Shape) rhomboid;
        Circle circle = new Circle();
        Shape shape = (Shape) circle;

        if (shape instanceof Circle) {
            ((Circle) shape).draw();
        } else if (!(shape instanceof Circle)) {
            System.out.println("Not a Cicle");
        }
    }
}