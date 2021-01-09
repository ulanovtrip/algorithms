package jetbrains_academy.java.basicsyntax;

class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes++;
        if (minutes > 59) {
            hours++;
            minutes = 0;
        }
        if (hours > 12) {
            hours = 1;
            minutes = 0;
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        for (int i = 0; i < 10000; i++) {
            clock.next();
        }
    }
}