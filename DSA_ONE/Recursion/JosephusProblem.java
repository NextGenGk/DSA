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