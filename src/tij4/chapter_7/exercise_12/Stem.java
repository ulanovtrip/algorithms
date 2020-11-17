package tij4.chapter_7.exercise_12;

public class Stem extends Root {
    public Stem() {
        System.out.println("Stem constructor");
    }

    public void dispose() {
        component1.dispose();
        component2.dispose();
        component3.dispose();
    }

    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();
}
