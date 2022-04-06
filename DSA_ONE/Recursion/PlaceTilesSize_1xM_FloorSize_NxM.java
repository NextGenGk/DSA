package DSA_ONE.Recursion;

public class PlaceTilesSize_1xM_FloorSize_NxM {

    // Function
    public static int placeTiles(int n, int m) {

        // Base Case
        if (n == m) {
            return 2;
        }

        // Base Case
        if ( n < m) {
            return 1;
        }

        // Recursive Case
        // Place Vertically (n-1)
        int verticalPlacement = placeTiles(n-1, m);

        // Place Horizontally (n-2)
        int horizontalPlacement = placeTiles(n-2, m);

        // Return
        return verticalPlacement + horizontalPlacement;

    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(placeTiles(4,2));
    }
}

/*
Time Complexity
O(N), because in order to solve the problem of tiling grid 2xN. You need to have calculated the answer for tiling grid of size less than N.

Space Complexity
O(N), because we are storing the result for all the subProblems and thus the space required is linear.
 */

// n is the no. of rows
// m is the no. cf columns

/*
Explanation:
Output: 5

For a 4 x 2 board, there are 5 ways

All 4 vertical (1 way)
All 4 horizontal (1 way)
2 vertical and 2 horizontal (3 ways)
 */

/*
Implementation –

Let “count(n)” be the count of ways to place tiles on a “2 x n” grid, we have following two ways to place first tile.
1) If we place first tile vertically, the problem reduces to “count(n-1)”
2) If we place first tile horizontally, we have to place second tile also horizontally. So the problem reduces to
“count(n-2)”
Therefore, count(n) can be written as below.

   count(n) = n if n = 1 or n = 2
   count(n) = count(n-1) + count(n-2)
 */

/*
We can solve this problem by using recursion. In the problem, we need to tile a grid of 2xN. So it will depend
on the number of ways to tile grid of size 2x(N-1) and 2x(N-2). How can we say that?

The reason is simple, instead of thinking to tile the first column in grid then second and so on.
We are trying to tile first the Nth column, then N-1 and so on. This way know that if we place a 2×1 tile on N
th column. The problem is now converted to a sub-problem of tiling grid of size 2x(N-1). Similarly, if we place
two 1×2 tiles in 2xN grid, the problem is converted to 2x(N-2) size. Now if we can somehow solve these problems,
we can get the answer.

Let’s say Tile[N] denotes the number of ways to tile grid of size 2XN. Then Tile[N] = Tile[N-1] + Tile[N-2].
Similarly, Tile[N-1] = Tile[N-2] + Tile[N-3]. Thus the problem shows optimal substructure. It’s better to store
the result for Tile[N-2] because it is being used twice. If we store the result, we will not compute it twice and
will reduce the time complexity significantly. Thus we will use Dynamic Programming to solve the problem.
 */
