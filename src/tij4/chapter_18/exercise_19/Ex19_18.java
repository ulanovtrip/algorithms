package tij4.chapter_18.exercise_19;

import tij4.examples.BinaryFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex19_18 {
    public static void main(String[] args) throws IOException {
        Set<Byte> uniqueBytes = new TreeSet<>();
        Map<Byte, Integer> map = new HashMap<>();
        File file = new File("rtest.dat");
        byte[] bytes = BinaryFile.read(file);

        for (byte current : bytes) {
            uniqueBytes.add(current);
        }

        for (byte fromSet : uniqueBytes) {
            int count = 0;
            for (byte fromAll : bytes) {
                if (fromSet == fromAll) {
                    count++;
                }
            }
            map.put(fromSet, count);
        }
        System.out.print(map.toString());
    }
}
