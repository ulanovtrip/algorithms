package sedgewick.date;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

/**
 Медленный вариант
 */

public class ThreeSum {
    public static int count(int a[]) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    if (a[i] + a[j] + a[k] == 0)
                        cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        Stopwatch timer = new Stopwatch();
        int [] a = In.readInts("/home/uis/Desktop/AlgorithmsSedgewick-master/1-Fundamentals/1-4-AnalysisOfAlgorithms/4Kints.txt");
        double time = timer.elapsedTime();
        StdOut.println(count(a) + " троек / " + time + " time");
    }
}
