package DSA_ONE.Recursion;

public class PalindromeString {

    // Function
    private static boolean isPalindrome(String str, int l, int r) {

        // Base Case
        if (l >= r) {
            return true;
        }

        if (str.charAt(l) != str.charAt(r)) {
            return false;
        }

        // Recursive Case
        return isPalindrome(str, l+1, r-1);
    }

    // Main Function
    public static void main(String[] args) {
        String str = "racecar";
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }
}

// Time - 0(n)
// Space - O(n)

// The time complexity of all above-discussed methods is O(n), where n is the length of the input string. The iterative
// version does not require any extra space, whereas the recursive version requires O(n) implicit space for the call
// stack.
