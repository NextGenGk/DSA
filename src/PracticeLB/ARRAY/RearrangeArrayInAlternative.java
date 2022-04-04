package PracticeLB.ARRAY;

public class RearrangeArrayInAlternative {

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    // Shift all the positive element in one side
    public static void rearrangeArrayPtoN(int[] arr, int n) {
        int i = 0;
        int j = n-1;

        while (i<j) {
            // Positive case i++
            // i less than equal to j && arr[i] is greater than 0, i++
            while (i<=j && arr[i]>0) {
                i++;
            }
            // Negative case j--
            // j is greater than equal to 0 && arr[j] is less than 0, j--
            while (j>=0 && arr[j]<0) {
                j--;
            }
            // i less than equal to h, swap i,j
            if (i<j){
                swap(arr,i,j);
            }
        }

        if (i == 0 && i ==n) {
            return;
        }
        int k=0;
        while (k<n && i<n) {
            swap(arr,k,i);
            i=i+1;
            k=k+2;
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {2,3,-4,-1,6,-9};
        int n = arr.length;
        rearrangeArrayPtoN(arr,n);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Time - O(n)
// Space - O(1)