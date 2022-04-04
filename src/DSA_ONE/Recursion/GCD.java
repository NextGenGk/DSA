package DSA_ONE.Recursion;

public class GCD {

    // Method
    private static int gcd(int a, int b) {

        // Constraint
        if (a<0 || b<0) {
            return -1;
        }

        // Base Case
        if (b == 0) {
            return a;
        }

        // Recursive Case
        return gcd(b, a%b);
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(gcd(25,60));
    }
}

// Time -  O(log(min(a, b))
// Space - o(n)

// Euclid’s Algorithm: It is an efficient method for finding the GCD ( Greatest Common Divisor) of two integers.
// The time complexity of this algorithm is O(log(min(a, b)).

// Formula
// gcd(a, b) = gcd(b, a%b)