package PracticeLB.ARRAY;

import java.util.HashSet;
import java.util.Set;

public class SubArrayIsEqualToZero {

    // Returns true if arr[]
    // has a subArray with zero sum
    static boolean subArrayExists(int[] arr) {

        // Creates an empty hashset
        Set<Integer> map = new HashSet<>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i=0; i< arr.length; i++) {
            // Add current element to sum
            sum = sum + arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i] == 0 || sum == 0 || map.contains(sum)) {
                return true;
            }
            // Add sum to hash set
            map.add(sum);
        }
        // We reach here only when there is
        // no subArray with 0 sum
        return false;
    }

    // Main Function
    public static void main(String[] args)
    {
        int[] arr = { 4, 2, -3, 1, 6 };
        if (subArrayExists(arr))
            System.out.println(
                    "Found a subArray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
    }
}

// Creates an empty hashset

// Initialize sum of elements

// Traverse through the given array

// Return true in following cases
// a) Current element is 0
// b) sum of elements from 0 to i is 0
// c) sum is already present in hash set

// Add sum to hash set

// We reach here only when there is
// no subArray with 0 sum


// Time Complexity of this solution can be considered as O(n) under the assumption that we have good hashing function
// that allows insertion and retrieval operations in O(1) time.
//Space Complexity: O(n) .Here we required extra space for unordered_set to insert array elements.