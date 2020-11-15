package tij4.chapter_5.exercise_10;

class AboutFinalize {
    public void finalize() {
        System.out.println("I'm finalize");
    }
}

public class Chap5_ex_10 {
    public static void main(String[] args) {
        AboutFinalize finalize = new AboutFinalize();
        finalize = new AboutFinalize();
        System.gc();
    }
}
