package tij4.chapter_7.exercise_12;

public class Component3 extends Root{
    public Component3() {
        System.out.println("Component3 constructor");
    }

    public void dispose() {
        System.out.println("Dispose Component3");
        super.dispose();
    }
}
