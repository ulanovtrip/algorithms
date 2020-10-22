package petrs.dynamic;

import petrs.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Поиск наибольшей возрастающей последовательности.
 * https://www.youtube.com/watch?v=2DjhWYsgBtY&t=1249s&ab_channel=Pytonich
 */

public class Gis {
    public static void main(String[] args) {
        int[] A = {2, 7, 1, 4, 3, 5, 4, 6, 2, 5, 8, 3};
        //gis(A);
        //gis_faster(A);
        git_nLogN(A);
    }

    //поиск наибольшей возрастающей последовательности, восстановление с помощью предков.
    private static void gis(int[] A) {
        //сложность O(N*N)
        int[] F = new int[A.length];
        //восстановление ответа
        //нужен массив для предков
        int[] Prev = new int[A.length];
        for (int i = 0; i < Prev.length; i++) {
            Prev[i] = -1;
        }

        for (int i = 0; i < A.length; i++) {
            //чему равно F[i]?
            //F[i] = max( F[j], j < i, A[j] < A[i] ) + 1 //ищется линейным поиском
            int m = 0; //меньшее из всех, что есть, m - то, что ищем
            //перебираем все j < i
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && F[j] > m) { //чтобы попасть в цикл при повторения нужно писать F[j] >= m
                    //переписывается текущее значение
                    m = F[j];
                    //перепишем предка
                    Prev[i] = j;
                }
            }
            F[i] = m + 1;
        }
        Utils.printArray("A = ", A);
        Utils.newLine();
        Utils.printArray("F = ", F);
        Utils.newLine();
        Utils.printArray("Prev = ", Prev);
        Utils.newLine();
        Utils.print("Maximum of GIS = ");
        Integer maximumF = Arrays.stream(F).max().getAsInt();
        System.out.println(maximumF);

        //решения поиска восстановления ответа
        //создаем пустой массив, куда отправляется последовательность проходя по предкам.
        ArrayList<Integer> ans = new ArrayList<>();
        //ищем индекс нашего числа в исходном списке, которое является последним
        int i = IntStream.range(0, F.length).filter(j -> F[j] == maximumF).findFirst().orElse(-1);
        //кладём найденный последний элемент в массив
        ans.add(A[i]);
        //пока есть предок
        while (Prev[i] != -1) {
            //переходим к предку
            i = Prev[i];
            //и отправляем его в список
            ans.add(A[i]);
            //после этого опять проверится условие, что у элемента, который только что отправили, есть предок
        }
        for (int j = ans.size() - 1; j >= 0; j--) {
            Utils.print(ans.get(j) + "; ");
        }
    }

    //поиск наибольшей возрастающей последовательности, восстановление с помощью обратного хода
    private static void gis_faster(int[] A) {
        int[] F = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            //чему равно F[i]?
            //F[i] = max( F[j], j < i, A[j] < A[i] ) + 1 //ищется линейным поиском
            int m = 0; //меньшее из всех, что есть, m - то, что ищем
            //перебираем все j < i
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && F[j] > m) { //чтобы попасть в цикл при повторения нужно писать F[j] >= m
                    //переписывается текущее значение
                    m = F[j];
                    //перепишем предка
                }
            }
            F[i] = m + 1;
        }
        Utils.printArray("A = ", A);
        Utils.newLine();
        Utils.printArray("F = ", F);
        Utils.newLine();
        Utils.print("Maximum of GIS = ");
        Integer maximumF = Arrays.stream(F).max().getAsInt();
        System.out.println(maximumF);

        //решения поиска восстановления ответа
        //создаем пустой массив, куда отправляется последовательность проходя по предкам.
        ArrayList<Integer> ans = new ArrayList<>();
        //ищем индекс нашего числа в исходном списке, которое является последним
        int i = IntStream.range(0, F.length).filter(j -> F[j] == maximumF).findFirst().orElse(-1);
        //кладём найденный последний элемент в массив
        ans.add(A[i]);
        //если == 1, то перед элементом никого нет, будем двигаться пока больше 1
        int j;
        while (F[i] > 1) {
            //ищем такой A[j]: который подходит по условие: A[j] < A[i](в списке левее) F[j] == F[i] - 1 (-1, т.к. i продолжение последовательности)
            j = i - 1;
            //будем сдвигаться влево, пока одно из условий неверно
            while (A[j] >= A[i] || F[j] != (F[i] - 1)) {
                j -= 1;
                ans.add(A[j]);
                i = j;
            }
        }
        for (int k = ans.size() - 1; k >= 0; k--) {
            Utils.print(ans.get(k) + "; ");
        }
    }

    private static void git_nLogN(int[] A) {
        //целевая функция
        // L[i] - минимальный эл-т из списка A, которым может заканчиватся НВП длинны i
        int n = A.length;
        int[] L = new int[A.length + 2];
        for (int i = 0; i < L.length; i++) {
            if(i == 0) {
                L[i] = Integer.MIN_VALUE;
            } else {
                L[i] = Integer.MAX_VALUE;
            }
        }

        //перебираем все элементы и ищем куда поставить A[i]
        for (int i = 0; i < A.length; i++) {
            //добавим фиктивные элементы
            int left = 0;
            int right = n + 1;
            //пишем бинарный поиск
            while (left + 1 < right) {
                //ищем середину
                int middle = (left + right) / 2;
                if (L[middle] < A[i]) {
                    left = middle;
                } else {
                    right = middle;
                }
            }
            L[right] = A[i];
        }

        for (int i = 0; i < L.length; i++) {
            if (L[i] == Integer.MAX_VALUE || L[i] == Integer.MIN_VALUE) {
                continue;
            } else {
                System.out.print(L[i]+"; ");
            }
        }
    }
}
