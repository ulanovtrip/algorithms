package jetbrains_academy.java.basicsyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        int x1 = list.get(0);
        int y1 = list.get(1);
        int x2 = list.get(2);
        int y2 = list.get(3);

        int x1MinusX2 = x1 - x2;
        int y1MinusY2 = y1 - y2;

        if (x1 == x2 || y1 == y2 || Math.abs(x1MinusX2) == Math.abs(y1MinusY2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
