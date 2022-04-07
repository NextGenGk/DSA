package DSA_ONE.Recursion;

public class FindOccurance {
    // Initialize Variable
    public static int first = -1;
    public static int last = -1;

    // Function
    public static void findOccurance(String str, int index, char element) {

        // Base Case
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        // Checking Element
        char currChar = str.charAt(index);
        if (currChar == element) {
            if (first == -1) {
                first = index;
            }
            else {
                last = index;
            }
        }

        // Recursive Case
        findOccurance(str, index+1, element);
    }

    // Main Function
    public static void main(String[] args) {
        String str = "abcdaacacac";
        findOccurance(str, 0, 'a');
    }
}

// Time - 0(n)
// n represents the length of String

// Find the first and last occurance of an element n given String