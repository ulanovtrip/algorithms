package tij4.chapter_11.exercise_25;

import tij4.examples.TextFile;

import java.util.*;

/* Create a Map<String, ArrayList<Integer>>. Use net.mindview.TextFile
 * to open a text file and read it in a word at a time (use "\\W+\" as
 * the second argument to the TextFile constructor). Count the words as
 * you read them in, and for each word in the file, record in the
 * ArrayList<Integer> the word count associated with that word - that is,
 * in effect, the location in the file where that word was found.
 */

public class Ex15_11 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> outputMap = new HashMap<>();

        List<String> words = new LinkedList<>(
                new TextFile("src/tij4/chapter_11/exercise_25/Ex15_11.java", "\\W+")
        );

        Iterator<String> iteratorForWords = words.listIterator();

        int counter = 0;

        while (iteratorForWords.hasNext()) {
            String currentWord = iteratorForWords.next();
            counter += 1;
            if (!outputMap.keySet().contains(currentWord)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(0, counter);
                outputMap.put(currentWord, list);
            } else {
                outputMap.get(currentWord).add(counter);
                outputMap.put(currentWord, outputMap.get(currentWord));
            }
        }


        System.out.println(outputMap);
    }
}
