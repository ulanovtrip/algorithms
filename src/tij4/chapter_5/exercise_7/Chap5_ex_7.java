package tij4.chapter_5.exercise_7;

class WithoutConstructor {
    public void printSomeText() {
        System.out.println("blabla");
    }
}

public class Chap5_ex_7 {
    public static void main(String[] args) {
        WithoutConstructor boom = new WithoutConstructor();
        boom.printSomeText();
    }
}
