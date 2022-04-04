package Array;

public class SingleDimensionalArray {
    int[] arr = null;

    public SingleDimensionalArray(int sizeOfArray) {
        this.arr = new int[sizeOfArray];
        for (int i=0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Array Insertion
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Array Traversal
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    //Search for an element in the given Array
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    // Delete value from Array
    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");

        }
    }

    // Main Method
    public static void main(String[] args) {
        SingleDimensionalArray iSD = new SingleDimensionalArray(6);
        iSD.insert(0, 10);
        iSD.insert(1, 20);
        iSD.insert(2, 30);
        iSD.insert(3, 40);
        iSD.insert(4, 50);
        iSD.insert(5, 60);

        // Accessing Element
        System.out.println("Accessing Element");

        System.out.println(iSD.arr[0]);
        System.out.println(iSD.arr[1]);
        System.out.println(iSD.arr[2]);
        System.out.println(iSD.arr[3]);
        System.out.println(iSD.arr[4]);
        System.out.println(iSD.arr[5]);

        // Array Traversal
        System.out.println("Array Traversal");
        iSD.traverseArray();

        // Searching Array
        System.out.println("Searching Array");
        iSD.searchInArray(30);

        // Delete Array Index
        System.out.println("Delete Array Index");
        iSD.deleteValue(0);
        System.out.println(iSD.arr[0]);
    }
}

