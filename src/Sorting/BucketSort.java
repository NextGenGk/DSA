package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    int[] arr;

    // Constructor
    public BucketSort(int[] arr) {
        this.arr = arr;
    }

    // Printing an Array
    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    Print Buckets
//    public void printBucket(ArrayList<Integer>[] buckets) {
//        for (int i = 0; i < buckets.length; i++) {
//            System.out.println("\nBucket#" + i + ":");
//            for (int j = 0; j < buckets[i].size(); j++) {
//                System.out.print(buckets[i].get(j) + " ");
//            }
//        }
//    }

    // BucketSorting ( Finding Number Of Bucket )
    // No. of bucket = round(sqrt(no. of element))
    public void bucketSort() {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // Creating Bucket
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        // initializing empty ArrayList
        for (int i=0; i<buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        // Inserting the elements inside the bucket ( Which bucket to put which value )
        for (int value : arr){
            // Finding Bucket Number
            // ceil(Value * Number Of Bucket / maxValue )
            int bucketNumber = (int) Math.ceil((float)value * numberOfBuckets /(float) maxValue);
            buckets[bucketNumber-1].add(value);
        }
//        System.out.println("\n\nPrinting buckets before sorting...");
//        printBucket(buckets);

        // Sorting The Bucket
        for (ArrayList<Integer> bucket : buckets){
            Collections.sort(bucket);
        }
//        System.out.println("\n\nPrinting buckets after sorting...");
//        printBucket(buckets);

        // Combining the Bucket
        int index = 0;
        for (ArrayList<Integer> bucket : buckets){
            for (int value : bucket){
                arr[index] = value;
                index++;
            }
        }
    }

    // Main Class
    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 3, 2};
        BucketSort bucketSort = new BucketSort(arr);
        bucketSort.printArray();
        bucketSort.bucketSort();
        bucketSort.printArray();
    }
}


