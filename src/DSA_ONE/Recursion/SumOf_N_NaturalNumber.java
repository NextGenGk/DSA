package DSA_ONE.Recursion;

public class SumOf_N_NaturalNumber {

    // Function
    public static int sum(int n) {
        // Base Case
        if (n == 1) {
            return 1;
        }
        // Recursive Case
        return n + sum(n-1);
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

// Time - O(n)
// Space - ((n)

// Sum of natural numbers formula = [n(n+1)]/2
// Recursive - n + sum(n-1)

// The sum of n natural numbers is represented as [n(n+1)]/2. Natural numbers are the numbers that start from 1 and
// end at infinity. Natural numbers include whole numbers in them except the number 0.