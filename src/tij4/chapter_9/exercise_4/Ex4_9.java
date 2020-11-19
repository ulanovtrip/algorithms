package tij4.chapter_9.exercise_4;

public class Ex4_9 extends EmptyAbstract {
    void someMethod() {
        System.out.println("Ex4_9.someMethod()");
    }

    public static void main(String[] args) {
        Ex4_9 obj = new Ex4_9();
        obj.someMethod();
        gettingLink(obj);
    }
}
