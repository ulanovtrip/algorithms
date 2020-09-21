package petrs.analysis;

import petrs.RandomArray;

import static petrs.Utils.newLine;
import static petrs.Utils.print;

/**
 * Дан массив и число p. Найдите два различных числа в массиве, сумма которых наиболее близка к p.
 */

public class Task_37 {
    public static void main(String[] args) {
        int p = 9;
        RandomArray inputArray = new RandomArray(10, 13);
        inputArray.generate(1);
        inputArray.printIntArray();
        int index1 = 0;
        int index2 = 1;
        //стартовая сумма ближайших элементов
        int sumClose = Math.abs(p - inputArray.getElement(0) - inputArray.getElement(1));

        for (int i = 0; i < inputArray.getSize(); i++) {
            for (int j = i + 1; j + i < inputArray.getSize(); j++) {
                //вычисляется отклонение след. элементов.
                int deviation = Math.abs(p - inputArray.getElement(i) - inputArray.getElement(j));
                //если отклонение меньше или равно текущему, то обновить
                if (deviation <= sumClose) {
                    //запоминаются индексы элементов где минимальное отклонение
                    index1 = i;
                    index2 = j;
                    sumClose = deviation;
                }
            }
        }
        newLine();
        print("first number = " + inputArray.getElement(index1) +
                "; " + "second number = " + inputArray.getElement(index2));
    }
}
