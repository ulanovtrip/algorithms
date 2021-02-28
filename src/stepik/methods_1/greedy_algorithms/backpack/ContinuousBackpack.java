package stepik.methods_1.greedy_algorithms.backpack;

/*
https://stepik.org/lesson/13238/step/10?unit=3424
Первая строка содержит количество предметов 1 ≤ n ≤ 10^3 и вместимость рюкзака 0 ≤ W ≤ 2⋅10^6.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ContinuousBackpack {

    class Item implements Comparable<Item> {
        int cost;
        int weight;

        public Item(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public int compareTo(Item o) {
            double relationOne = (double) cost / weight;
            double relationTwo = (double) o.cost / o.weight;
            return -Double.compare(relationOne, relationTwo);
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int W = scanner.nextInt();
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(scanner.nextInt(), scanner.nextInt());
        }

        Arrays.sort(items);

        for (int i = 0; i < n; i++) {
            System.out.println(items[i]);
        }

        double commonCoast = 0.0;
        while (W != 0 && n != 0) {
            for (int i = 0; i < n; i++) {
                if (W == 0) {
                    break;
                }
                if (items[i].weight <= W) {
                    W -= items[i].weight;
                    commonCoast += items[i].cost;
                } else {
                    double relation = (double) items[i].cost / items[i].weight;
                    commonCoast += relation * W;
                    W = 0;
                    break;
                }
            }
            n -= 1;
        }
        System.out.println(commonCoast);
    }

    public static void main(String[] args) {
        new ContinuousBackpack().run();
    }
}
