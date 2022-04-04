package PracticeLB.ARRAY;

import java.util.Arrays;

public class MergeTwoSortedArrayO1 {

    // 1st Method
//    static int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
//    static int arr2[] = new int[]{2, 3, 8, 13};
//
//    static void merge(int n, int m) {
//        int i = 0;

    // While loop till last element
    // of array 1(sorted)
    // is greater than first element
    // of array 2(sorted)
//        while (arr1[n - 1] > arr2[0]) {
//            if (arr1[i] > arr2[0]) {

    // Swap arr1[i] is greater than first element
    // of arr2 and sorting the updated
    // arr2(arr1 is already sorted)
    //   swap arr1[i] with arr2[0]
    //              sort arr2
    //         incrementing i
//                int temp = arr1[i];
//                arr1[i] = arr2[0];
//                arr2[0] = temp;
//                Arrays.sort(arr2);
//            }
//            i++;
//        }
//    }
//
    // 2nd Method

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0;

        while (i < n) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                fxArr(arr2);
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void fxArr(int[] arr2) {
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < arr2[i - 1]) {
                int temp = arr2[i];
                arr2[i] = arr2[i - 1];
                arr2[i - 1] = temp;
            }
        }
    }
}
    // Driver code
//    public static void main(String[] args) {
//        merge(arr1.length, arr2.length);
//
//        System.out.print("After Merging \nFirst Array: ");
//        System.out.println(Arrays.toString(arr1));
//
//        System.out.print("Second Array: ");
//        System.out.println(Arrays.toString(arr2));
// }

// 1) Initialize i with 0
// 2) Iterate while loop until last element of array 1 is greater than first element of array 2
//          if arr1[i] greater than first element of arr2
//              swap arr1[i] with arr2[0]
//              sort arr2
//          incrementing i

// Time Complexity: O(nlogn)
// Space Complexity: O(1)

// Time Complexity: O(m*n)
// Space Complexity: O(1)