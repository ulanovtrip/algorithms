package jetbrains_academy.java.polymorphism;

public class IntBinaryOperationTest {
    public static void main(String[] args) {
        Addition addition = new Addition(2, 3);
        System.out.println(addition.perform());
        Multiplication multiplication = new Multiplication(4, 5);
        System.out.println(multiplication.perform());
    }
}

abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

class Addition extends IntBinaryOperation {

    Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    public int perform() {
        return firstArg + secondArg;
    }
}

class Multiplication extends IntBinaryOperation {

    Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    public int perform() {
        return firstArg * secondArg;
    }
}
