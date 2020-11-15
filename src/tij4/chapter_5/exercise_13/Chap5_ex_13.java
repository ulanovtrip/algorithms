package tij4.chapter_5.exercise_13;

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class Chap5_ex_13 {
    public static void main(String[] args) {
        Cups.cup1.f(99);
    }
    //static Cups cups1 = new Cups();
}
