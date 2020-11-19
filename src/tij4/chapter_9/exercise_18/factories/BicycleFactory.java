package tij4.chapter_9.exercise_18.factories;

import tij4.chapter_9.exercise_18.cycles.Bicycle;
import tij4.chapter_9.exercise_18.cycles.Cycle;

public class BicycleFactory implements FactoryCommon{

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
