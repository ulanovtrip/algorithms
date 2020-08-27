package sedgewick.date;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

/**
 Быстрый вариант
 */

public class TwoSumFirst {
    public static int count(int [] a) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if(BinarySearch.rank(-a[i], a) > i)
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Stopwatch timer = new Stopwatch();
        int [] a = In.readInts("/home/uis/Desktop/AlgorithmsSedgewick-master/1-Fundamentals/1-4-AnalysisOfAlgorithms/8Kints.txt");
        double time = timer.elapsedTime();
        StdOut.println(count(a) + " pairs / " + time + " seconds");
    }
}
