package tij4.chapter_18.exercise_21;

import java.io.*;

public class Ex21_18_b {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream(file)
        );
        System.setIn(bufferedInputStream);
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s.toUpperCase());
        }
    }
}
