package DSA_ONE.Recursion;

import java.util.HashSet;

public class UniqueSubsequenceOfString {

    public static void printUniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {

        // Base Case
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        // Recursive Case
        // to be
        printUniqueSubsequence(str, idx+1, newString+currChar, set);

        // or not to be
        printUniqueSubsequence(str, idx+1, newString, set);
    }

    // Main Function
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequence(str,0,"", set);
    }
}
