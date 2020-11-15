package tij4.chapter_5.exercise_4;

class Boo {
    Boo() {
        System.out.println("Default constructor");
    }

    Boo(String string) {
        System.out.println("overloading: " + string);
    }
}

public class Chap5_ex_4 {
    public static void main(String[] args) {
        Boo boo = new Boo();
        Boo boo1 = new Boo("Rats is Fats");
    }
}
