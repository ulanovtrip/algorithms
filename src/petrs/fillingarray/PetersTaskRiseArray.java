package petrs.fillingarray;

import java.util.ArrayList;

/**
 * Задача от Пети.
 * Найти в множестве чисел самое длинное неубывающее подмножество.
 */

public class PetersTaskRiseArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5, 6, 9,};
        //int[] array = {};
        int checkLengthArray = array.length;
        int currentLength = 1;
        int maxLength = 1;

        if (checkLengthArray < 1) {
            System.out.println("Array is empty!");
        } else {
            //array.length - 2 здесь вычитается два, т.к. иначе array[i + 1] из if будет выйдет за пределы массива
            for (int i = 0; i <= array.length - 2; i++) {
                //сравнимаем i-й элемент и след. за ним
                if (array[i] <= array[i + 1]) {
                    //увеличиваем длинну возрастающей подпоследовательности
                    currentLength++;
                    //возврат в for
                    continue;
                }
                //здесь сравниваем существующий ранее максимум и текущий максимум, т.е. тот, что набрался в
                //последнем цикле for
                if (maxLength < currentLength) {
                    //и если этот максимум меньше чем новый текущий, то обновляем его
                    maxLength = currentLength;
                    //для новых вычислений сбрасываем текущий счётчик длины на 1, т.к. они не может быть 0
                    currentLength = 1;
                }
            }
            //Эта проверка сработает, когда подпоследовательность росла до конца массива.
            if (maxLength < currentLength) maxLength = currentLength;
        }
        System.out.println(maxLength);
    }
}
