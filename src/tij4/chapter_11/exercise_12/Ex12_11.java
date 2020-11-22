package tij4.chapter_11.exercise_12;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * http://greggordon.org/java/tij4/holding/Ex12.java
 */

public class Ex12_11 {
    public static void main(String[] args) {
        List<Integer> listOne = new LinkedList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);

        List<Integer> listTwo = new LinkedList<>();

        ListIterator<Integer> listIterator = listOne.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("element: " + listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            listTwo.add(listIterator.previous());
        }

        System.out.println("====================================");

        for (Integer integer : listTwo) {
            System.out.println("listTwo: " + integer);
        }
    }
}
