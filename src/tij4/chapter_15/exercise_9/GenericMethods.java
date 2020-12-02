package tij4.chapter_15.exercise_9;//: generics/GenericMethods.java

public class GenericMethods {

    public <T, U, V> void f(T x, U y, V z) {
        System.out.println(x.getClass().getName() + "; " + y.getClass().getName() + "; " + z.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("Gum", 13, 'Q');
    }
}

/* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
