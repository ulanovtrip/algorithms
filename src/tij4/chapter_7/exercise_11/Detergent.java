package tij4.chapter_7.exercise_11;

public class Detergent {
   private final Cleanser cleanser = new Cleanser();

    public void scrub() {
        cleanser.append(" Detergent.scrub()");
        cleanser.scrub();
    }

    public void foam() {
        cleanser.append(" foam()");
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x.cleanser);
    }
}
