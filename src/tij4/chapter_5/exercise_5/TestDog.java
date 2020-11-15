package tij4.chapter_5.exercise_5;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(2);
        dog.bark(3.0);
        dog.bark('k');
    }
}
