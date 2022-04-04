package PracticeRecursion;

public class SumOfDigits {

    // Method
    public static int sumOfDigits(int n) {
        // Base Case
        if (n == 0 || n < 0) {
            return 0;
        }
        // Recursive Case
        return n%10 + sumOfDigits(n/10);
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println(sumOfDigits(900));
    }
}

// 10 / 10 = 1 and remainder is 0               = 1
// 54 / 10 = 5 and remainder is 4               = 9
// 112 / 10 = 11 and remainder is 2             = 4
// 11 / 10 = 1 and remainder is 1
