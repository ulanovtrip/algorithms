package petrs;

public class Utils {

    public static void newLine() {
        System.out.println();
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static void print(String text) {
        System.out.print(text);
    }

    public static void printArray(String text, int[] array) {
        System.out.println(text);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
