package DSA_ONE.Recursion;

public class TowerOfHanoi {

    // Function
    public static void towerOfHanoi(int noOfDisks, String src, String helper, String dest) {

        // Base Case
        if (noOfDisks == 1){
            System.out.println("Transfer disk " + noOfDisks + " from Source " + src + " to dest " + dest);
            return;
        }

        // Recursive Case
        // Source -> Helper (using Destination as a Helper)
        towerOfHanoi(noOfDisks-1, src, dest, helper);

        // Print
        System.out.println("Transfer disk " + noOfDisks + " from Source " + src + " to dest " + dest);

        // Recursive Case
        // Helper -> Destination (using Source as a Helper)
        towerOfHanoi(noOfDisks-1, helper, src, dest);
    }

    // Main Method
    public static void main(String[] args) {
        int noOfDisks = 3;
        towerOfHanoi(noOfDisks, "S", "H", "D");
    }
}

// Time - 0(2n)

/*
Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move
the entire stack to another rod, obeying the following simple rules:

Only one disk can be moved at a time.
Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e.
a disk can only be moved if it is the uppermost disk on a stack.
No disk may be placed on top of a smaller disk.
 */

/*
An example with 3 disks :
Step 1 : Shift first disk from 'A' to 'C'.
Step 2 : Shift second disk from 'A' to 'B'.
Step 3 : Shift first disk from 'C' to 'B'.

Step 4 : Shift third disk from 'A' to 'C'.

Step 5 : Shift first disk from 'B' to 'A'.
Step 6 : Shift second disk from 'B' to 'C'.
Step 7 : Shift first disk from 'A' to 'C'.
 */

/*
The pattern here is :
 - Shift 'n-1' disks from 'A' to 'B', using C.
 - Shift last disk from 'A' to 'C'.
 - Shift 'n-1' disks from 'B' to 'C', using A.
 */