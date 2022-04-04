package PracticeRecursion;

public class DecimalToBinary {

    // Method
    public static int decimalToBinary(int n) {
        // Constraint
        if (n < 0) {
            return -1;
        }

        // Base Case
        if (n == 0) {
            return 0;
        }

        // Recursive Case
        return n%2 + 10*decimalToBinary(n/2);
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println(decimalToBinary(13));
    }
}

// Step 1 - Divide the number by 2
// Step 2 - Get the Integer Quotient for the next iteration
// Step 3 - Get the Remainder for the binary digit
// Step 4 - Repeat the steps until the Quotient is equal to 0

// Div by 2     Quo     Rem
// 13 / 2        6       1      110 * 10 + 1 = 1101
// 6 / 2         3       0      11 * 10 + 0 = 110
// 3 / 2         1       1
// 1 / 2         0       1      1 * 10 + 1 = 11

// Formula
// f(n) = n%2 + 10*f(n/2)