package BinaryTree.Array;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        this.arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size " + size + " has been created");
    }

    // isFull()
    public Boolean isFull() {
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    // Insert Method
    public void insert(String value) {
        if (isFull()) {
            System.out.println("The BT is full");
        } else {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been inserted");
        }
    }

    // Pre Order Traversal
    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    // In Order Traversal
    public void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    // Post Order Traversal
    public void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    // Level Order Traversal
    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Searching Method
    public int search(String value){
        for (int i=1; i<=lastUsedIndex; i++) {
            if (arr[i] == value) {
                System.out.println(value+" exists at the location: " + i);
                return i;
            }
        }
        System.out.println("The value does not exist in BT");
        return -1;
    }

    // Delete Method
    public void delete(String value){
        int location = search(value);
        if (location == -1){
            return;
        }
        else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Node is deleted successfully");
        }
    }

    // Delete Binary Tree
    public void deleteBT(){
        try {
            arr = null;
            System.out.println("The BT has been successfully deleted");
        }
        catch (Exception e){
            System.out.println("There was an error deleting the tree");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(9);
        tree.insert("N1");
        tree.insert("N2");
        tree.insert("N3");
        tree.insert("N4");
        tree.insert("N5");
        tree.insert("N6");
        tree.insert("N7");
        tree.insert("N8");
        tree.insert("N9");
//        tree.preOrder(1);
//        tree.inOrder(1);
//        tree.postOrder(1);
//        tree.levelOrder();
//        tree.search("N3");
//        tree.delete("N3");
//        tree.levelOrder();
//        tree.deleteBT();

    }
}
