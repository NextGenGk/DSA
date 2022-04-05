package Searching;

public class LinearSearch {

    // Linear Search Method
    public static int linearSearch(int[] arr, int value){
        for (int i=0; i< arr.length; i++){
            if (arr[i] == value){
                System.out.println("The element is found at the index: " + i);
                return i;
            }
        }
        System.out.println("The element " + value+ " not found.");
        return -1;
    }

    // Main Class
    public static void main(String[] args) {
        int[] arr = {9,6,1,7,8};
        LinearSearch.linearSearch(arr,1);
    }
}
