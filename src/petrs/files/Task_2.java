package petrs.files;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * В данном текстовом файле удалить все слова, которые содержат хотя бы одну цифру.
 */

public class Task_2 {
    public static void main(String[] args) {
        Path file = Paths.get("/home/uis/Projects/algorithms/src/petrs/files/inputTask_2.txt");
        FileWriter writer;
        try {
            writer = new FileWriter("/home/uis/Projects/algorithms/src/petrs/files/outputTask_2.txt");
            List<String> lines = Files.readAllLines(file);
            deleteWordsWithNumbers(lines, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteWordsWithNumbers(List<String> lines, FileWriter writer) throws IOException {
        String regex = ".*\\d+.*";

        for (String line : lines) {
            String[] currentWord = line.split(" ");
            for (int i = 0; i < currentWord.length; i++) {
                if (currentWord[i].matches(regex)) {
                    System.out.println();
                } else {
                    writer.write(currentWord[i] + " ");
                }
            }
        }
        writer.flush();
    }
}
