package Questions.PracticeArray;

import java.util.Arrays;
import java.util.Collections;

public class BestScore {

    // Method
    public static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first+" "+second;
    }

    // Main Method
    public static void main(String[] args) {
        Integer[] myArray = {13,98,67,87,34,56,72,1,9,2,77,45};
        System.out.println(firstSecond(myArray));
    }
}
