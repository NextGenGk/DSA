package DSA_ONE.Recursion;

import java.util.ArrayList;

public class SubsetOfFirstNNaturalNumber {

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    // Function
    public static void findSubset(int n, ArrayList<Integer> subset) {

        // Base case
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // will add
        subset.add(n);
        // Recursive Case
        findSubset(n-1, subset);

        // will not add
        subset.remove(subset.size()-1);
        // Recursive case
        findSubset(n-1, subset);
    }

    // Main Function
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}

// Time - 0(2^n)