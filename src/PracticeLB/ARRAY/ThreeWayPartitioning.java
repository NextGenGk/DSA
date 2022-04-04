package PracticeLB.ARRAY;

public class ThreeWayPartitioning {

    // Swap Function
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    // Function
    public static void threeWayPartition(int[] arr, int a, int b) {

        // Initialize ext available positions for
        // smaller (than range) and greater elements
        int start = 0;
        int end = arr.length-1;

        // Traverse elements from left
        for(int i = 0; i <= end;)
        {

            // If current element is smaller than
            // range, put it on next available smaller
            // position.

            if(arr[i] < a)
            {
                swap(arr, start, i);
                start++;
                i++;
            }

        // If current element is greater than
        // range, put it on next available greater
        // position.
            else if(arr[i] > b)
        {
            swap(arr, end, i);
            end--;
        }
        else
            i++;
    }
}

// Main Function
    public static void main(String[] args) {
        int[] arr =  {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        threeWayPartition(arr, 10, 20);
        System.out.println("Modified array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)

// An efficient solution is based on Dutch National Flag based QuickSort. We traverse given array elements from left.
// We keep track of two pointers, first (called start in below code) to store next position of smaller element
// (smaller than range) from beginning; and second (called end in below code) to store next position of greater
// element from end.
//1 5 4 2 1 3 14 20 20 98 87 32 54