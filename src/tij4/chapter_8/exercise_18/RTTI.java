package tij4.chapter_8.exercise_18;

public class RTTI {
    public static void main(String[] args) {
        Cycle[] arrCycle = {
                new Bicycle(), new Unicycle(), new Tricycle()
        };

        ((Bicycle)arrCycle[0]).balance();
        ((Unicycle)arrCycle[1]).balance();
    }
}
