package tij4.chapter_8.exercise_1;

public class Cycle {
    protected void ride() {
        System.out.println("Cycle");
    }
}

class Unicycle extends Cycle {
    public void ride() {
        System.out.println("Unicycle");
    }
}

class Bicycle extends Cycle {
    public void ride() {
        System.out.println("Bicycle");
    }
}

class Tricycle extends Cycle {
    public void ride() {
        System.out.println("Tricycle");
    }
}


