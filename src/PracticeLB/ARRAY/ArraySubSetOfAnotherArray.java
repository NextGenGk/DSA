package PracticeLB.ARRAY;

import java.util.HashSet;

public class ArraySubSetOfAnotherArray {

    // Function
    public static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {

        // Initializing HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        // HashSet stores all the values of arr1
        for (int i = 0; i < m; i++) {
            hashSet.add(arr1[i]);
        }

        // loop to check if all elements
        //  of arr2 also lies in arr1
        for (int j = 0; j < n; j++) {
            if (!hashSet.contains(arr2[j])) {
                return false;
            }
        }
        return true;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.println("arr2 is a subset of arr1");
        else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }
}

// Brute force
// Algorithm
// Create a Hash Table for all the elements of arr1[].
// Traverse arr2[] and search for each element of arr2[] in the Hash Table. If element is not found then return 0.
// If all elements are found then return 1.

// Time = O(m)
// Space = O(1)