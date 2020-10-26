package petrs;

import java.util.Arrays;
import java.util.Random;

public class IntegerArray implements Array {
    Random random = new Random();
    private final int size;
    private final int[] arrayInt;
    private final int band; //разброс чисел

    public IntegerArray(int size, int band) {
        this.size = size;
        this.band = band;
        arrayInt = new int[size];
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arrayInt[i] + "; ");
        }
    }

    @Override
    public void generateRandom(int start) {
        for (int i = 0; i < size; i++) {
            arrayInt[i] = start + random.nextInt(band);
        }
    }

    @Override
    public void generateRandomWithNegativeNumbers(int min, int max) {
        for (int i = 0; i < size; i++) {
            arrayInt[i] = random.nextInt(max - min) + min;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getElement(int element) {
        return arrayInt[element];
    }

    @Override
    public void sort() {
        Arrays.sort(arrayInt);
    }

    @Override
    public boolean isEmpty() {
        if (arrayInt.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void generateArithmeticProgression(int step) {
        for (int i = 0; i < size; i++) {
            arrayInt[i] = i + step;
        }
    }

    public void generateDecreasingArray(int step) {
        int start = arrayInt.length;
        for (int i = 0; i < arrayInt.length; ++i) {
            if (i == 0) {
                arrayInt[i] = start;
                i++;
            }
            start = start - step;
            arrayInt[i] = start;
        }
    }

    public void setValue(int index, int value) {
        arrayInt[index] = value;
    }

    @Override
    public int getIndex(int value) {
        int index = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == value) {
                index = i;
            }
        }
        return index;
    }
}
