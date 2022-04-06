package DSA_ONE.Recursion;

public class PrintKeypadCombination {

    // Given Keypad Combination
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    // Function
    public static void printCombination(String numStr, int idx, String combination) {

        // Base Case
        if (idx == numStr.length()) {
            System.out.println(combination);
            return;
        }

        // Storing current character with index
        char currChar = numStr.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i=0; i<mapping.length(); i++) {
            printCombination(numStr, idx+1, combination+mapping
                    .charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printCombination(str, 0, " ");
    }
}

// Time - 0(4^n)