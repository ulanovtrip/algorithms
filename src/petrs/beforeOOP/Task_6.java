package petrs.beforeOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Заменить все ссылки и email на ***** (количество звездочек равно длине заменяемого фрагмента).
 * Примеры ссылок: www.site.com, http://site.com и т.п.
 * Решить двумя способами: с использованием регулярных выражений и без.
 * Сравнить скорости работы.
 */

public class Task_6 {
    public static void main(String[] args) throws IOException {
        String path = "/home/uis/Projects/algorithms/src/petrs/beforeOOP/inputTask_6.txt";
        List<String> list = readFile(path);
        changeFile(list);
    }

    private static List<String> readFile(String path) {
        Path file = Paths.get(path);
        List<String> list = null;
        try {
            list = Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void changeFile(List<String> list) throws IOException {
        String regexEmail = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String regexUrlHttp = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}" +
                "\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)";
        String regexDoNotHttp = "[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=,.]*)";

        FileWriter fileWriter = new FileWriter("/home/uis/Projects/algorithms/src/petrs/beforeOOP/outFileTask_6.txt");

        for (String line : list) {
            String[] word = line.split(" ");
            for (int i = 0; i < word.length; i++) {
                if (word[i].matches(regexUrlHttp) || word[i].matches(regexEmail) || word[i].matches(regexDoNotHttp)) {
                    char[] chars = word[i].toCharArray();
                    for (int j = 0; j < chars.length; j++) {
                        chars[j] = '*';
                    }
                    String secretWord = String.valueOf(chars);
                    fileWriter.write(secretWord + " ");
                } else {
                    fileWriter.write(word[i] + " ");
                }
                if (i == word.length - 1) fileWriter.write("\n");
            }
        }
        fileWriter.flush();
    }
}
