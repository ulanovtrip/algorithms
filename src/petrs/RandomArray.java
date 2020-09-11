package petrs;

public class RandomArray {

    private int size = 0;
    private final int[] array;
    private final double[] arrayDouble;
    private int band = 0;

    public RandomArray(int N, int band) {
        this.size = N;
        this.band = band;
        array = new int[size];
        arrayDouble = new double[N];
    }

    public int getSize() {
        return size;
    }

    public void generate() {
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * band);
        }
    }

    public void generateDouble() {
        for (int i = 0; i < size; i++) {
            arrayDouble[i] = (Math.random() * 10.0);
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public int getElement(int i) {
        return array[i];
    }
}
