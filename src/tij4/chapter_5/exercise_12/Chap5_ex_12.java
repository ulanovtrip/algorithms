package tij4.chapter_5.exercise_12;

class Tank {
    boolean full = false;

    public Tank(boolean status) {
        this.full = status;
    }

    public void fill() {
        full = true;
    }

    public void empty() {
        full = false;
    }

    public void finalize() {
        if (full) {
            System.out.println("is full");
        } else {
            System.out.println("is empty");
        }
    }
}

public class Chap5_ex_12 {
    public static void main(String[] args) {
        Tank tank1 = new Tank(true);
        Tank tank2 = new Tank(true);
        tank1.empty();
        new Tank(true);
        System.gc();
    }
}
