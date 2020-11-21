package tij4.chapter_10.exercise_13;

/**
 * Create an interface with at least one method, and implement that interface by defining
 * an anounimous class within a method, which returns a reference to your interface.
 */

public class Pistol {

    public Weapon clunk() {

        return new Weapon() {
            @Override
            public void strike() {
                System.out.println("from anounimous class message");
            }
        };

    }

    public static void main(String[] args) {
        Pistol pistol = new Pistol();
        pistol.clunk().strike();
    }
}
