package Array2D;

public class TwoDimensionalArray {
    int[][] arr = null;

    // Constructor
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr.length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array
    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    // Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row#" + row + ", Col#" + col);
        try {
            System.out.println("Cell value is: " + arr[row][col]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    // Traverse 2D array
    public void traverse() {
        for (int row=0; row<arr.length; row++) {
            for (int col=0; col<arr.length; col++) {
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }
    }

    // Searching a single value from the Array
    public void search(int value) {
        for (int row=0; row<arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at row: " + row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    // Deleting a value from Array
    public void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");
        }
    }

    // Main Method
    public static void main(String[] args) {
        TwoDimensionalArray array = new TwoDimensionalArray(2, 2);

        // Inserting
        array.insert(0, 0, 1);
        array.insert(0, 1, 2);
        array.insert(1, 0, 8);
        array.insert(1, 1, 9);

        // Accessing
        array.accessCell(0,1);

        // Traverse
        array.traverse();

        // Searching
        array.search(1);

        // Deleting
        array.deleteValueFromArray(0,0);
    }
}
