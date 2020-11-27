package tij4.chapter_13.exercise_4;//: strings/Receipt.java

import java.util.*;

public class Receipt {
    private double total = 0;
    private final String widthTitle = "%-15s %5s %10s";
    private final String widthPrint = "%-15.15s %5d %10.2f";
    private final String widthTotal = "%-15s %5s %10.2f";

    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format(widthTitle + "\n", "Item", "Qty", "Price");
        f.format(widthTitle + "\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(widthPrint + "\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(widthTotal + "\n", "Tax", "", total * 0.06);
        f.format(widthTitle + "\n", "", "", "-----");
        f.format(widthTotal + "\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}

/* Output:
Item              Qty      Price
----              ---      -----
Jack's Magic Be     4       4.25
Princess Peas       3       5.10
Three Bears Por     1      14.29
Tax                         1.42
                           -----
Total                      25.06
*///:~
