package DSA_ONE.Recursion;

public class ArrayIsSortedStrictlyIncreasing {

    // Function
    public static boolean isSorted(int[] arr, int index) {

        // Base Case
        if (index == arr.length-1) {
            return true;
        }

        // Checking Condition
        // If arr[index] is greater than equal to arr[index+1], it means array is unsorted
        if (arr[index] >= arr[index+1]) {
            // array is unsorted
            return false;
        }

        // Recursive Case
        return isSorted(arr, index+1);
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        System.out.println(isSorted(arr, 0));
    }
}

// Time - 0(n)
// n represents the length of array
