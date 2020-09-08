package petrs.fillingarray;

/**
 * Заполните массив случайным образом нулями и единицами так, чтобы количество единиц было больше количества нулей.
 */

public class Task_14 {
    public static void main(String[] args) {
        int[] arrayMoreOne = new int[10];
        int len = arrayMoreOne.length;
        int zeros = 0;
        int ones = 0;
        int diff = 0;
        int emptyCounts = 0;
        double OnesMax = 0.01;
        int OnesCount = (int) (len * OnesMax + Math.random() * len);

        for (int i = 0; i < OnesCount; i++) {
            int index = (int) (0 + Math.random() * len);
            while (arrayMoreOne[index] == 1)
                index = (int) (0 + Math.random() * len);
            arrayMoreOne[index] = 1;



            //int num = (int) (0 + Math.random() * 2);

//            if(num == 1) {
//                ones += 1;
//            } else {
//                zeros += 1;
//            }



//            diff = ones - zeros;
//            emptyCounts = (arrayMoreOne.length) - i;
//
//            if(diff + emptyCounts == 1) {
//                arrayMoreOne[i] = 1;
//            }
        }

        for (int i = 0; i < arrayMoreOne.length; i++) {
            if (i == arrayMoreOne.length - 1) {
                System.out.println(arrayMoreOne[i]);
            } else {
                System.out.print(arrayMoreOne[i] + "-");
            }
        }
    }
}
