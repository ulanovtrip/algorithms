package petrs;

public interface Array {
    void print();

    void generateRandom(int start);

    void generateRandomWithNegativeNumbers(int min, int max);

    int getSize();

    int getIndex(int value);

    int getElement(int element);

    void sort();

    boolean isEmpty();

    void generateArithmeticProgression(int step);
}
