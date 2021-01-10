package jetbrains_academy.java.basicsyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertingAndMultiplying {

    public static List readInput() {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String nextElem = scanner.nextLine();
            if (nextElem.equals("0")) {
                break;
            }
            list.add(nextElem);
        }
        return list;
    }

    public static List convert(List<String> list) {
        List<String> outNumbers = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            int num = 0;
            try {
                num = Integer.parseInt(temp) * 10;
            } catch (Exception e) {
                outNumbers.add("Invalid user input: " + temp);
                continue;
            }
            outNumbers.add(String.valueOf(num));
        }
        return outNumbers;
    }

    public static void main(String[] args) {
        List list = readInput();
        List<String> outNumbers = convert(list);

        for (String i : outNumbers) {
            System.out.println(i);
        }
    }
}
