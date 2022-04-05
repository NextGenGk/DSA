package BinaryTree.AVL;

import java.util.LinkedList;
import java.util.Queue;

public class AVLtree {
    BinaryNode root;

    public AVLtree(){
        root = null;
    }

    // PreOrder Traversal
    // (Root Node) --> (Left SubTree) --> (Right SubTree)
    public void preOrder(BinaryNode node){
        if (node == null){
            return;
        }
        else {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // InOrder Traversal
    // (Left SubTree) --> (Root Node) --> (Right SubTree)
    public void inOrder(BinaryNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder Traversal
    // (Left SubTree) --> (Right SubTree) --> (Root Node)
    public void postOrder(BinaryNode node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Level Order Traversal
    // (Root Node) --> (Left SubTree) --> (Right SubTree)
    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    // Search Method
    public BinaryNode search(BinaryNode node, int value){
        if (node == null){
            System.out.println("Value " + value + " not found in BST");
            return null;
        }
        else if (node.value == value){
            System.out.println("Value " + value + " found in BST");
            return node;
        }
        else if (value < node.value){
            return search(node.left, value);
        }
        else {
            return search(node.right, value);
        }
    }

    // Get Height
    public int getHeight(BinaryNode node){
        if (node == null){
            return  0;
        }
        return node.height;
    }

    // Right Rotate Method
    private BinaryNode rotateRight(BinaryNode disBalancedNode){
        BinaryNode newRoot = disBalancedNode.left;
        disBalancedNode.left = disBalancedNode.left.right;
        newRoot.right = disBalancedNode;
        disBalancedNode.height = 1 + Math.max(getHeight(disBalancedNode.left), getHeight(disBalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
        return newRoot;
    }

    // Left Rotate Method
    private BinaryNode rotateLeft(BinaryNode disBalancedNode){
        BinaryNode newRoot = disBalancedNode.right;
        disBalancedNode.right = disBalancedNode.right.left;
        newRoot.left = disBalancedNode;
        disBalancedNode.height = 1 + Math.max(getHeight(disBalancedNode.left), getHeight(disBalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
        return newRoot;
    }

    // Get Balanced
    public int getBalanced(BinaryNode node){
        if (node == null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // Insert Method
    private BinaryNode insertNode(BinaryNode node, int nodeValue){
        if (node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        }
        else if (nodeValue < node.value){
            node.left = insertNode(node.left, nodeValue);
        }
        else {
            node.right = insertNode(node.right, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalanced(node);

        // left - left condition
        if (balance > 1 && nodeValue < node.left.value){
            return rotateRight(node);
        }

        // left right condition
        if (balance > 1 && nodeValue > node.left.value){
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // right - right condition
        if (balance < -1 && nodeValue > node.right.value){
            return rotateLeft(node);
        }

        // right left condition
        if (balance < -1 && nodeValue < node.right.value){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    // Insert
    public void insert(int value){
        root = insertNode(root, value);
    }

    // Minimum Node
    public BinaryNode minimumNode(BinaryNode root){
        if (root.left == null){
            return root;
        }
        return minimumNode(root.left);
    }

    // Delete Method
    public BinaryNode deleteNode(BinaryNode node, int value){
        if (node == null){
            System.out.println("Value not found in AVL Tree");
            return node;
        }
        if (value < node.value){
            node.left = deleteNode(node.left, value);
        }
        else if (value > node.value){
            node.right = deleteNode(node.right, value);
        }
        else {
            if (node.left != null && node.right != null){
                BinaryNode tempNode = node;
                BinaryNode minNodeForRight = minimumNode(tempNode.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right, minNodeForRight.value);
            }
            else if (node.left != null){
                node = node.left;
            }
            else if (node.right != null){
                node = node.right;
            }
            else {
                node = null;
            }
        }

        int balance = getBalanced(node);

        // left - left condition
        if (balance > 1 && getBalanced(node.left) >= 0){
            return rotateRight(node);
        }

        // left right condition
        if (balance > 1 && getBalanced(node.left) < 0){
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // right - right condition
        if (balance < -1 && getBalanced(node.right) <= 0){
            return rotateLeft(node);
        }

        // right left condition
        if (balance < -1 && getBalanced(node.right) > 0){
            node.right = rotateLeft(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    // Delete
    public void delete(int value){
        root = deleteNode(root,value);
    }

    // Delete Entire Node
    public void deleteAVL(){
        root = null;
        System.out.println("Deleted Successfully");
    }

     public static void main(String[] args) {
        AVLtree avLtree = new AVLtree();
         avLtree.insert(5);
         avLtree.insert(10);
         avLtree.insert(15);
         avLtree.insert(20);
         avLtree.levelOrder();
//         avLtree.delete(5);
//         System.out.println();
//         avLtree.levelOrder();
//         avLtree.deleteAVL();
    }
}
