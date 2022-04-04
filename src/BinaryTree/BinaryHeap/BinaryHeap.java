package BinaryTree.BinaryHeap;

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    // Constructor
    public BinaryHeap(int size) {
        this.arr = new int[size + 1];
        sizeOfTree = 0;
        System.out.println("Binary Heap is created with the size of " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (sizeOfTree == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Peek Method
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Binary Heap is Empty");
            return null;
        }
        return arr[1];
    }

    // Size of Binary Heap
    public int sizeOfBH() {
        return sizeOfTree;
    }

    // Level Order Traversal
    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    // Heapify for Insert
    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        }
        heapifyBottomToTop(parent, heapType);

    }

    // Insert
    public void insert(int value, String typeHeap) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);
        System.out.println("Inserted " + value + " successfully in Heap");
    }

    // Heapify Top to Bottom
    public void heapifyTopToBottom(int index, String heapType) {
        int left = index / 2;
        int right = index / 2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
        if (heapType == "Max") {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
            }
            if (arr[index] < arr[swapChild]) {
                int temp = arr[index];
                arr[index] = arr[swapChild];
                arr[swapChild] = temp;
            }
        }
        else if (heapType == "Min"){
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
            }
            if (arr[index] > arr[swapChild]) {
                int temp = arr[index];
                arr[index] = arr[swapChild];
                arr[swapChild] = temp;
            }
        }

        heapifyBottomToTop(swapChild,heapType);
    }

    // Extract Node
    public int extractHeadOfBH(String heapType){
        if (isEmpty()){
            return -1;
        }
        else {
            int root = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyBottomToTop(1,heapType);
            return root;
        }
    }

    // Delete Entire
    public void deleteBH(){
        arr = null;
        System.out.println("Deleted Successfully");
    }

    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(5);
        binaryHeap.insert(10,"Max");
        binaryHeap.insert(5,"Max");
        binaryHeap.insert(15, "Max");
        binaryHeap.insert(1,"Max");
        binaryHeap.levelOrder();
//        binaryHeap.extractHeadOfBH("Max");
//        binaryHeap.levelOrder();
//        binaryHeap.deleteBH();
    }
}
