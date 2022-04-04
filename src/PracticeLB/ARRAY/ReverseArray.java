package PracticeLB.ARRAY;

import java.util.Arrays;

public class ReverseArray {

    // Function
    public static void reverseArray(int[] arr) {
        for (int i=0; i< arr.length/2; i++) {
            int other = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    // 2nd Function
    public static void  reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Print Function
    public static void printArray(int[] arr, int size) {
        for (int i=0; i<size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverseArray(arr);
        printArray(arr, 4);

        System.out.println("Reversing An Array");
        reverse(arr, 0, 3);
        printArray(arr, 4);
    }
}

// Given an array (or string), the task is to reverse the array/string.
//  Time = O(n/2) or O(n)
// Space = 0(1)