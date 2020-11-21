package tij4.chapter_10.exercixe_16;

public class Bicycle implements Cycle {

    Bicycle() {
        System.out.println("Bicycle.constructor");
    }

    public void ride() {
        System.out.println("Bicycle.ride()");
    }

    public static CyclesFactory cyclesFactory = new CyclesFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}
