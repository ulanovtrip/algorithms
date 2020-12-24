package bhargava.chapter_2;

import java.util.Arrays;

public class SelectionSort2 {

    // this version uses raw arrays instead of ArrayList
    private static int[] selectionSort(int[] arr) {

        int length = arr.length;
        int[] newArr = new int[]{length};

        for (int i = 0; i < length; i++) {

            int smallest = findSmallest(arr, i);
            newArr[i] = arr[smallest];
        }

        return newArr;
    }

    private static int findSmallest(int[] arr, int low) {
        int smallest = arr[low];
        int smallestIndex = low;

        for (int i = low + 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(selectionSort(arr))); // [2, 3, 5, 6, 10]
    }
}