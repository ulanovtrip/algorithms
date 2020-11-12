package petrs.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Дан текстовый файл.
 * Создать новый файл,
 * каждая строка которого получается из соответствующей строки исходного файла перестановкой слов в обратном порядке.
 */

public class Task_3 {
    public static void main(String[] args) {
        String path = "/home/uis/Projects/algorithms/src/petrs/files/outputTask_3.txt";
        try {
            File outFile = new File(path);
            if (outFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
            readReverseWrite(outFile, path);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private static void readReverseWrite(File outFile, String path) {
        Path inputFile = Paths.get("/home/uis/Projects/algorithms/src/petrs/files/inputTask_3.txt");
        FileWriter writer;
        StringBuilder stringBuilder = new StringBuilder();
        String outputString = "";
        try {
            writer = new FileWriter(path);
            List<String> lines = Files.readAllLines(inputFile);

            for (String line : lines) {
                String[] word = line.split(" ");
                outputString = "";
                for (int i = 0; i < word.length; i++) {
                    stringBuilder.append(word[i]);
                    stringBuilder = stringBuilder.reverse();
                    stringBuilder.append(" ");
                    outputString = outputString.concat(String.valueOf(stringBuilder));
                    stringBuilder.setLength(0);
                }
                writer.write(outputString + "\n");
            }
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
