package tij4.chapter_7.exercise_1;


class Tail {
    public String toString() {
        return "Tail!";
    }
}

class Fur {
    public String toString() {
        return "Fur!";
    }
}

public class Rat {
    Tail tail;
    Fur fur;

    public String toString() {
        if (tail == null) {
            tail = new Tail();
        }
        if (fur == null) {
            fur = new Fur();
        }
        return "Rat have a " + tail + " and " + fur + " now!";
    }
}
