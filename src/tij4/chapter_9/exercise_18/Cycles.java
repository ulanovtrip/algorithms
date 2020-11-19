package tij4.chapter_9.exercise_18;


import tij4.chapter_9.exercise_18.cycles.Cycle;
import tij4.chapter_9.exercise_18.cycles.Unicycle;
import tij4.chapter_9.exercise_18.factories.BicycleFactory;
import tij4.chapter_9.exercise_18.factories.FactoryCommon;
import tij4.chapter_9.exercise_18.factories.UnicycleFactory;

public class Cycles {
    static void rideOnCycle(FactoryCommon factoryCommon) {
        Cycle cycle = factoryCommon.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideOnCycle(new BicycleFactory());
        rideOnCycle(new UnicycleFactory());
    }
}
