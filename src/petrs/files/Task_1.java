package petrs.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Дан текстовый файл, содержащий целые числа. Удалить из него все четные числа.
 * http://www.itmathrepetitor.ru/prog/zadachi-na-fajjly/
 */

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        FileWriter writer;
        File file = new File("/home/uis/Projects/algorithms/src/petrs/files/numbers.txt");
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(file));
            writer = new FileWriter("/home/uis/Projects/algorithms/src/petrs/files/outFileForTask_1.txt");
            String text;

            while ((text = reader.readLine()) != null) {
                for (String part : text.split(" ")) {
                    int currentNum = Integer.parseInt(part);

                    if (currentNum % 2 != 0) {
                        writer.write(String.valueOf(currentNum) + "; ");
                    }
                }
            }
            writer.flush();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

