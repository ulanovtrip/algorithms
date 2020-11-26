package tij4.chapter_11.exercise_27;


import java.util.LinkedList;
import java.util.Queue;

class Command {
    private String name;

    Command(String name) {
        this.name = name;
    }

    public String operation() {
        return name;
    }
}


class FillContainer {
    Queue<Command> myQueue = new LinkedList<>();

    public Queue<Command> fillContainer(int size) {

        for (int i = 0; i < size; i++) {
            myQueue.offer(new Command(i + " +++ "));
        }
        return myQueue;
    }

    public void showQueue() {

    }
}

public class Ex27_11 {
    public static void checkAllObjects(Queue<Command> queue) {
        while (queue.peek() != null) {
            System.out.println(queue.poll().operation());
        }
    }

    public static void main(String[] args) {
        FillContainer container = new FillContainer();
        checkAllObjects(container.fillContainer(3));
    }
}
