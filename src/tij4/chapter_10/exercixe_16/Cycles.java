package tij4.chapter_10.exercixe_16;

public class Cycles {
    public static void getCycle(CyclesFactory cyclesFactory) {
        Cycle cycles = cyclesFactory.getCycle();
        cycles.ride();
    }

    public static void main(String[] args) {
        getCycle(Bicycle.cyclesFactory);
        System.out.println("+++++++++++++");
        getCycle(UniCycle.getUnicycle);
    }
}
