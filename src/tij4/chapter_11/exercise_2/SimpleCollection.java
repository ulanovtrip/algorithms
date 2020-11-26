package tij4.chapter_11.exercise_2;

import java.util.Collection;
import java.util.TreeSet;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> set = new TreeSet();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }

        for (Integer obj : set) {
            System.out.print(obj + "; ");
        }
    }
}
