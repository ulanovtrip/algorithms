package tij4.chapter_8.exercise_17;

class Starship {
    public void show() {
        System.out.println("Base");
    }
}

class Car extends Starship {
    public void show() {
        System.out.println("Car");
    }
}

class Bike extends Starship {
    public void show() {
        System.out.println("Bike");
    }
}

class Stage {
    private Starship starship = new Bike();

    public void change() {
        starship = new Car();
    }

    public void show() {
        starship.show();
    }
}
