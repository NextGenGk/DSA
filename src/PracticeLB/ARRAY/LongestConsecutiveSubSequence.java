package PracticeLB.ARRAY;

import java.util.HashSet;

public class LongestConsecutiveSubSequence {

    // Returns length of the longest
    // consecutive subsequence
    static int findLongestConsecutiveSubSequence(int[] arr, int n)
    {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;

        // Hash all the array elements
        for (int i = 0; i < n; ++i)
            S.add(arr[i]);

        // check each possible sequence from the start
        // then update optimal length
        for (int i = 0; i < n; ++i) {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(arr[i] - 1)) {
                // Then check for next elements
                // in the sequence
                int j = arr[i];
                while (S.contains(j)) {
                    j++;
                    ans = Math.max(ans, j - arr[i]);
                }
            }
        }
        return ans;
    }


    // Main Function
    public static void main(String[] args)
    {
        int[] arr = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConsecutiveSubSequence(arr, n));
    }
}


// Algorithm:

// Create an empty hash.
// Insert all array elements to hash.
// Do following for every element arr[i]

// Check if this element is the starting point of a subsequence. To check this, simply look for arr[i] – 1 in the hash,
// if not found, then this is the first element a subsequence.

// If this element is the first element, then count the number of elements in the consecutive starting with this
// element. Iterate from arr[i] + 1 till the last element that can be found.

// If the count is more than the previous longest subsequence found, then update this.

// Time complexity: O(n)
// Auxiliary space: O(n)