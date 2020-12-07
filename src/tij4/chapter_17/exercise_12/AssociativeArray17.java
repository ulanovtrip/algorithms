package tij4.chapter_17.exercise_12;//: containers/AssociativeArray.java
// Associates keys with values.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static tij4.examples.util.Print.print;

public class AssociativeArray17<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray17(int length) {
        pairs = new Object[length][2];
    }

    public void put(K key, V value) {
        if (index >= pairs.length)
            throw new ArrayIndexOutOfBoundsException();
        pairs[index++] = new Object[]{key, value};
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        for (int i = 0; i < index; i++)
            if (key.equals(pairs[i][0]))
                return (V) pairs[i][1];
        return null; // Did not find key
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(pairs[i][0].toString());
            result.append(" : ");
            result.append(pairs[i][1].toString());
            if (i < index - 1)
                result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        AssociativeArray17<String, String> map =
                new AssociativeArray17<>(6);
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");
        print(map);
        print(map.get("ocean"));
      System.out.println("------------------------------");

        Map<String, String> hsMap = new HashMap<>();
        hsMap.put("sky", "blue");
        hsMap.put("grass", "green");
        hsMap.put("ocean", "dancing");
        hsMap.put("earth", "brown");
        print(hsMap);
      System.out.println("------------------------------");
      Map<String, String> treeMap = new TreeMap<>();
      treeMap.put("Bool", "Red");
      treeMap.put("Dog", "Black");
      treeMap.put("Cat", "Green");
      System.out.println(treeMap);
      System.out.println(treeMap.get("Dog"));
    }
}

/* Output:
Too many objects!
sky : blue
grass : green
ocean : dancing
tree : tall
earth : brown
sun : warm
dancing
*///:~
