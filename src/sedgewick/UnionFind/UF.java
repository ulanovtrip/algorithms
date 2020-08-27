package sedgewick.date.UnionFind; /****************************************************************************
 *  Compilation:  javac UF.java
 *  Execution:    java UF < input.txt
 *  Dependencies: StdIn.java StdOut.java
 *  Data files:   http://algs4.cs.princeton.edu/15uf/tinyUF.txt
 *                http://algs4.cs.princeton.edu/15uf/mediumUF.txt
 *                http://algs4.cs.princeton.edu/15uf/largeUF.txt
 *
 *  Weighted quick-union (without path compression).
 *
 *  % java UF < tinyUF.txt
 *  4 3
 *  3 8
 *  6 5
 *  9 4
 *  2 1
 *  5 0
 *  7 2
 *  6 1
 *  # components: 2
 *
 ****************************************************************************/


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * The <tt>UF</tt> class represents a union-find data data structure.
 * It supports the <em>union</em> and <em>find</em>
 * operations, along with a method for determining the number of
 * disjoint sets.
 * <p>
 * This implementation uses weighted quick union.
 * Creating a data structure with N objects takes linear time.
 * Afterwards, all operations are logarithmic worst-case time.
 * <p>
 * For additional documentation, see <a href="http://algs4.cs.princeton.edu/15uf">Section 1.5</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 */

public class UF {
    private int[] id;    // id[i] = parent of i (родительская ссылка)
    private int[] sz;    // sz[i] = number of objects in subtree rooted at i (индексируемый узлами массив)
    private int count;   // number of components

    /**
     * Create an empty union find data structure with N isolated sets.
     */
    public UF(int N)    {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    /**
     * Return the id of component corresponding to object p.
     * возвращает целочисленный идентификатор компонента для заданного узла
     */
    public int find(int p) {

        while (p != id[p])
            p = id[p];
        //возвращает имя корневого узла
        return p;
    }

    /**
     * Return the number of disjoint sets.
     * возвращает колличество компонентов.
     */
    public int count() {
        return count;
    }


    /**
     * Are objects p and q in the same set?
     * определяет принадлежат ли два узла одному компоненту (дереву).
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }


    /**
     * Replace sets containing p and q with their union.
     * объединяет два компонента, если два узла находятся в различных компонентах.
     */
    public void union(int p, int q) {
        //находим корни элементов
        int i = find(p);
        int j = find(q);
        //если p и q равны, то ничего делать не нужно, т.к. они в одном компоненте
        if (i == j) return;

        // make smaller root point to larger one
        //компонент p переименовывается в q
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        //счётчик узлов
        count--;
    }


    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);

        // read in a sequence of pairs of integers (each in the range 0 to N-1),
        // calling find() for each pair: If the members of the pair are not already
        // call union() and print the pair.
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println("# components: " + uf.count());
    }

}

