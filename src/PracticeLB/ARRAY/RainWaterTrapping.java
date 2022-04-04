package PracticeLB.ARRAY;

public class RainWaterTrapping {

    // Method for maximum amount of water
    public static int trapRainWater(int[] arr) {

        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        int n = arr.length;
        int[] left = new int[n];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int[] right = new int[n];

        // Initialize result
        int water = 0;

        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        // Fill right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        return water;
    }


    // Main Function
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Maximum water that can be accumulated is " + trapRainWater(arr));
    }
}
// Time Complexity: O(n).
// Only one traversal of the array is needed, So time Complexity is O(n).
// Space Complexity: O(n).
//Two extra arrays are needed each of size n.

// Approach: In the previous solution, to find the highest bar on the left and right, array traversal is needed which
// reduces the efficiency of the solution. To make this efficient one must pre-compute the highest bar on the left and
// right of every bar in linear time. Then use these pre-computed values to find the amount of water in every array
// element.

// Algorithm:
// Create two arrays left and right of size n. create a variable max_ = INT_MIN.

// Run one loop from start to end. In each iteration update max_ as max_ = max(max_, arr[i]) and also assign left[i] = max_

// Update max_ = INT_MIN.

// Run another loop from end to start. In each iteration update max_ as max_ = max(max_, arr[i]) and also assign right[i] = max_

// Traverse the array from start to end.

// The amount of water that will be stored in this column is min(a,b) – array[i],(where a = left[i] and b = right[i])
// add this value to total amount of water stored

// Print the total amount of water stored.