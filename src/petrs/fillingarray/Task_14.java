package petrs.fillingarray;

/**
 * Заполните массив случайным образом нулями и единицами так, чтобы количество единиц было больше количества нулей.
 */

public class Task_14 {
    public static void main(String[] args) {
        int[] arrayMoreOne = new int[10];
        int countZeros = 0;
        int countOnes = 0;

        for (int i = 0; i < arrayMoreOne.length; i++) {
            int randomZeroOreOne = (int) Math.round(Math.random());

            if (countOnes > countZeros) {
                break;
            }

            if (randomZeroOreOne == 0) {
                countZeros++;
                arrayMoreOne[(int) (1 + Math.random() * 9)] = randomZeroOreOne;

            } else if (randomZeroOreOne == 1) {
                countOnes++;
                arrayMoreOne[(int) (1 + Math.random() * 9)] = randomZeroOreOne;
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
