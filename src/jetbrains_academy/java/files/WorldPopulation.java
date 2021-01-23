package jetbrains_academy.java.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        String path = "src/jetbrains_academy/java/files/dataset_91069.txt";
        List<Integer> list = new ArrayList<>();

        double max = 0;
        double different = 0;
        int counterStep = 0;
        int rememberedYear = 0;
        try (Scanner scanner = new Scanner(new File(path))) {
            scanner.nextLine();
            while (scanner.hasNext()) {
                int prevYear = scanner.nextInt();
                if (prevYear == 2016) break;
                double prevPopulation = Double.parseDouble(scanner.next().replaceAll(",", ""));
                int nextYear = scanner.nextInt();
                double nextPopulation = Double.parseDouble(scanner.next().replaceAll(",", ""));

                list.add(nextYear);
                counterStep++;
                different = nextPopulation - prevPopulation;

                if (different > max) {
                    max = different;
                    rememberedYear = nextYear;
                }
            }

            System.out.println(rememberedYear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
