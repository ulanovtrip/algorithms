package tij4.chapter_5.exercise_14;

class StaticString {
    static String field = "in point";
    static String fieldInBlock;

    static {
        fieldInBlock = "in static block";
    }

    static void show() {
        System.out.println(field);
        System.out.println(fieldInBlock);
    }
}

public class Chap5_ex_14 {
    public static void main(String[] args) {
        StaticString staticString = new StaticString();
        StaticString.show();
    }
}
