package tij4.chapter_7.exercise_12;

public class Component1 extends Root{
    public Component1() {
        System.out.println("Component1 constructor");
    }

    public void dispose() {
        System.out.println("Dispose Component1");
        super.dispose();
    }
}
