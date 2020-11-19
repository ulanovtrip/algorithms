package tij4.chapter_9.exercise_18.factories;

import tij4.chapter_9.exercise_18.cycles.Cycle;
import tij4.chapter_9.exercise_18.cycles.Tricycle;

public class TricycleFactory implements FactoryCommon{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
