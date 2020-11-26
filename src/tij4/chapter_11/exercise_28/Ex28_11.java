package tij4.chapter_11.exercise_28;


import java.util.PriorityQueue;
import java.util.Random;

public class Ex28_11 {
    public static void main(String[] args) {
        int size = 10;
        Random random = new Random();
        Double[] inputForQueue = new Double[size];

        for (int i = 0; i < size; i++) {
            double newDouble = random.nextDouble();
            double scale = Math.pow(10, 3);
            double result = Math.ceil(newDouble * scale) / scale;
            inputForQueue[i] = result;
        }

        PriorityQueue<Double> priorityQueueDouble = new PriorityQueue<Double>();

        for (int i = 0; i < size; i++) {
            priorityQueueDouble.offer(inputForQueue[i]);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(priorityQueueDouble.poll() + "; ");
        }
    }
}
