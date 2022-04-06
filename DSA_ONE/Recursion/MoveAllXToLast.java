package DSA_ONE.Recursion;

public class MoveAllXToLast {

    // Function
    public static void moveAllX(String str, int idx, int count, String newString) {

        // Base Case + Print
        if (idx == str.length()) {
            for (int i=0; i<count; i++) {
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }

        // Storing current character with index & Checking
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;

            // Recursive Case
            moveAllX(str, idx+1, count, newString);
        }
        else {
            newString = newString + currChar;

            // Recursive Case
            moveAllX(str, idx+1, count, newString);
        }
    }

    // Main Function
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}

// Time - 0(n)
// n represents the length of string