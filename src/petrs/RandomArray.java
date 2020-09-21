package petrs;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    private int size = 0;
    private final int[] arrayInt;
    private final double[] arrayDouble;
    private final int band; //разброс чисел
    Random random = new Random();

    public RandomArray(int N, int band) {
        this.size = N;
        this.band = band;
        arrayInt = new int[size];
        arrayDouble = new double[N];
    }

    public int getSize() {
        return size;
    }

    public double getSizeDoubleArray() {
        return arrayDouble.length;
    }

    public void generate(int start) {
        for (int i = 0; i < size; i++) {
            arrayInt[i] = start + random.nextInt(band);
        }
    }

    public void generateSorted() {
        for (int i = 0; i < size; i++) {
            arrayInt[i] = i;
        }
    }

    public void generateDouble(double start, double end) {
        for (int i = 0; i < size; i++) {
            double randomNum = start + random.nextDouble() * end;
            double roundNum = Math.round(randomNum * 100.0) / 100.0; //округлил до 2-х знаков после запятой
            arrayDouble[i] = roundNum;
        }
    }

    public void printIntArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arrayInt[i] + "; ");
        }
    }

    public void printDoubleArray() {
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i] + "; ");
        }
    }

    public int getElement(int i) {
        return arrayInt[i];
    }

    public double getElementFromDoubleArray(int element) {
        return arrayDouble[element];
    }

    public void sort() {
        Arrays.sort(arrayInt);
    }

    public boolean isEmpty() {
        if (arrayInt.length == 0) {
            return true;
        }
        return false;
    }
}
