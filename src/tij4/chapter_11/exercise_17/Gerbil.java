package tij4.chapter_11.exercise_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Take the Gerbil class in Exercise 1 and put it into a Map instead,
 * associating each Gerbil's name (e.g. "Fuzzy" or "Spot") as a String (the
 * key) for each Gerbil (the value) you put in the table. Get an Iterator for
 * the keySet() and use it to move through the Map, looking up the Gerbil for
 * each key and printing out the key and telling the Gerbil to hop().
 */

public class Gerbil {
    int gerbilNumber;

    Gerbil(int x) {
        gerbilNumber = x;
    }

    void hop() {
        System.out.println("gerbilNumber = " + gerbilNumber);
    }

    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<>();
        map.put("first", new Gerbil(1));
        map.put("second", new Gerbil(2));
        map.put("third", new Gerbil(3));

        //get iterator for the keySet()
        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s + ": ");
            map.get(s).hop();
        }
    }
}
