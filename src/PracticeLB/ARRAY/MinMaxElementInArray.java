package PracticeLB.ARRAY;

public class MinMaxElementInArray {

    /* Class Pair is used to return two values from getMinMax() */
    static class Pair {
        int min;
        int max;
    }

    // Method
    static Pair getMinMax(int[] arr, int n) {
        Pair minMax = new Pair();

        /* If there is only one element then return it as min and max both */
        if (n == 1) {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }

        /* If there are more than one element, then initialize min and max */
        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        } else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            } else if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }

        return minMax;
    }

    /* Main Function */
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int arrSize = 6;
        Pair minMax = getMinMax(arr, arrSize);
        System.out.println("Minimum element is " + minMax.min);
        System.out.println("Maximum element is " + minMax.max);
    }

}

/* the function declaration becomes: struct pair getMinMax(int arr[], int n) where arr[]
   is the array of size n whose minimum and maximum are needed. */

// Time Complexity is O(n)
// Space Complexity is O(1)