package DSA_ONE.Mathematics;

public class PalindromeNumber {

    // Method
    public static void palindromeNumber(int n) {
        // Initialize variable
        int original = n;
        int reversed = 0;

        // while n is greater than zero
       while (n>0) {
           // Formula
           reversed = (reversed * 10) + n%10;
           n = n/10;
       }

       // check if reversedNum and originalNum are equal
       if (original == reversed) {
           System.out.println(original + " is Palindrome Number");
       }
       else {
           System.out.println("Not Palindrome Number");
       }
    }

    // Main Function
    public static void main(String[] args) {
        palindromeNumber(404);
    }
}

// Time - O(log10(n)).
// Space - O(1)

// racecar - racecar