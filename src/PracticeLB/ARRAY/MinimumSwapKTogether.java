package PracticeLB.ARRAY;

public class MinimumSwapKTogether {

    public static int minSwap(int[] arr, int n, int k) {
        int fav = 0;
        int nonFav = 0;

        // No.of favorable element (Window size)
        for (int i=0; i<n; i++) {
            // If element is smaller than k, fav++
            if (arr[i]<=k) {
                fav++;
            }
        }

        // Checking this window for non-favorable element
        for (int j=0; j<fav; j++) {
            // If element is greater than k, nonFav++
            if (arr[j]>k) {
                nonFav++;
            }
        }

        // Starting of window
        int start = 0;
        // Ending of window
        int end = fav - 1;
        // Initialize result
        int result = Integer.MAX_VALUE;

        while (result < n) {
            result = Math.min(result, nonFav);
            end++;
            if (end<n && arr[end]>k) {
                nonFav++;
            }
            if (start<n && arr[start]>k) {
                nonFav--;
                start++;
            }
        }
        return (result == Integer.MAX_VALUE)?0:result;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
        int n = arr.length;
        int k = 3;
        System.out.print(minSwap(arr, n, k) + "\n");
    }
}
