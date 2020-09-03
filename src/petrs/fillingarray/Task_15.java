package petrs.fillingarray;

/**
 * Сформировать массив из случайных целых чисел от 0 до 9 , в котором единиц от 3 до 5 и двоек больше троек.
 */

public class Task_15 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        int Ones = 0;
        int twos = 0;
        int triplets = 0;


            for (int i = 0; i < randomArray.length; i++) {

                int randomNumber = (int) (1 + Math.random() * 10);

                if(randomNumber == 1) {
                    Ones++;
                } else if(randomNumber == 2) {
                    twos++;
                } else if(randomNumber == 3) {
                    triplets++;
                }
                randomArray[i] = randomNumber;

                if(Ones >= 3 && Ones < 5) {
                    randomArray[i] = 1;
                    if(twos > triplets) {
                        randomArray[i] = 2;
                        continue;
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
