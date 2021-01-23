package jetbrains_academy.java.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        File file = new File("src/jetbrains_academy/java/files/writer_test.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            int step = 10;
            while (step > 0) {
                fileWriter.write("Putin burglar! \n");
                fileWriter.write("Freedom!!!\n");
                step--;
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
