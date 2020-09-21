package petrs.analysis;

import petrs.RandomArray;

/**
 * Проверьте, образуют ли элементы массива в данном порядке арифметическую или геометрическую прогрессии.
 */

public class Task_43 {
    public static void main(String[] args) {
        RandomArray inputArithmetic = new RandomArray(5, 10);
        RandomArray inputGeometric = new RandomArray(6, 10);
        inputArithmetic.generateArithmeticProgression(1);
        inputGeometric.generateGeometricProgression(2);
        System.out.println(isArithmetic(inputArithmetic, 1));
        System.out.println(isGeometric(inputGeometric));
    }


    private static boolean isArithmetic(RandomArray array, int stepProgression) {
        if (array.getSize() < 2) return false;

        for (int i = 0; i < array.getSize(); i++) {
            if ((array.getElement(i) + stepProgression) - array.getElement(i)
                    != array.getElement(1) - array.getElement(0)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isGeometric(RandomArray array) {
        if (array.getSize() < 2) return false;
        double eps = 1e-3;
        for (int i = 1; i < array.getSize() - 1; i++) {
            if (Math.abs(array.getElement(i) * array.getElement(i) -
                    array.getElement(i - 1) * array.getElement(i + 1)) > eps) {
                return false;
            }
        }
        return true;
    }
}
