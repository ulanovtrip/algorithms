package sedgewick.date.week1.myown;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private boolean[] sites;
    private int width;
    private int[] id;
    private int[] sz;
    private int count;
    private boolean[] full;
    private int[][] grid;
    WeightedQuickUnionUF weightedQuickUnionUF;


    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        n++;
        weightedQuickUnionUF = new WeightedQuickUnionUF(n);
        grid = new int[n][n];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = -1;
                //System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }

    /*
     * pos (position)
     * Takes 2d position and converts it to a 1d position.
     * i = horizontal position,
     * j = vertical position
     * (i, j) = (x, -y) on coordinate plane.
     */
    private int pos(int i, int j) {
        return (j + ((i - 1) * width) - 1);
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        sites[pos(row, col)] = true;
        if (col != 1 && sites[pos(row, col - 1)]) {
            weightedQuickUnionUF.union(pos(row, col), pos(row, col - 1));
            if (isFull(row, col - 1)) {
                full[pos(row, col)] = isFull(row, col - 1);
            }
        }


        if (col != width && sites[pos(row, col + 1)]) {
            weightedQuickUnionUF.union(pos(row, col), pos(row, col + 1));
            if (isFull(row, col + 1)) {
                full[pos(row, col)] = isFull(row, col + 1);
            }
        }

        if (row != width && sites[pos(row + 1, col)]) {
            weightedQuickUnionUF.union(pos(row, col), pos(row + 1, col));
            if (isFull(row + 1, col)) {
                full[pos(row, col)] = isFull(row + 1, col);
            }
        }

        if (row != 1 && sites[pos(row - 1, col)]) {
            weightedQuickUnionUF.union(pos(row, col), pos(row - 1, col));
            if (isFull(row - 1, col)) {
                full[pos(row, col)] = isFull(row - 1, col);
            }
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return sites[pos(row, col)];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if ((row != 1 && col != 1 &&
                col != width && row != width) &&
                ((full[pos(row + 1, col)] && isOpen(row + 1, col)) ||
                        (full[pos(row - 1, col)] && isOpen(row - 1, col)) ||
                        (full[pos(row, col + 1)] && isOpen(row, col + 1)) ||
                        (full[pos(row, col - 1)] && isOpen(row, col - 1)))) {
            full[pos(row, col)] = true;
        } else if (row == 1 &&
                ((full[pos(row + 1, col)] && isOpen(row + 1, col)) ||
                        (full[pos(row, col + 1)] && isOpen(row, col + 1)) ||
                        (full[pos(row, col - 1)] && isOpen(row, col - 1)))) {
            full[pos(row, col)] = true;
        } else if (row == width &&
                ((full[pos(row - 1, col)] && isOpen(row - 1, col)) ||
                        (full[pos(row, col + 1)] && isOpen(row, col + 1)) ||
                        (full[pos(row, col - 1)] && isOpen(row, col - 1)))) {
            full[pos(row, col)] = true;
        } else if (col == 1 &&
                ((full[pos(row + 1, col)] && isOpen(row + 1, col)) ||
                        (full[pos(row - 1, col)] && isOpen(row - 1, col)) ||
                        (full[pos(row, col + 1)] && isOpen(row, col + 1)))) {
            full[pos(row, col)] = true;
        } else if (col == width &&
                ((full[pos(row + 1, col)] && isOpen(row + 1, col)) ||
                        (full[pos(row - 1, col)] && isOpen(row - 1, col)) ||
                        (full[pos(row, col - 1)] && isOpen(row, col - 1)))) {
            full[pos(row, col)] = true;
        } else full[pos(row, col)] = false;
        return full[pos(row, col)];
    }

    // returns the number of open sites
    public int numberOfOpenSites() {

        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        boolean per = false;
        boolean okay = false;
        int i = width * (width - 1);
        while (okay != true && i < (width * width) - 1) {
            if (full[i]) {
                per = full[i];
                okay = true;
            } else i++;
        }
        return per;
    }

    // test client (optional)
    public static void main(String[] args) {

    }
}
