package tij4.chapter_10.exercise_3;

public class Outer {

    private String name;

    Outer() {
        name = "Name from Outer constructor";
    }

    class Inner {
        void sheo() {

        }

        @Override
        public String toString() {
            return "super.name: " + name;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.returnInnerObj();
        inner.sheo();
        System.out.println(inner);
    }

    Inner returnInnerObj() {
        return new Inner();
    }
}
