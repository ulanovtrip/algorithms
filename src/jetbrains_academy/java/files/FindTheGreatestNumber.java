package jetbrains_academy.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindTheGreatestNumber {
    public static void main(String[] args) {
        String path = "src/jetbrains_academy/java/files/dataset_91007.txt";
        int greatest = 0;
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNext()) {
                int currentNum = scanner.nextInt();
                if (currentNum > greatest) {
                    greatest = currentNum;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println(greatest);
        }
    }
}
