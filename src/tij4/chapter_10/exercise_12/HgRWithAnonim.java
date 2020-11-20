package tij4.chapter_10.exercise_12;

/**
 * Create a class with a private field and a private method.
 * Create an inner class with a method that modifies the outer-class field and calls the outer class method.
 * In a second outer-class method, create an object of the inner class and call its method,
 * then show the effect on the outer-class object.
 */

public class HgRWithAnonim {
    private int count = 8;

    private void changeCount() {
        System.out.println("HgR.changeCount()");
    }

    class InnerHgR {
        void swap() {
            count = 10;
            changeCount();
        }
    }

    InnerHgR show() {
        return new InnerHgR() {
            @Override
            void swap() {
                super.swap();
            }
        };
    }

    public static void main(String[] args) {
        new HgRWithAnonim().show().swap();
    }
}
