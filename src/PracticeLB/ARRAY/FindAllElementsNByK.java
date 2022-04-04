package PracticeLB.ARRAY;

import java.util.HashMap;
import java.util.Map;

public class FindAllElementsNByK {

    // Method
    public static int moreThanNdK(int[] arr, int n, int k) {
        int barrier = n/k;

        // Hash map initialization
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;

        // Looping for calculate Frequency
        // if arr[i] is present then add +1,
        for (int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // iterate over each element in the hash table
        // and check their frequency, if it is more than
        // n/k, print it.
         for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
             if (entry.getValue() > barrier) {
                 counter++;
             }
         }
         return counter;
    }

    // Main Function
    public static void main(String[] args) {
        int[] a = new int[] { 3, 1, 2, 2, 1, 2, 3, 3 };
        int n = 8;
        int k = 4;
        System.out.println(moreThanNdK(a, n, k));
    }
}
