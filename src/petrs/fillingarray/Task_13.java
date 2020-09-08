package petrs.fillingarray;

/**
 * Сформировать массив из случайных чисел, в которых ровно две единицы, стоящие на случайных позициях.
 */

public class Task_13 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        int countOfOnes = 0;

        for (int i = 0; i < randomArray.length; i++) {
            int randomNum = (int) (1 + Math.random() * 9);
            if(randomNum == 1 && countOfOnes < 2) {
                countOfOnes += 1;
                randomArray[i] = randomNum;
            } else {
                while (true) {
                    int newRandomNum = (int) (1 + Math.random() * 9);
                    if(newRandomNum != 1) {
                        randomArray[i] = newRandomNum;
                        break;
                    }
                }
            }
        }


        for (int i = 0; i < randomArray.length; i++) {
            if (i == randomArray.length - 1) {
                System.out.println(randomArray[i]);
            } else {
                System.out.print(randomArray[i] + "-");
            }
        }
    }
}
