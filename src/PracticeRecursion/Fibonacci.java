package PracticeRecursion;

public class Fibonacci {

    // Fibonacci Method
    //   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    public static int fibonacci(int n) {
        // Constraint
        if (n < 0) {
            return -1;
        }

        // Base Case
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive Case
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // Main Class
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}

/*
 the time complexity would be O(2^n) since every node will split into two subbranches. And the space complexity
 would be O(N) since the depth of the tree will be proportional to the size of n
 */

// Formula
// fibonacci(n-1) + fibonacci(n-2);