package jetbrains_academy.java.patterns.singletones;

public class TheEagerSingleton {
    public static void main(String[] args) {
        SimpleCounter counter = SimpleCounter.getInstance();
    }
}

class SimpleCounter {

    public int counter = 0;

    private static final SimpleCounter instance = new SimpleCounter();

    private SimpleCounter() {
    }

    public static SimpleCounter getInstance() {
        return instance;
    }
}

