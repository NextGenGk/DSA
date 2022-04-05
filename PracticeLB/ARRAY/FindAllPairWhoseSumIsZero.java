package PracticeLB.ARRAY;

import java.util.HashMap;

public class FindAllPairWhoseSumIsZero {

    // 1st Method
    public static int getPairsCount(int[] arr, int n, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {

            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 0);
            }
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null) {
                twice_count = twice_count + hm.get(sum - arr[i]);
            }

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i]) {
                twice_count--;
            }
        }

        // return the half of twice_count
        return twice_count / 2;
    }

    // 2nd Method
    public static int getPairsCount2(int[] arr, int n, int sum) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int count  =0 ;
        for (int i=0; i<n; i++) {
        if (map.containsKey(sum - arr[i])) {
            count = count + map.get(sum - arr[i]);
        }
        if (map.containsKey(arr[i])) {
            map.put(arr[i], map.get(arr[i] + 1));
        }
        else {
            map.put(arr[i], 1);
        }
    }
        return count;
}

    // Main Function
    public static void main(String[] args)
    {
        int[] arr = new int[] { 1, 5, 7, -1, 5 };
        int sum = 6;
        System.out.println(
                "Count of pairs is "
                        + getPairsCount(arr, arr.length, sum));
    }
}

// Efficient solution –
// A better solution is possible in O(n) time –

// Create a map to store frequency of each number in the array. (Single traversal is required)
// In the next traversal, for every element check if it can be combined with any other element (other than itself!)
// to give the desired sum. Increment the counter accordingly.
// After completion of second traversal, we’d have twice the required value stored in counter because every pair is
// counted two times. Hence. divide count by 2 and return.

// Time Complexity: O(n)
// Auxiliary Space: O(1)