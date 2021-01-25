package jetbrains_academy.java.polymorphism;

public class ShapeHierarchy {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        double areatT = triangle.getArea();
        double perimeterT = triangle.getPerimeter();
        System.out.println(areatT + " +++ " + perimeterT);

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getArea() + " ==== " + rectangle.getPerimeter());

        Circle circle = new Circle(10);
        System.out.println(circle.getArea() + " ++++ " + circle.getPerimeter());
    }
}

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Rectangle extends Shape {

    private final double a;
    private final double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        return a * 2 + b * 2;
    }

    public double getArea() {
        return a * b;
    }
}

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
