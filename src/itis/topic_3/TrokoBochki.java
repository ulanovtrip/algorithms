package itis.topic_3;

import java.util.Scanner;

public class TrokoBochki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        if (n <= 1000 && n > 20) {
            if (n % 10 == 1) {
                System.out.println(n + " bochka");
            } else if (n % 10 == 2 || n % 10 == 3 || n % 10 == 4) {
                System.out.println(n + " bochki");
            } else
                System.out.println(n + " bochek");

        } else {
            if (n == 1) {
                System.out.println(n + " bochka");
            } else if (n == 2 || n == 3 || n == 4) {
                System.out.println(n + " bochki");
            } else
                System.out.println(n + " bochek");
        }

    }
}
