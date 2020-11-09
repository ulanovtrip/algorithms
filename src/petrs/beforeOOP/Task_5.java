package petrs.beforeOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Дано предложение.
 * Заменить группы пробелов одиночными, крайние пробелы удалить.
 * Все слова перевести в нижний регистр, первые буквы сделать заглавными.
 */

public class Task_5 {
    public static void main(String[] args) throws IOException {
        String path = "/home/uis/Projects/algorithms/src/petrs/beforeOOP/inputTask_5.txt";
        List<String> list = readFile(path);
        moderateText(list);
    }

    private static List<String> readFile(String path) throws IOException {
        Path file = Paths.get(path);
        return Files.readAllLines(file);
    }

    private static void moderateText(List<String> list) throws IOException {
        FileWriter fileWriter = new FileWriter("/home/uis/Projects/algorithms/src/petrs/beforeOOP/outputTask_5.txt");
        for (String line : list) {
            String clearSpaces = line.replaceAll("\\s+", " ");
            //http://www.regular-expressions.info/lookaround.html
            String clearPunctuation = clearSpaces.replaceAll("\\s+(?=\\p{Punct})", "");
            String toLowerCase = clearPunctuation.toLowerCase();
            String[] words = toLowerCase.split(" ");

            for (int i = 0; i < words.length; i++) {
                String trimWord = words[i].trim();
                String capitalizeFirst = trimWord.substring(0, 1).toUpperCase() + trimWord.substring(1);
                fileWriter.write(capitalizeFirst + " ");
                if (i == words.length - 1) fileWriter.write("\n");
            }
        }
        fileWriter.flush();
    }
}
