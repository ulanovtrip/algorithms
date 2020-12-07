package tij4.chapter_18.exercise_13;//: io/BasicFileOutput.java

import tij4.chapter_18.BufferedInputFile;

import java.io.*;

public class BasicFileOutput {
    static String file = "src/tij4/chapter_18/exercise_13/output.txt";

    public static void main(String[] args)
            throws IOException {

        LineNumberReader in = new LineNumberReader(
                new FileReader("src/tij4/chapter_18/exercise_13/BasicFileOutput.java")
        );

        PrintWriter writer = new PrintWriter("file");

        String s;
        while ((s = in.readLine()) != null)
          writer.println(in.getLineNumber() + ": " + s);
      writer.close();
        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
}
