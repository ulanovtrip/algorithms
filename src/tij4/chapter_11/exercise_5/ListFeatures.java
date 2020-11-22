package tij4.chapter_11.exercise_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("1: " + nums);

        List<Integer> sub = nums.subList(0,5);
        System.out.println("part of list: " + sub);
        System.out.println("2: " + sub.containsAll(sub));
        Collections.shuffle(sub);
        System.out.println("shuffle: " + sub);
        Collections.sort(sub);
        System.out.println("sort: " + sub);
    }
}
