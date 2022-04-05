package Array;

import java.util.Arrays;

public class ReverseAnArray {
    static void reverse(int [] arr){
        for (int i=0; i<arr.length/2 ; i++){
            int other = arr.length-i-1;
            int temp = arr[i];
            arr[i] = arr[other];
            arr[other] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] customArray = {1,2,3,4};
        reverse(customArray);

    }
}
