package tij4.chapter_17.exercise_11;

/* Create a class that contains an Integer that is initialized
 * to a value between 0 and 100 using java.util.Random. Implement
 * Comparable using this Integer field. Fill a PriorityQueue with
 * objects of your class, and extract the values using poll() to
 * show that it produces the expected order.
 */

import java.util.PriorityQueue;
import java.util.Random;

class Grock implements Comparable<Grock> {
    private Integer nums;

    Grock() {
        Random random = new Random();
        nums = random.nextInt(100);
    }

    @Override
    public int compareTo(Grock o) {
        int d = nums - o.nums;
        return d < 0 ? -1 : d == 0 ? 0 : 1;
    }

    @Override
    public String toString() {
        return Integer.toString(nums);
    }
}

public class Ex11_17 {
    public static void main(String[] args) {
        PriorityQueue<Grock> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            priorityQueue.add(new Grock());
        }

        int size = priorityQueue.size();

        for (int i = 0; i < size; i++) {
            System.out.print(priorityQueue.poll() + "; ");
        }
    }
}
