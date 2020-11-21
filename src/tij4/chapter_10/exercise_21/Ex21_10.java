package tij4.chapter_10.exercise_21;

/**
 * Create an interface that contains a nested class that has a static method
 * that calls the methods of your interface and displays the results. Implement your interface
 * and pass an instance of your implementation to the method.
 */

public interface Ex21_10 {

    void chop();

    void pack();

    class NestedClass {
        static void show(Ex21_10 face) {
            System.out.println("From NestedClass.show() ");
            face.chop();
            face.pack();
        }
    }
}
