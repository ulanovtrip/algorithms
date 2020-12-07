package tij4.chapter_17.exercise_13;

import tij4.examples.TextFile;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import static tij4.examples.util.Print.print;

public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length) {
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
        Set<String> uniqueWords = new TreeSet<>(
                new TextFile("src/tij4/chapter_17/exercise_11/Ex11_17.java", "\\W+")
        );
        ArrayList<String> allWords = new TextFile("src/tij4/chapter_17/exercise_11/Ex11_17.java", "\\W+");
        AssociativeArray<String, Integer> outMap = new AssociativeArray<>(allWords.size());

        for (String word : uniqueWords) {
            int count = 0;
            for (String s : allWords) {
                if (s.equals(word)) {
                    count += 1;
                    outMap.put(word, count);
                }
            }
        }
        print(outMap);
    }
}
