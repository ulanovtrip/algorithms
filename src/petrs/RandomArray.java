package petrs;

import java.util.Random;

public class RandomArray {

    private int size = 0;
    private final int[] array;
    private final double[] arrayDouble;
    private final int band; //разброс чисел
    Random random = new Random();

    public RandomArray(int N, int band) {
        this.size = N;
        this.band = band;
        array = new int[size];
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
            array[i] = start + random.nextInt(band);
        }
    }

    public void generateDouble(double start, double end) {
        for (int i = 0; i < size; i++) {
            double randomNum = start + random.nextDouble() * end;
            double roundNum = Math.round(randomNum * 100.0)/100.0; //округлил до 2-х знаков после запятой
            arrayDouble[i] = roundNum;
        }
    }

    public void printIntArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "; ");
        }
    }

    public void printDoubleArray() {
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i] + "; ");
        }
    }

    public int getElement(int i) {
        return array[i];
    }

    public double getElementFromDoubleArray(int element) {
        return arrayDouble[element];
    }
}
