package petrs.beforeOOP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Дан pwd.txt с логинами и паролями. Найдите топ 10 самых популярных паролей.
 */

public class Task_9 {
    public static void main(String[] args) throws IOException {
        String path = "src/petrs/beforeOOP/pwd.txt";
        readPasswords(path);
    }

    private static void readPasswords(String path) throws IOException {
        String regexEmail = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        Map<String, Integer> map = new TreeMap<>();
        Path file = Paths.get(path);
        List<String> list = Files.readAllLines(file);
        List<String> onlyPasswords = new LinkedList<>();

        for (String line : list) {
            String[] wordsFromLine = line.split("\\;");
            for (int i = 0; i < wordsFromLine.length; i++) {
                if (wordsFromLine[i].matches(regexEmail) || wordsFromLine[i].isEmpty()) {
                    continue;
                } else {
                    onlyPasswords.add(wordsFromLine[i]);
                }
            }
        }

        for (String line : onlyPasswords) {
            if (map.containsKey(line)) {
                map.put(line, map.get(line) + 1);
            } else {
                map.put(line, 1);
            }
        }

        List sortedList = new ArrayList(map.entrySet());
        sortedList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        int last = sortedList.size() - 1;
        for (int i = last; i >= last - 10; i--) {
            System.out.println(sortedList.get(i));
        }
    }
}
