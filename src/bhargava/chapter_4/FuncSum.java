package bhargava.chapter_4;

public class FuncSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        System.out.println(sum(arr));
    }

    private static int sum(int[] arr) {
        int sumOfElem = 0;
        if (arr.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                sumOfElem = sumOfElem + arr[i];
            }
        }
        return sumOfElem;
    }
}
