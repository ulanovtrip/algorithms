package petrs.fillingarray;

/**
 * Сформировать массив из случайных целых чисел от 0 до 9 , в котором единиц от 3 до 5 и двоек больше троек.
 */

public class Task_15 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];


        for (int i = 0; i < randomArray.length; i++) {
            if (i == randomArray.length - 1) {
                System.out.println(randomArray[i]);
            } else {
                System.out.print(randomArray[i] + "-");
            }
        }
    }
}
