package tij4.chapter_11.exercise_4;

import java.util.HashSet;
import java.util.Set;

public class Generator {
    public static void next(Set<String> names) {

        for (String x : names) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        String robot = "Robot";
        String solder = "Solder";

        Set<String> names = new HashSet<>();
        names.add(robot);
        names.add(solder);
        next(names);
    }

}
