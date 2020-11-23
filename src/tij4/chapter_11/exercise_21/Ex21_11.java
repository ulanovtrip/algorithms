package tij4.chapter_11.exercise_21;

import tij4.chapter_11.TextFile;

import java.util.*;

public class Ex21_11 {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>(
                new TextFile("src/tij4/chapter_11/exercise_21/Ex21_11.java", "\\W+")
        );
        countWords(words);
    }

    static void countWords(List<String> words) {
        Map<String, Integer> mapWords = new HashMap<>();
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String currentWord = iterator.next();
            if (words.contains(currentWord)) {
                Integer countInMap = mapWords.get(currentWord);
                mapWords.put(currentWord, countInMap == null ? 1 : countInMap + 1);
            }
        }

        Iterator iterator2 = mapWords.entrySet().iterator();

        while (iterator2.hasNext()) {
            Map.Entry element = (Map.Entry) iterator2.next();
            System.out.println(element.getKey() + " -> was found: " + element.getValue());
        }
    }
}
