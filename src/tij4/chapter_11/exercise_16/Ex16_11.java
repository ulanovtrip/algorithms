package tij4.chapter_11.exercise_16;

import tij4.examples.TextFile;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Ex16_11 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("src/tij4/chapter_11/exercise_16/Ex16_11.java", "\\W+"));
        vowelsCount(words);
    }

    public static void vowelsCount(Set<String> words) {
        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        int allVowels = 0;
        for (String s : words) {
            int count = 0;
            for (Character v : s.toCharArray()) {
                if (vowels.contains(v)) {
                    count += 1;
                    allVowels += 1;
                }
            }
            System.out.println(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.println("Total vowels: " + allVowels);
    }
}
