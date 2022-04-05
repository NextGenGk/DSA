package PracticeLB.ARRAY;

import java.util.Arrays;

public class CyclicallyRotateAnArrayByOne {

    // Method
    public static void rotate(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

        System.out.println("Rotated Array is");
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// We can use two pointers, say i and j which point to first and last element of array respectively.
// As we know in cyclic rotation we will bring last element to first and shift rest in forward direction,
// so start swapping arr[i] and arr[j] and keep j fixed and i moving towards j.
// Repeat till i is not equal to j.