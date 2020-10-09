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

    public void generateTask47() {
        arrayInt[0] = 2;
        arrayInt[1] = 3;
        arrayInt[2] = 5;
        arrayInt[3] = 5;
        arrayInt[4] = 5;
        arrayInt[5] = 6;
        arrayInt[6] = 7;
        arrayInt[7] = 8;
        arrayInt[8] = 9;
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

    public void arrayForTask48() {
        arrayInt[0] = 1;
        arrayInt[1] = 3;
        arrayInt[2] = 8;
        arrayInt[3] = 8;
        arrayInt[4] = 8;
    }

    public void arrayForTask59() {
        arrayInt[0] = 2;
        arrayInt[1] = 3;
        arrayInt[2] = 2;
        arrayInt[3] = 5;
        arrayInt[4] = 2;
    }

    public void arrayForTask_67() {
        //1; 0; 3; 0; 4; 1; 1; 2; 0; 0;
        arrayInt[0] = 1;
        arrayInt[1] = 0;
        arrayInt[2] = 3;
        arrayInt[3] = 0;
        arrayInt[4] = 4;
        arrayInt[5] = 1;
        arrayInt[6] = 1;
        arrayInt[7] = 2;
        arrayInt[8] = 0;
        arrayInt[9] = 0;
    }
}
