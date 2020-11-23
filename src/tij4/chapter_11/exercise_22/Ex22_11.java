package tij4.chapter_11.exercise_22;

import tij4.chapter_11.TextFile;

import java.util.*;

/**
 * http://greggordon.org/java/tij4/holding/UniqueWords22.java
 */

class MyContainer {
    private String name;
    private int count;

    MyContainer(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String toString() {
        return "Container: " + name + "; Count: " + count;
    }
}

public class Ex22_11 {
    public static void main(String[] args) {
        Set<MyContainer> setOfContainers = new HashSet<>();
        LinkedList<String> words = new LinkedList<>(
                new TextFile("src/tij4/chapter_11/exercise_22/Ex22_11.java", "\\W+")
        );

        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);

        Iterator<String> iterator = words.iterator();

        int count = 0;
        while (iterator.hasNext()) {
            String currentWord = iterator.next();

            for (int i = 0; i < words.size(); i++) {
                if(currentWord.equals(words.get(i))) {
                    count += 1;
                }
            }
            setOfContainers.add(new MyContainer(currentWord, count));
        }

        for(MyContainer i : setOfContainers) {
            System.out.println(i);
        }
    }
}
