package PracticeLB.ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    static int[][] intervals = {{1,3} , {2,6}, {8,10}, {15,18}};

    public static int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);

        // taking a list for result because we do not know the size of the final result
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        // j is point to the last value of resultant list
        int j = 0;

        for (int i=1; i<intervals.length; i++) {
            // we need to take last interval
            int[] interval = result.get(j);
            // if the value of the start of the second is less than end value of the resulting array
            if (intervals[i][0]<interval[i]) {
                interval[i] = Math.max(interval[i], intervals[i][1]);
            }
            else {
                result.add(intervals[i]);
                j++;
            }
        }
        int[][] arr = new int[j+1][2];
        for (int i=0; i<j+1; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(mergeIntervals(intervals));
    }
}
