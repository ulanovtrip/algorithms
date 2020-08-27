package sedgewick.date.week1.example92;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    //счётчик испытаний
    private int trialCount;
    private double[] trialResults;

    // perform trials independent experiments on an n-by-n grid
    public PercolationStats(int n, int trials) {
        //проверка что размер сетки и колличество опытов не равно 0
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException("N and T must be <= 0");
        }
        //размер n для сетки
        int gridSize = n;
        //колличество испытаний
        trialCount = trials;
        //массив для хранения рузультатов испытаний
        trialResults = new double[trialCount];

        //цикл для проведения колличества испытаний
        for (int trial = 0; trial < trialCount; trial++) {
            Percolation percolation = new Percolation(gridSize);
            while (!percolation.percolates()) {
                //выбирается произвольный ряд из диапазона от 1 до размера сетки + 1
                int row = StdRandom.uniform(1, gridSize + 1);
                //выбирается произвольный столбец из диапазона от 1 до размера сетки + 1
                int col = StdRandom.uniform(1, gridSize + 1);
                //открываем ранодомный участок
                percolation.open(row, col);
            }

            int openSites = percolation.numberOfOpenSites();
            //находим среднее значение из колличества испытаний
            double result = (double) openSites / (gridSize * gridSize);
            //заносим результат в массив хранения испытаний
            trialResults[trial] = result;
        }
    }


    // sample mean of percolation threshold
    public double mean() {
        return StdStats.mean(trialResults);
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return StdStats.stddev(trialResults);
    }

    // low  endpoint of 95% confidence interval
    public double confidenceLo() {
        return mean() - ((1.96 * stddev()) / Math.sqrt(trialCount));

    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return mean() + ((1.96 * stddev()) / Math.sqrt(trialCount));
    }

    // test client (described below)
    public static void main(String[] args) {
        //значения для теста
        int N = 2;
        int T = 2;
        //если в консоль пришло 2 значения, то они считываются
        if (args.length >= 2) {
            N = Integer.parseInt(args[0]);
            T = Integer.parseInt(args[1]);
        }
        PercolationStats ps = new PercolationStats(N, T);

        String confidence = ps.confidenceLo() + ", " + ps.confidenceHi();
        StdOut.println("mean                    = " + ps.mean());
        StdOut.println("stddev                  = " + ps.stddev());
        StdOut.println("95% confidence interval = " + confidence);
    }
}