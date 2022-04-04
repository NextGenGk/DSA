package PracticeLB.ARRAY;

public class UnionAndIntersection {

    /* Function prints union of arr1[] and arr2[]
    m is the number of elements in arr1[]
    n is the number of elements in arr2[] */

    // Union
    static int printUnion(int[] arr1, int[] arr2, int m, int n) {
        int i=0, j=0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                System.out.println(arr2[j]);
                j++;
            }
            else {
                System.out.println(arr2[j++]);
                i++;
            }
        }

        /* Print remaining elements of the larger array */
        while (i < m) {
            System.out.print(arr1[i++] + " ");
        }
        while (j < n) {
            System.out.print(arr2[j++] + " ");
        }
            return 0;
    }

    // Intersection
    static void printIntersection(int[] arr1, int[] arr2, int m, int n) {
        int i=0, j=0;
        while (i < m && j < n){
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {
                System.out.println(arr1[i++]);
                j++;
            }
        }
    }

    // Main Function
    public static void main(String[] args)
    {
        int[] arr1 = { 1, 2, 4, 5, 6 };
        int[] arr2 = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);
        printIntersection(arr1, arr2, m, n);
    }
}

// Union
// 1) Use two index variables i and j, initial values i = 0, j = 0
// 2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
// 3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
// 4) If both are same then print any of them and increment both i and j.
// 5) Print remaining elements of the larger array.

// Time Complexity : O(m + n)
// Auxiliary Space : O(1)

// InterSection
// 1) Use two index variables i and j, initial values i = 0, j = 0
// 2) If arr1[i] is smaller than arr2[j] then increment i.
// 3) If arr1[i] is greater than arr2[j] then increment j.
// 4) If both are same then print any of them and increment both i and j.

