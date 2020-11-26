package tij4.chapter_11.exercise_18;

/* Fill a HashMap with key-value pairs.
 * Print the results to show ordering by hash code.
 * Extract the pairs, sort by key, and place the result into a
 * LinkedHashMap.
 * Show that the insertion order is maintained.
 */

import java.util.*;

class Gerbil {
    int gerbilNumber;

    Gerbil(int x) {
        gerbilNumber = x;
    }

    String hop() {
        return "gerbilNumber = " + gerbilNumber;
    }
}

public class Ex18_11 {
    public static void main(String[] args) {
        LinkedHashMap<String, Gerbil> linkedHashMap = new LinkedHashMap<>();
        Map<String, Gerbil> map = new HashMap<>();
        map.put("F", new Gerbil(11));
        map.put("B", new Gerbil(22));
        map.put("A", new Gerbil(33));
        System.out.println(map);
        Set<String> sorterKeys = new HashSet<>(map.keySet());
        System.out.println(sorterKeys);

        for (String k : sorterKeys) {
            linkedHashMap.put(k, map.get(k));
        }

        System.out.println(linkedHashMap.keySet());
    }
}
