package tij4.chapter_10.exercise_21;

public class TestEx21_10 implements Ex21_10 {
    public void chop() {
        System.out.println("TestEx21_10.chop");
    }

    public void pack() {
        System.out.println("TestEx21_10.pack");
    }

    public static void main(String[] args) {
        TestEx21_10 testEx21_10 = new TestEx21_10();
        testEx21_10.chop();
        testEx21_10.pack();

        Ex21_10.NestedClass.show(testEx21_10);
    }
}
