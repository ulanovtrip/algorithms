package sedgewick.date.week1.myown;

public class PercolationStats {
    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials) {

    }

    // sample mean of percolation threshold
    //выборочное среднее порога перколяции
    public double mean() {
        return -1;
    }

    // sample standard deviation of percolation threshold
    //стандартное отклонение выборки порога перколяции
    public double stddev() {
        return -1;
    }

    // low endpoint of 95% confidence interval
    //нижняя конечная точка 95% доверительного интервала
    public double confidenceLo() {
        return 0;
    }

    // high endpoint of 95% confidence interval
    //верхняя конечная точка 95% доверительного интервала
    public double confidenceHi() {
        return 0;
    }

    // test client (see below)
    public static void main(String[] args) {
        /*
        включите метод main(), который принимает два аргумента командной строки n и T,
        выполняет T независимых вычислительных экспериментов (обсуждаемых выше) на сетке n-на-n и печатает
        среднее значение выборки, стандартное отклонение выборки и 95 % доверительный интервал для порога протекания.
        Используйте StdRandom для генерации случайных чисел;
        используйте StdStats для вычисления среднего значения выборки и стандартного отклонения выборки.
         */

        int n = 0;
        int T = 0;

        Percolation percolation = new Percolation(3);

    }
}
