package petrs.fillingarray;

/**
 * Создать массив, который одинаково читается как слева направо, так и справа налево.
 */

public class Task_12 {
    public static void main(String[] args) {
        int[] mirrorArray = new int[9];
        int startPosition = 0;
        int endPosition = mirrorArray.length - 1;
        int middlePosition = (startPosition + endPosition) / 2;

        for (int i = 1; i < mirrorArray.length; i++) {
            if (i <= middlePosition) {
                mirrorArray[i] = i;
            } else {
                mirrorArray[endPosition] = mirrorArray[startPosition];
                endPosition--;
                startPosition++;
            }
        }
        for (int i = 0; i < mirrorArray.length; i++) {
            if (i == mirrorArray.length - 1) {
                System.out.println(mirrorArray[i]);
            } else {
                System.out.print(mirrorArray[i] + "-");
            }
        }
    }
}
