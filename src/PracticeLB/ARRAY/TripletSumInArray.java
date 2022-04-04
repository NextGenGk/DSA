package PracticeLB.ARRAY;

import java.util.HashSet;

public class TripletSumInArray {

    // returns true if there is triplet
    // with sum equal to 'sum' present
    // in A[]. Also, prints the triplet
    public static boolean findTriplets(int[] arr, int sizeOfArray, int sum) {

        // Fix the first element as arr[i]
        for (int i=0; i<sizeOfArray-2; i++) {

            // Find pair in subArray arr[i+1..n-1]
            // with sum equal to sum - A[i]
            HashSet<Integer> hashSet = new HashSet<>();
            int toFind = sum - arr[i];
            for (int j=i+1; j<sizeOfArray; j++) {
                if (hashSet.contains(toFind - arr[j])) {
                    return true;
                }
                hashSet.add(arr[j]);
            }
        }
        // If we reach here, then no triplet was found
        return false;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 13;
        int sizeOfArray = arr.length;

        System.out.println(findTriplets(arr, sizeOfArray, sum));
    }
}
// Brute Force
// Algorithm:
// Traverse the array from start to end. (loop counter i)
// Create a HashMap or set to store unique pairs.
// Run another loop from i+1 to end of the array. (loop counter j)
// If there is an element in the set which is equal to x- arr[i] – arr[j], then print the triplet (arr[i], arr[j], x-arr[i]-arr[j]) and break
// Insert the jth element in the set.

// Time - O(n^2)
// Space - O(n)