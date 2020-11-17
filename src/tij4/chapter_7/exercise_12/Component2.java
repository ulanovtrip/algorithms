package tij4.chapter_7.exercise_12;

public class Component2 extends Root{
    public Component2() {
        System.out.println("Component2 constructor");
    }

    public void dispose() {
        System.out.println("Dispose Component2");
        super.dispose();
    }
}
