package tij4.chapter_10.exercise_9;

public class Pistol {

    public Weapon clunk() {
        class Bullet implements Weapon {
            @Override
            public void strike() {
                System.out.println("Weapon.strike()");
            }
        }
        return new Bullet();
    }

    public static void main(String[] args) {
        Pistol pistol = new Pistol();
        pistol.clunk().strike();
    }
}
