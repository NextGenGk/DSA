package DSA_ONE.Recursion;

public class RemoveDuplicatesInString {

    // Creating Map, Stored Character with index (Storing a to z)
    public static boolean[] map = new boolean[26];

    // Function
    public static void removeDuplicates(String str, int idx, String newString) {

        // Base Case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }


        // Storing current character with index
        char currChar = str.charAt(idx);
        // Map index calculate = map[currChar - 'a']
        // got the true meaning, first time we visit, it means no currCharacter add on new String
        if (map[currChar - 'a'] == true) {
            // Recursive Case
            removeDuplicates(str, idx+1, newString);
        }
        // False meaning is not found, it means currCharacter add on new String
        // and isVisited is true
        else {
            newString = newString + currChar;
            map[currChar - 'a'] = true;
            // Recursive Case
            removeDuplicates(str, idx+1, newString);
        }
    }

    // Main Function
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }
}

// Time - 0(n)
// n represents the length of string

/*
a - a = 0
b - a = 1
c - a = 2
z - a = 25
 */