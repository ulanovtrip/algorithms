package tij4.chapter_11.exercise_24;

import tij4.examples.TextFile;

import java.util.*;

/**
 * http://greggordon.org/java/tij4/holding/Ex24.java
 */

public class Ex24_11 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>(
                new TextFile("src/tij4/chapter_11/exercise_24/Ex24_11.java", "\\W+")
        );

        Map<String, Integer> inputMap = new LinkedHashMap<>();

        Iterator<String> iterator = words.iterator();

        int position = 0;
        while (iterator.hasNext()) {
            String currentWord = iterator.next();
            inputMap.put(currentWord, ++position);
        }

        // temporary map to hold entries:
        Map<String, Integer> mTemp = new LinkedHashMap<>();

        //use TreeSet to sort the keySet():
        Set<String> sortedInputMap = new TreeSet<>(
                //извлечение всех key из inputMap в TreeSet
                inputMap.keySet()
        );

        //move sorted keys to temp inputMap:
        Iterator<String> iteratorForSs = sortedInputMap.iterator();

        while (iteratorForSs.hasNext()) {
            String s = iteratorForSs.next();
            //получение значения по ключу из inputMap
            Integer i = inputMap.get(s);
            //удаление объекта из inputMap
            inputMap.remove(s);
            //сохранение во временную Map в сортированном виде.
            mTemp.put(s, i);
        }

        // get sorted list of temp keys:
        Set<String> ssTemp = new TreeSet<>(
                mTemp.keySet()
        );

        // move sorted entrys back to inputMap:
        Iterator<String> itssTemp = ssTemp.iterator();

        while (itssTemp.hasNext()) {
            //взятие строки из списка
            String s = itssTemp.next();
            //значение по ключу во временной map
            Integer i = mTemp.get(s);
            //удаление из временной
            mTemp.remove(s);
            //запись обратно в inputMap
            inputMap.put(s, i);
        }

        mTemp.clear();
        System.out.println("Sorted inputMap: " + inputMap);
    }
}
