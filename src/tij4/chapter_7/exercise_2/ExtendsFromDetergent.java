package tij4.chapter_7.exercise_2;

public class ExtendsFromDetergent extends Detergent {
    public void scrub() {
        System.out.println("ExtendsFromDetergent.scrub()");
    }

    public void sterilize() {
        System.out.println("sterilize()");
    }

    public static void main(String[] args) {
        ExtendsFromDetergent efd = new ExtendsFromDetergent();
        efd.scrub();
        efd.sterilize();
    }
}
