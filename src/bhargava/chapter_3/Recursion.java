package bhargava.chapter_3;

public class Recursion {
    public static void main(String[] args) {
        countDown(4);
    }

    public static void countDown(int i) {
        System.out.print(i + "; ");
        if (i <= 0) {
            return;
        } else {
            countDown(i - 1);
        }
    }
}
