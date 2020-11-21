package tij4.chapter_10.exercise_11;

/**
 * Create a private inner class that implements a public interface. Write a method
 * that returns a reference to an instance of the private inner class, upcast to the interface.
 * Show that the inner class is completely hidden by trying to downcast to it.
 */

class OuterClass {

    private class InnerEx11 implements OpenInterface {
        @Override
        public void show() {
            System.out.println("testMessage from Inner class: ");
        }
    }


    OpenInterface getObject() {
        return new InnerEx11();
    }


    public static void main(String[] args) {
        OuterClass ex11_10 = new OuterClass();
        ex11_10.getObject().show();
    }
}


public class Ex11_10 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.getObject().show();

        // ((InnerEx11)outerClass.getObject()).show();
    }
}
