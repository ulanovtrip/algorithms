# percolation
Coursera - Algorithms I - Assignment 1

See the Assessment Guide for information on how to interpret this report.

Assessment Summary

Compilation:  PASSED
Checkstyle:   PASSED
Findbugs:     PASSED
API:          PASSED

Correctness:  26/26 tests passed
Memory:       8/8 tests passed
Timing:       9/9 tests passed

Aggregate score: 100.00% [Correctness: 65%, Memory: 10%, Timing: 25%, Style: 0%]

Assessment Details

The following files were submitted:
----------------------------------
5.2K Dec 31 22:30 Percolation.java
2.3K Dec 31 22:30 PercolationStats.java
2.4K Dec 31 22:30 studentSubmission.zip


********************************************************************************
*  COMPILING                                                                   *
********************************************************************************


% javac Percolation.java
*-----------------------------------------------------------

% javac PercolationStats.java
*-----------------------------------------------------------


================================================================


% checkstyle *.java
*-----------------------------------------------------------

================================================================


% findbugs *.class
*-----------------------------------------------------------

================================================================


Testing the APIs of your programs.
*-----------------------------------------------------------
Percolation:

PercolationStats:

================================================================


******************************************************************************
*  TESTING CORRECTNESS
******************************************************************************

Testing correctness of Percolation
*-----------------------------------------------------------
Running 15 total tests.

Tests 1 through 8 create a Percolation object using your code, then repeatedly
open sites by calling open(). After each call to open(), we check the return
values of isOpen(i, j) for every (i, j), the return value of percolates(),
and the return value of isFull(i, j) for every (i, j), in that order.

Except as noted, a site is opened at most once.

Test 1: Open predetermined list of sites using file inputs
  *  filename = input6.txt
  *  filename = input8.txt
  *  filename = input8-no.txt
  *  filename = input10-no.txt
  *  filename = greeting57.txt
  *  filename = heart25.txt
==> passed

Test 2: Open random sites until just before system percolates
  *  n = 3
  *  n = 5
  *  n = 10
  *  n = 10
  *  n = 20
  *  n = 20
  *  n = 50
  *  n = 50
==> passed

Test 3: Opens predetermined sites for n = 1 and n = 2 (corner case test)
  *  filename = input1.txt
  *  filename = input1-no.txt
  *  filename = input2.txt
  *  filename = input2-no.txt
==> passed

Test 4: Check for backwash with predetermined sites
  *  filename = input20.txt
  *  filename = input10.txt
  *  filename = input50.txt
  *  filename = jerry47.txt
==> passed

Test 5: Check for backwash with predetermined sites that have
        multiple percolating paths
  *  filename = input3.txt
  *  filename = input4.txt
  *  filename = input7.txt
==> passed

Test 6: Predetermined sites with long percolating path
  *  filename = snake13.txt
  *  filename = snake101.txt
==> passed

Test 7: Opens every site
  *  filename = input5.txt
==> passed

Test 8: Open random sites until just before system percolates,
        allowing open() to be called on a site more than once
  *  n = 3
  *  n = 5
  *  n = 10
  *  n = 10
  *  n = 20
  *  n = 20
  *  n = 50
  *  n = 50
==> passed

Test 9: Check that IndexOutOfBoundsException is thrown if (i, j) is out of bounds
  *  n = 10, (i, j) = (0, 6)
  *  n = 10, (i, j) = (12, 6)
  *  n = 10, (i, j) = (11, 6)
  *  n = 10, (i, j) = (6, 0)
  *  n = 10, (i, j) = (6, 12)
  *  n = 10, (i, j) = (6, 11)
==> passed

Test 10: Check that IllegalArgumentException is thrown if N <= 0 in constructor
  *  n = -10
  *  n = -1
  *  n = 0
==> passed

Test 11: Create multiple Percolation objects at the same time
         (to make sure you didn't store data in static variables)
==> passed

Test 12: Open predetermined list of sites using file inputs,
         but change the order in which methods are called
  *  filename = input8.txt;  order =     isFull(),     isOpen(), percolates()
  *  filename = input8.txt;  order =     isFull(), percolates(),     isOpen()
  *  filename = input8.txt;  order =     isOpen(),     isFull(), percolates()
  *  filename = input8.txt;  order =     isOpen(), percolates(),     isFull()
  *  filename = input8.txt;  order = percolates(),     isOpen(),     isFull()
  *  filename = input8.txt;  order = percolates(),     isFull(),     isOpen()
==> passed

Test 13: Call all methods in random order until just before system percolates
  *  n = 3
  *  n = 5
  *  n = 7
  *  n = 10
  *  n = 20
  *  n = 50
==> passed

Test 14: Call all methods in random order until almost all sites are open,
         but with inputs not prone to backwash
  *  n = 3
  *  n = 5
  *  n = 7
  *  n = 10
  *  n = 20
  *  n = 50
==> passed

Test 15: Call all methods in random order until all sites are open,
         allowing open() to be called on a site more than once
         (these inputs are prone to backwash)
  *  n = 3
  *  n = 5
  *  n = 7
  *  n = 10
  *  n = 20
  *  n = 50
==> passed


Total: 15/15 tests passed!


================================================================
******************************************************************************
*  TESTING CORRECTNESS (substituting reference Percolation)
******************************************************************************

Testing correctness of PercolationStats
*-----------------------------------------------------------
Running 11 total tests.

Test 1: Test that PercolationStats creates trials Percolation objects, each of size n-by-n
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 2: Test that PercolationStats calls open() until system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 3: Test that PercolationStats does not call open() after system percolates
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 4: Test that mean() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 5: Test that stddev() is consistent with the number of intercepted calls to open()
        on blocked sites
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 6: Test that confidenceLo() and confidenceHigh() are consistent with mean() and stddev()
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 7: Check whether exception is thrown if either n or trials is out of bounds
  * n = -23, trials =  42
  * n =  23, trials =   0
  * n = -42, trials =   0
  * n =  42, trials =  -1
==> passed

Test 8: Create two PercolationStats objects at the same time and check mean()
        (to make sure you didn't store data in static variables)
  * n1 =  50, trials1 =  10, n2 =  50, trials2 =   5
  * n1 =  50, trials1 =   5, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  25, trials2 =  10
  * n1 =  25, trials1 =  10, n2 =  50, trials2 =  10
  * n1 =  50, trials1 =  10, n2 =  15, trials2 = 100
  * n1 =  15, trials1 = 100, n2 =  50, trials2 =  10
==> passed

Test 9: Check that the methods return the same value, regardless of
        the order in which they are called
  * n =  20, trials =  10
  * n =  50, trials =  20
  * n = 100, trials =  50
  * n =  64, trials = 150
==> passed

Test 10: Check for any calls to StdRandom.setSeed()
  * n = 20, trials = 10
  * n = 20, trials = 10
  * n = 40, trials = 10
  * n = 80, trials = 10
==> passed

Test 11: Check distribution of number of sites opened until percolation
  * n = 2, trials = 100000
  * n = 3, trials = 100000
  * n = 4, trials = 100000
==> passed


Total: 11/11 tests passed!


================================================================
******************************************************************************
*  MEMORY (substituting reference Percolation)
******************************************************************************

Computing memory of PercolationStats
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: Memory usage as a function of trials for n = 100
            (max allowed: 8*trials + 128 bytes)

            trials        bytes
--------------------------------------------
=> passed       16          184         
=> passed       32          312         
=> passed       64          568         
=> passed      128         1080         
==> 4/4 tests passed


Estimated student memory = 8.00 T + 56.00   (R^2 = 1.000)

Total: 4/4 tests passed!

================================================================



******************************************************************************
*  MEMORY
******************************************************************************

Computing memory of Percolation
*-----------------------------------------------------------
Running 4 total tests.

Test 1a-1d: Check that total memory <= 17 n^2 + 128 n + 1024 bytes

                 n        bytes
--------------------------------------------
=> passed       64        71976         
=> passed      256      1122600         
=> passed      512      4473128         
=> passed     1024     17858856         
==> 4/4 tests passed


Estimated student memory = 17.00 n^2 + 32.00 n + 296.00   (R^2 = 1.000)


Test 2 (bonus): Check that total memory <= 11 n^2 + 128 n + 1024 bytes
   -  failed memory test for n = 64
==> FAILED


Total: 4/4 tests passed!

================================================================



******************************************************************************
*  TIMING
******************************************************************************

Timing Percolation
*-----------------------------------------------------------
Running 9 total tests.

Test 1a-1e: Create an n-by-n percolation system; open sites at random until
            the system percolates. Count calls to connected(), union() and
            find() in WeightedQuickUnionUF.
                                                 2 * connected()
                 n   seconds       union()              + find()        constructor
---------------------------------------------------------------------------------------------
=> passed        8     0.00          124                   250                   2         
=> passed       32     0.00         1501                  3092                   2         
=> passed      128     0.01        22515                 48006                   2         
=> passed      512     0.06       370380                785726                   2         
=> passed     1024     0.15      1457240               3100964                   2         
==> 5/5 tests passed

Running time in seconds depends on the machine on which the script runs,
and  varies each time that you submit. If one of the values in the table
violates the performance limits, the factor by which you failed the test
appears in parentheses. For example, (9.6x) in the union() column
indicates that it uses 9.6x too many calls.


Tests 2a-2d: Check whether number of calls to union(), connected(), and find()
             is a constant per call to open(), isFull(), and percolates().
             The table shows the maximum number of union(), connected(), and
             find() calls made during a single call to open(), isFull(), and
             percolates().

                 n     per open()      per isOpen()    per isFull()    per percolates() 
---------------------------------------------------------------------------------------------
=> passed       32        8               0               1               1         
=> passed      128        8               0               1               1         
=> passed      512        8               0               1               1         
=> passed     1024        8               0               1               1         
==> 4/4 tests passed

Total: 9/9 tests passed!

================================================================



