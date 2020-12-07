package tij4.chapter_18.exercise_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex9_18 {

    public static String read(String filename) throws IOException {
        LinkedList<String> list = new LinkedList<>();
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            String upCase = s.toUpperCase();
            list.add(upCase);
        }

        while (list.peekLast() != null) {
            sb.append(list.pollLast() + "\n");
        }

        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) {
            System.out.println("Usage: enter file name");
            System.exit(1);
        }
        System.out.print(read(scanner.next()));
        // src/tij4/chapter_18/exercise_7/ex7_18.txt
    }
}
