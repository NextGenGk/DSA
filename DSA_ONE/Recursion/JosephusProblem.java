package DSA_ONE.Recursion;

public class JosephusProblem {

    // Function
    public static int josephus(int n, int k) {

        // Base Case
        if (n == 1) {
            return 0;
        }

        // Recursive Case
        return (josephus(n - 1, k) + k ) % n;
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(josephus(5,3));
    }
}


// Time Complexity: O(n)
//Auxiliary Space: O(n)

/*
After the first person (kth from beginning) is killed, n-1 persons are left. So we call josephus(n – 1, k) to get
the position with n-1 persons. But the position returned by josephus(n – 1, k) will consider the position starting
from k%n + 1. So, we must make adjustments to the position returned by josephus(n – 1, k).
 */