package tij4.chapter_15.exercise_1;

class Automobile {

}

class Ford extends Automobile {

}

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.get();
        Holder3<Ford> h4 = new Holder3<>(new Ford());
    }
}
