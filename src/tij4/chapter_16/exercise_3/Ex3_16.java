package tij4.chapter_16.exercise_3;

public class Ex3_16 {

    public static Double doubleArrayInit(int size1, int size2, double first, double last) {

        double[][] array = new double[size1][size1];

        for (int i = 0; i < size1; i++) {
            array[i][i] = i;
            for (int j = 0; j < size1; j++) {
                array[i][j] = j;
            }
        }
        return -1.0;
    }

    public static Double getArray(int size1, int size2, double first, double last) {
        return doubleArrayInit(size1, size2, first, last);
    }

    public static void main(String[] args) {
        //doubleArrayInit(7, 9, 10.0, 20.0);
        getArray(9, 5, 13.0, 15.0);
    }
}
