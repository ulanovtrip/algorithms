package petrs.fillingarray;

/**
 * Заполните массив случайным образом нулями и единицами так, чтобы количество единиц было больше количества нулей.
 */

public class Task_14 {
    public static void main(String[] args) {
        int[] arrayMoreOne = new int[10];
        int zero = 0;
        int one = 1;
        int countZeros = 0;
        int countOnes = 0;

        for (int i = 0; i < arrayMoreOne.length; i++) {

            //if(countOnes > countZeros) break;

            if (i != arrayMoreOne.length - 1) {
                arrayMoreOne[(int) (1 + Math.random() * 9)] = one;
                countOnes++;
            } else {
                arrayMoreOne[(int) (1 + Math.random() * 9)] = zero;
                countZeros++;
            }
        }

        for (int i = 0; i < arrayMoreOne.length; i++) {
            if (i == arrayMoreOne.length - 1) {
                System.out.println(arrayMoreOne[i]);
            } else {
                System.out.print(arrayMoreOne[i] + "-");
            }
        }
        System.out.println("Zero = " + countZeros + " // " + "Ones = " + countOnes);
    }
}
