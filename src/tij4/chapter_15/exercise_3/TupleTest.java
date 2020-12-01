package tij4.chapter_15.exercise_3;


class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F sixth;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        sixth = f;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "sixth=" + sixth +
                ", fifth=" + fifth +
                ", fourth=" + fourth +
                ", third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        // Autoboxing converts the int to Integer:
        return new TwoTuple<>("hi3", 47);
    }

    static ThreeTuple<Double, String, Integer> g() {
        return new ThreeTuple<>(
                333.33, "hi3", 48);
    }

    static FourTuple<Float, Double, String, Integer> h() {
        return new FourTuple<>(
                4.444F, 444.4, "hi3", 49);
    }

    static FiveTuple<String, Float, Integer, String, Integer> k() {
        return new FiveTuple<>(
                "Five", 555.5F, 55, "hi5", 50);
    }

    static SixTuple<Character, String, Float, Integer, String, Integer> six() {
        return new SixTuple<>('Q', "Six", 666.6F, 66, "hi6", 60);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(six());
    }
}
