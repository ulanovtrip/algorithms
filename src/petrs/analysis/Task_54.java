package petrs.analysis;

/**
 * В массиве найдите количество серий из четверок подряд идущих попарно различных элементов.
 */

public class Task_54 {
    public static void main(String[] args) {
        int[] pairsOfFours = {2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9};
        findCountOfFours(pairsOfFours);
    }

    private static void findCountOfFours(int[] pairsOfFours) {
        int countFours = 0;
        for (int i = 0; i < pairsOfFours.length - 4; i++) {
            if (isSeriesOfFour(pairsOfFours, i)) {
                countFours += 1;
            }
        }
        System.out.println("серий из четверок подряд идущих попарно различных элементов = " + countFours);
    }

    private static boolean isSeriesOfFour(int[] pairOfFour, int startIndex) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (pairOfFour[startIndex + i] == pairOfFour[startIndex + j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
