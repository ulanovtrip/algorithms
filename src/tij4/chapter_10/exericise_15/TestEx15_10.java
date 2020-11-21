package tij4.chapter_10.exericise_15;

/**
 * Create a class with a non-default constructor and no default constructor.
 * Create a second class that has a method that returns a reference to an object of the first class.
 * Create the object that you return by making an anonymous inner class that inherits
 * from the first class.
 */


class Ex15_10 {
    int i;
    Ex15_10(int i, char j) {
        System.out.println("Ex15_10.constructor");
    }

    void printText() {
        System.out.println("text from Ex15_10 and i = " + i);
    }
}

public class TestEx15_10 {

    Ex15_10 getInstance(int i, char j) {
        return new Ex15_10(i, j);
    }

    public static void main(String[] args) {
        TestEx15_10 testEx15_10 = new TestEx15_10();
        testEx15_10.getInstance(4, 't').printText();

    }
}
