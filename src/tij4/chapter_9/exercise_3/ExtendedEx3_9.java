package tij4.chapter_9.exercise_3;

public class ExtendedEx3_9 extends Ex3_5 {
    private int var = 7;
    public void print() {
        System.out.println("ExtendedEx3_9.print(); " + "var is: " + var);
    }

    public static void main(String[] args) {
        ExtendedEx3_9 x = new ExtendedEx3_9();
        x.print();
    }
}

