package tij4.chapter_18.exercise_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Ex8_18 {

    public static String read(String filename) throws IOException {
        LinkedList<String> list = new LinkedList<>();
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            list.add(s);
        }

        while (list.peekLast() != null) {
            sb.append(list.pollLast() + "\n");
        }

        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: enter file name");
            System.exit(1);
        }
        System.out.println(read(args[0]));
        //System.out.println(read("src/tij4/chapter_18/exercise_7/ex7_18.txt"));
    }
}
