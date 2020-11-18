package tij4.chapter_7.exercise_14;

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            leftDoor = new Door(),
            rightDoor = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.leftDoor.open();
        car.engine.start();
        car.rightDoor.window.rollUp();
        car.wheel[2].inflate(70);
        car.engine.service();
    }
}
