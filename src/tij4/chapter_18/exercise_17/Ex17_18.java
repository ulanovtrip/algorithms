package tij4.chapter_18.exercise_17;

import tij4.examples.TextFile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex17_18 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] allCharsIn = TextFile.read("src/tij4/chapter_18/exercise_17/ex17.txt").toCharArray();

        Set<Character> characterSet = new TreeSet<>();

        for (char c : allCharsIn) {
            characterSet.add(c);
        }

        for (Character c : characterSet) {
            int count = 0;
            for (Character d : allCharsIn) {
                if (c.equals(d)) {
                    count += 1;
                }

            }
            map.put(c, count);
        }

        System.out.println(map);
    }
}
