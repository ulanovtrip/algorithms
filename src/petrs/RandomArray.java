package petrs;

public class RandomArray {

    private int size = 0;
    private int[] array;

    public RandomArray(int N) {
        this.size = N;
        array = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void generate() {
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
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
