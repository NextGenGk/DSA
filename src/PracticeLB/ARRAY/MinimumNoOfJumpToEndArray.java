package PracticeLB.ARRAY;

public class MinimumNoOfJumpToEndArray {

    public static int jump(int[] num) {

        // count Number of Jump
        int jump = 0;
        // Position
        int position = 0;
        // On every index, you will see that if you had jumped from here, you could have got a better destination.
        int destination = 0;

        // length - 1 because no need to jump we stop there
        for (int i=0; i<num.length-1; i++) {

            // Check every index and find maximum destination
            destination = Math.max(destination, num[i] + i); // start 2, 4

            // if position = 0, we update the position to destination
            if (position == i) { // position == 2
                position = destination; // update 2 update 4
                jump++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] num = {2,3,1,1,4};
        int result = jump(num);
        System.out.println(result);
    }
}

// Time - O(n)
// Space - O(1)