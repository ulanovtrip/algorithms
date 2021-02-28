package stepik.methods_1.greedy_algorithms.points;

// https://razilov-code.ru/2018/10/16/cover-intervals-with-points/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Spot implements Comparable {
    int numOtrezok;
    int spotval;
    char side;

    public Spot(int numOtrezok, int spotval, char side) {
        this.numOtrezok = numOtrezok;
        this.spotval = spotval;
        this.side = side;
    }

    @Override
    public int compareTo(Object o) {
        Spot spot = (Spot) o;
        int numbers = this.spotval > spot.spotval ? 1 : this.spotval < spot.spotval ? -1 : 0;
        switch (numbers) {
            case 0:
                return side == 'R' ? 1 : -1;
            default:
                return numbers;
        }
    }
}

public class PointCover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Количество отрезков
        int n = sc.nextInt();
        int[][] otr = new int[n][];
        sc.nextLine();
        List<Spot> listSpots = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        //Получаем края отрезков и записываем в массив
        for (int i = 0; i < n; i++) {
            String[] split = sc.nextLine().split(" ");
            otr[i] = new int[2];
            otr[i][0] = Integer.parseInt(split[0]);
            otr[i][1] = Integer.parseInt(split[1]);
        }

        //Заполняем массив точек
        for (int i = 0; i < n; i += 1) {
            listSpots.add(new Spot(i + 1, otr[i][0], 'L'));
            listSpots.add(new Spot(i + 1, otr[i][1], 'R'));
        }

        //Сортируем массив точек
        listSpots.sort(Comparator.naturalOrder());

        //Следуем алгоритму, описанному в статье
        for (int i = 0; i < listSpots.size(); i++) {
            if (listSpots.get(i).side == 'L')
                stack.add(listSpots.get(i).numOtrezok);
            else if (stack.contains(listSpots.get(i).numOtrezok)) {
                result.add(listSpots.get(i).spotval);
                stack.clear();
            }
        }
        System.out.println(result.size());
        result.forEach(integer -> System.out.print(integer + " "));
    }
}
