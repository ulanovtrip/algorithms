package tij4.chapter_8.exercise_1;

public class TestForCycle {
    public static void main(String[] args) {
        Cycle tricycle = new Tricycle();
        Cycle bicycle = new Bicycle();
        Cycle unicycle = new Unicycle();

        tricycle.ride();
        bicycle.ride();
        unicycle.ride();
    }
}
