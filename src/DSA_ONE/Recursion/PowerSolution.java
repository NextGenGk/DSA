package DSA_ONE.Recursion;

public class PowerSolution {

    // Function
    public static int power(int a, int b) {

        // Base Case
        if (b == 0)  {
            return 1;
        }

        // Recursive Case
        return a * power(a, b-1);
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(power(3,4));
    }
}

// Time - O(n)
// Space - ((n)

// Power a^b
// return a * power(a, b-1);