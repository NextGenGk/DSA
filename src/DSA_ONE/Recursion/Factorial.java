package DSA_ONE.Recursion;

public class Factorial {

    // factorial Method
    // 3 * 2 * 1 = 6
    public static int factorial(int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        // Recursive Case
        return n * factorial(n - 1);
    }

    // Main Class
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}

/* The factorial function (symbol: !) says to multiply all whole numbers from our chosen number down to 1.
 Examples: 4! = 4 × 3 × 2 × 1
 */

// Formula
// n * factorial(n - 1);

/*
To represent in Big-Oh notation, T(N) is directly proportional to n, Therefore, The time complexity of recursive
factorial is O(n). As there is no extra space taken during the recursive calls,the space complexity is O(N).
 */
