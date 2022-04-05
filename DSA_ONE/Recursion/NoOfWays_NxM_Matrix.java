package DSA_ONE.Recursion;

public class NoOfWays_NxM_Matrix {

    // Function
    public static int countPaths(int m, int n) {

        // Base Case
        if (m == 1 || n == 1) {
            return 1;
        }

        // Recursive
        return countPaths(m-1, n) + countPaths(m, n-1);
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(countPaths(5,5));
    }
}

/* Time Complexity: O(2 (M + N)), Where ‘M’ is the number of rows and ‘N’ is the number of matrix columns. Since for
every recursive call, two more recursive calls are taking place. Thus, the worst-case time complexity will be O(2 (M + N)).
*/

/* Space Complexity:O(max(M, N)), where M is the number of rows and N is the number of matrix columns.Since due to the
 recursion stack space, the space complexity will be O(max(M, N)).
*/