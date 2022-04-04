package DSA_ONE.Mathematics;

public class Factorial {

    // Method
    private static int factorial(int n) {
        // Initialize variable sum
        int sum = 1;
        // looping
        for (int i=2; i<=n; i++) {
            sum = sum * i;
        }

        return sum;
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

// Time - O(n)
// Space - (1)