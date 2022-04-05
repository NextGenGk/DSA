package DSA_ONE.Recursion;

public class SumOfDigits {

    // Function
    public static int sumOfDigits(int n) {

        // Base Case
        if (n == 0 || n < 0) {
            return 0;
        }

        // Recursive Case
        return n%10 + sumOfDigits(n/10);
    }

    // Main Function
    public static void main(String[] args) {
        System.out.println(sumOfDigits(900));
    }
}
// Formula
// n%10 + sumOfDigits(n/10);
// remainder

// Input : 12345
// Output : 15

// The step-by-step process for a better understanding of how the algorithm works.
// Let the number be 12345.
// Step 1-> 12345 % 10 which is equal-too 5 + ( send 12345/10 to next step )
// Step 2-> 1234 % 10 which is equal-too 4 + ( send 1234/10 to next step )
// Step 3-> 123 % 10 which is equal-too 3 + ( send 123/10 to next step )
// Step 4-> 12 % 10 which is equal-too 2 + ( send 12/10 to next step )
// Step 5-> 1 % 10 which is equal-too 1 + ( send 1/10 to next step )
// Step 6-> 0 algorithm stops

/* Time Complexity: O(log(N)): The recursive function is called a total of log(N)+1 times as the number of digits
 in a number is floor(log(N) + 1). Hence the time complexity of the algorithm is O(log(N)).*/

/*Space Complexity: O(log(N)): The algorithm has an overhead of recursion. Recursion uses stack memory to save the
 recursive states. The function is called a total of floor(log(N) +1) (Number of digits in the number) times before
 any backtrack, hence the space complexity is O(log(N)).*/