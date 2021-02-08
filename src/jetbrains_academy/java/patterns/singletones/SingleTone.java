package jetbrains_academy.java.patterns.singletones;

public class SingleTone {
    public static void main(String[] args) {
        System.out.println(A.getInstance("foo").getS());
        System.out.println(A.getInstance("bar").getS());
        System.out.println(A.getNewInstance("foo").getS());
        System.out.println(A.getNewInstance("bar").getS());
        A instance = A.getInstance("thx");
        System.out.println(instance.getS());
    }
}

class A {

    private static A instance;

    private String s;

    private A (String s) {
        this.s = s;
    }

    public static A getInstance(String s) {
        if (instance == null) {
            instance = new A(s);
        }
        return instance;
    }

    public static A getNewInstance(String s) {
        return new A(s);
    }

    public String getS() {
        return s;
    }
}
