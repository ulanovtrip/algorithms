package tij4.chapter_10.exercise_18;

public class Ex18_10 {
    private static class NestedClass {
        void show() {
            System.out.println("message from NestedClass");
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.show();
    }
}
