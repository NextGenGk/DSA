package PracticeRecursion;

public class GCD {

    // Method
    public static int greatestCommonDivisor(int a, int b) {

        // Constraint
        if (a<0 || b<0) {
            return -1;
        }
        // Base Case
        if (b == 0) {
            return a;
        }

        // Recursive Case
        return greatestCommonDivisor(b, a%b);
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(48,18));
    }
}


// gcd(48,18)
// Step 1 - 48/18 = 2 remainder 12
// Step 2 - 18/12 = 1 remainder 6
// Step 3 - 12/6 = 2 remainder 0

// Formula
// 18
// gcd(a,0) = a
// gcd(a,b) = gcd(b, a%b)
