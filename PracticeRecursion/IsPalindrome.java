package PracticeRecursion;

// IsPalindrome Method
public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        // Base Case
        {   // if length is 0 or 1 then String is palindrome
            if (str.length() == 0 || str.length() == 1)
                return true;
        }
        // Recursive Case
            if(str.charAt(0) == str.charAt(str.length()-1))
                return isPalindrome(str.substring(1, str.length()-1));
            return false;
        }

        // Main Class
    public static void main(String[] args) {
        String str = "gaurav";
        System.out.println(isPalindrome(str));
    }
}

// The characters read the same backward as forward. Some examples of palindromic words are
// deified, civic, radar, level, rotor, kayak, reviver, madam, and refer.
