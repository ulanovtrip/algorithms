package tij4.chapter_10.exercise_5;

public class AmK {
    public static void main(String[] args) {
        Afk afk = new Afk();
        Afk.InnerClassAfk innerClassAfk = afk.new InnerClassAfk();
        innerClassAfk.show();
    }
}
