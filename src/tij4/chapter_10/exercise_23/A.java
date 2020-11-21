package tij4.chapter_10.exercise_23;

public class A {
    U createU() {
        return new U() {
            @Override
            public void one() {
                System.out.println("one");
            }

            @Override
            public void two() {
                System.out.println("two");
            }

            @Override
            public void three() {
                System.out.println("three");
            }
        };
    }
}
