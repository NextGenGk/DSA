package DSA_ONE.Recursion;

public class PowerSetOfGivenString {

    // str : Stores input string
    // curr : Stores current subset
    // i : Index in current subset, curr
    public static void powerSet(String str, int i, String curr) {

        // Base Case
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }

        // Recursive Case

        // Two cases for every character
        // (i) We consider the character as part of current subset
        powerSet(str, i+1, curr + str.charAt(i));
        // (ii) We do not consider current character as part of current subset
        powerSet(str,i+1,curr);
    }

    // Main Function
    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        String curr="";
        powerSet(str,index,curr);
    }
}

// Time - 0(n)
// Space - O(n)