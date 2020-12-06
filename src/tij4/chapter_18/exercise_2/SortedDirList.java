package tij4.chapter_18.exercise_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortedDirList {
    private String[] list;

    SortedDirList(File path) {
        list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    }

    public String[] list() {
        return list;
    }

    public String[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> arraylist = new ArrayList<>();
        int count = 0;
        for (String s : list) {
            if (pattern.matcher(s).matches()) {
                count++;
                arraylist.add(s);
            }
        }
        return arraylist.toArray(new String[count]);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : list) {
            stringBuilder.append(s + "\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        SortedDirList sortedDirList = new SortedDirList(new File("."));

        for (String s : sortedDirList.list(".+\\.iml")) {
            System.out.println(s);
        }

    }
}
