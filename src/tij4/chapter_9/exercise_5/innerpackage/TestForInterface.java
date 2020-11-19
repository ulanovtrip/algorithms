package tij4.chapter_9.exercise_5.innerpackage;

import tij4.chapter_9.exercise_5.Ex5_9;

public class TestForInterface implements Ex5_9 {
    public void start() {

    }

    public void stop() {

    }

    public String reverse() {
        return getClass().getSimpleName();
    }
}
