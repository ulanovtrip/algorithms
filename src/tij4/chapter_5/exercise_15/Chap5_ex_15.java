package tij4.chapter_5.exercise_15;

class InitSectionTest {
    String name;
    String surname;

    {
        name = "aljk";
        surname = "lj;l";
    }

    public void show() {
        System.out.println(name + "; " + surname);
    }
}

public class Chap5_ex_15 {
    public static void main(String[] args) {
        InitSectionTest test = new InitSectionTest();
        test.show();
    }
}
