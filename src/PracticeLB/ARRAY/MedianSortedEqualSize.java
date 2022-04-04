package PracticeLB.ARRAY;

public class MedianSortedEqualSize {

    public static int getMedian(int[] arr1, int[] arr2, int n) {

        // Initialize index variable
        int i = 0;
        int j = 0;
        int count;

        // Initialize median m1 & median m2 to -1
        int m1 = -1;
        int m2 = -1;

        /* Since there are 2n elements, median will
           be average of elements at index n-1 and
           n in the array obtained after merging ar1
           and arr2 */
        for (count = 0; count <= n; count++) {
            /* Below is to handle case where all
              elements of arr1[] are smaller than
              smallest(or first) element of arr2[] */
            if (i == n) {
                m1 = m2;
                m2 = arr2[0];  // i = arr2
                break;
            }
             /* Below is to handle case where all
               elements of arr2[] are smaller than
               smallest(or first) element of arr1[] */
            else if (j == n) {
                m1 = m2;
                m2 = arr1[0];  // j = arr1
                break;
            }

             /* equals sign because if two
               arrays have some common elements */

            // arr1 is smaller than arr2 -> (arr1 -> m2)
            if (arr1[i] < arr2[j]) {
                /* Store the prev median */
                m1 = m2;
                m2 = arr1[i];
                i++;
            } else {
                /* Store the prev median */
                // arr1 is greater than arr2 -> (arr2 -> m2)
                m1 = m2;
                m2 = arr2[j];
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};

        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 == n2) {
            System.out.println("Median is " + getMedian(arr1, arr2, n1));
        }
        else {
            System.out.println("arrays are of unequal size");
        }
    }
}

// Time Complexity : O(n)
//Auxiliary Space: O(1)
