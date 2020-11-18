package tij4.chapter_8.exercise_18;

class Cycle {
    protected void ride() {
        System.out.println("Cycle");
    }
}

class Unicycle extends Cycle {
    public void ride() {
        System.out.println("Unicycle");
    }

    public void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {
    public void ride() {
        System.out.println("Bicycle");
    }

    public void balance() {
        System.out.println("Bicycle.balance()");
    }


}

class Tricycle extends Cycle {
    public void ride() {
        System.out.println("Tricycle");
    }

    public void balance() {
        System.out.println("Tricycle.balance()");
    }
}


