package tij4.chapter_10.exercixe_16;

public class UniCycle implements Cycle {

    UniCycle() {
        System.out.println("UniCycle.constructor");
    }

    public void ride() {
        System.out.println("Unicycle.ride()");
    }

    public static CyclesFactory getUnicycle = new CyclesFactory() {
        public Cycle getCycle() {
            return new UniCycle();
        }
    };
}
