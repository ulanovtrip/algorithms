package tij4.chapter_10.exercise_1;

public class Outer {

    class Inner {
        void sheo() {

        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.returnInnerObj();
        inner.sheo();
    }

    Inner returnInnerObj() {
        return new Inner();
    }
}
