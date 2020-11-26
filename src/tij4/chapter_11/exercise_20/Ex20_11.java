package tij4.chapter_11.exercise_20;

import tij4.examples.TextFile;

import java.util.*;

public class Ex20_11 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("src/tij4/chapter_11/exercise_16/Ex16_11.java", "\\W+"));
        vowelsCount(words);
    }

    public static void vowelsCount(Set<String> words) {

        Map<Character, Integer> vowelMap = new HashMap<>();

        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        for (String s : words) {
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {
                    Integer count = vowelMap.get(v);
                    vowelMap.put(v, count == null ? 1 : count + 1);
                }
            }
        }
        System.out.println("mapContainer: " + vowelMap);
    }
}
