package tij4.chapter_15.exercise_6;//: generics/RandomList.java

import java.util.*;

class MyOwnNode {
    private String name;

    MyOwnNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class RandomListEx6_15<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomListEx6_15<String> rs = new RandomListEx6_15<>();

        for (String s : ("The quick brown fox jumped over the lazy brown dog").split(" "))
            rs.add(s);

        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");

        RandomListEx6_15<MyOwnNode> listEx6_15 = new RandomListEx6_15<>();
        for (String name : ("Самый популярный в мире").split(" ")) {
            listEx6_15.add(new MyOwnNode(name));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(listEx6_15.select().getName() + "; ");
        }
    }
}

/* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
