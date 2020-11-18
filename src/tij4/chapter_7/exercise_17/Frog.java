package tij4.chapter_7.exercise_17;

public class Frog extends Amphibian {

    @Override
    public void jump() {
        System.out.println("jump Frog");
    }

    @Override
    public void eat() {
        System.out.println("eat Frog");
    }

    public static void main(String[] args) {
        Amphibian frog = new Amphibian();
        Frog frog1 = new Frog();
        frog.eat();
        frog.jump();
        frog1.eat();
        frog1.eat();
    }
}
