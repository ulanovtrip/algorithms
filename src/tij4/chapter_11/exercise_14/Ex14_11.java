package tij4.chapter_11.exercise_14;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex14_11 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] array = {1, 2, 4, 7, 9};
        addToList(list, array);
    }

    static void addToList(List<Integer> list, int[] array) {
        for (Integer i : array) {
            ListIterator<Integer> listIterator = list.listIterator((list.size()) / 2);
            listIterator.add(i);
            System.out.println(list);
        }
    }
}
