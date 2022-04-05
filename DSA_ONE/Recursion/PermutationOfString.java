package DSA_ONE.Recursion;

public class PermutationOfString {

    // Swap Function
    public String swap(String a, int i, int j)
    {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    // Function
    private void permute(String s, int l, int r) {

        // Base Case
        if (l == r) {
            System.out.println(s);
            return;
        }

        // Looping
        for (int i=l; i<=r; i++) {
            // Calling Swap function
            swap(s, l, r);
            // Recursive Case
            permute(s, l+1, r);
            // BackTracking
            swap(s, l, r);
        }
    }

    // Main Function
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        PermutationOfString permutation = new PermutationOfString();
        permutation.permute(str, 0, n-1);
    }
}

// A permutation is a mathematical technique that determines the number of possible arrangements in a set when the
// order of the arrangements matters.

// Time Complexity: O(n*n!) Note that there are n! permutations and it requires O(n) time to print a permutation.
//Auxiliary Space: O(r – l)