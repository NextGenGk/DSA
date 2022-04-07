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
//        if (arr[index] >= arr[index+1]) {
//            // array is unsorted
//            return false;
//        }
//
//        // Recursive Case
//        return isSorted(arr, index+1);

        // Checking
        // If arr[index] is smaller than arr[index+1], which means array is sorted
        if (arr[index] <= arr[index+1]) {
            return isSorted(arr, index+1);
        }
        else {
            return false;
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(isSorted(arr, 0));
    }
}

// Time - 0(n)
// n represents the length of array
