package tij4.chapter_7.exercise_10;

public class Root {
    public Root(String i) {
        System.out.println("Root constructor " + i);
    }

    Component1 component1 = new Component1(9);
    Component2 component2 = new Component2(9.0);
    Component3 component3 = new Component3(999);
}
