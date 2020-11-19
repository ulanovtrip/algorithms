package tij4.chapter_9.exercise_18.factories;

import tij4.chapter_9.exercise_18.cycles.Cycle;
import tij4.chapter_9.exercise_18.cycles.Unicycle;

public class UnicycleFactory implements FactoryCommon{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
