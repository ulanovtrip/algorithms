package sedgewick.basicprogmodel; /*************************************************************************
 *  Compilation:  javac BinarySearch.java
 *  Execution:    java BinarySearch whitelist.txt < input.txt
 *  Data files:   http://algs4.cs.princeton.edu/11model/tinyW.txt
 *                http://algs4.cs.princeton.edu/11model/tinyT.txt
 *                http://algs4.cs.princeton.edu/11model/largeW.txt
 *                http://algs4.cs.princeton.edu/11model/largeT.txt
 *
 *  % java BinarySearch tinyW.txt < tinyT.txt
 *  50
 *  99
 *  13
 *
 *  % java BinarySearch largeW.txt < largeT.txt | more
 *  499569
 *  984875
 *  295754
 *  207807
 *  140925
 *  161828
 *  [3,675,966 total values]
 *
 *************************************************************************/

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {

    // precondition: array a[] is sorted
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        /*
            Так читаем оба файла сразу и сравниваем
            int[] whitelist = In.readInts(args[0]);
            int[] values = In.readInts(args[1]);

            Arrays.sort(whitelist);

            for (int i = 0; i < values.length; i++) {
            int value = values[i];
            if (rank(value, whitelist) == -1){
                StdOut.println(value);
            }
        }
        * */


        int[] whitelist = In.readInts(args[0]);
//        int[] whitelist = In.readInts("sedgewick/basicprogmodel/tinyT.txt");

        Arrays.sort(whitelist);

        // read key; print if not in whitelist
        //при дебаге числа надо вводить console, debug вкладка
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1)
                StdOut.println(key);
        }
    }
}
