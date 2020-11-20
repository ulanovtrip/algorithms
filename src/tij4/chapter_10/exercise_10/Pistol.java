package tij4.chapter_10.exercise_10;

public class Pistol {

    public Weapon clunk(int i) {

        if (i == 3) {
            class Bullet implements Weapon {
                @Override
                public void strike() {
                    System.out.println("Weapon.strike()");
                }
            }
            return new Bullet();
        }
        return null;
    }

    public static void main(String[] args) {
        Pistol pistol = new Pistol();
        pistol.clunk(2).strike();
    }
}
