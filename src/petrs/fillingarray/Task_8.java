package petrs.fillingarray;

/**
 * Заполнить массив заданной длины различными простыми числами.
 * Натуральное число, большее единицы, называется простым, если оно делится только на себя и на единицу.
 * Нужно решето Эротосфена.
 * https://habr.com/ru/post/333350/
 */

public class Task_8 {
    public static void main(String[] args) {
        int N = 1000;
        int[] sieve = new int[N];

        //i = 2, т.к. 0 и 1 не простые чила
        for (int i = 2; i < N / 2; i++) {
            if (sieve[i] == 0) {
                //вычисление составных чисел
                for (int j = i * i; j < N; j += i) {
                    //выставление флага в 1
                    sieve[j] = 1;
                }
            }
        }

        int count = 1;
        for (int i = 2; i < N; i++) {
            if(count%10 == 0) {
                System.out.println();
                count++;
            } else {
                if (sieve[i] == 0){
                    count++;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
