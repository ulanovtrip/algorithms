package tij4.chapter_11.exercise_23;

import java.util.*;

/**
 * Starting with Statistics.java, create a program that runs the test repeatedly
 * and looks to see if any one number tends to appear more than the others in the
 * results.
 */

public class Ex23_11 {
    public static void main(String[] args) {
        Map<Integer, Integer> test = new TreeMap<>();
        for (int i = 0; i < 2000; i++) {
            int x = getBestInt(10000);
            Integer freq = test.get(x);
            test.put(x, freq == null ? 1 : freq + 1);
        }
        System.out.println(test);
    }

    private static int getBestInt(int n) {
        Random random = new Random(47);
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(10);
            Integer freq = integerMap.get(r);
            integerMap.put(r, freq == null ? 1 : freq + 1);
        }

        int max = 0;
        for (int i = 0; i < integerMap.size(); i++) {
            max = max < integerMap.get(i) ? integerMap.get(i) : max;
        }

        Set<Map.Entry<Integer, Integer>> me = new LinkedHashSet<Map.Entry<Integer, Integer>>(integerMap.entrySet());

        int maxKey = 0;

        Iterator<Map.Entry<Integer, Integer>> iterator = me.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> current = iterator.next();
            if(current.getValue() == max) {
                maxKey = current.getKey();
            }
        }
        return maxKey;
    }
}
