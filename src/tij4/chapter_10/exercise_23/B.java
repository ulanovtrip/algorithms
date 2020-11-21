package tij4.chapter_10.exercise_23;

public class B {
    private int count = 0;
    private U[] arrayU;

    B(int size) {
        arrayU = new U[size];
    }

    public void saveLink(U u) {
        arrayU[count++] = u;
    }

    public void eraseLink(int count) {
        arrayU[count] = null;
    }

    public void rotateMethods() {
        for (int i = 0; i < count; i++) {
            arrayU[i].one();
            arrayU[i].two();
            arrayU[i].three();
        }
    }

    public static void main(String[] args) {
        A first = new A();
        A second = new A();

        B objB = new B(3);
        objB.saveLink(first.createU());
        objB.rotateMethods();

        objB.saveLink(second.createU());
        objB.rotateMethods();
    }
}
