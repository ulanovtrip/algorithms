package tij4.chapter_7.exercise_10;

public class Stem extends Root {
    public Stem(char i) {
        super("Root");
        System.out.println("Stem constructor");
    }

    Component1 component1 = new Component1(7);
    Component2 component2 = new Component2(7.0);
    Component3 component3 = new Component3(777);
}
