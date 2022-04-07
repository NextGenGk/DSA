package DSA_ONE.Recursion;

public class NoOfWays_NxM_Matrix {

    // Function
    // Returns count of possible paths to reach
    // cell at row number m and column number n
    // from the topmost leftmost cell (cell at 1, 1)
    public static int countPaths(int n, int m) {

        // Base Case
        // If either given row number is first or
        // given column number is first
        if (n == 1 || m == 1) {
            return 1;
        }

        // Recursive
        // If diagonal movements are allowed then
        // the last addition is required.
        return countPaths(n-1, m) + countPaths(n, m-1);
        // bottom + right
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
    }
}

/* Time Complexity: O(2 (M + N)), Where ‘M’ is the number of rows and ‘N’ is the number of matrix columns. Since for
every recursive call, two more recursive calls are taking place. Thus, the worst-case time complexity will be O(2 (M + N)).
*/

/* Space Complexity:O(max(M, N)), where M is the number of rows and N is the number of matrix columns.Since due to the
 recursion stack space, the space complexity will be O(max(M, N)).
*/