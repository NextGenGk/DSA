package BinaryTree.LL;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
        BinaryNode root;

        public BinaryTreeLL() {
            this.root = null;
        }

        // PreOrder Traversal
        // (Root Node) --> (Left SubTree) --> (Right SubTree)
         public void preOrder(BinaryNode node) {
             if (node == null) {
                 return;
             }
             System.out.print(node.value + " ");
             preOrder(node.left);
             preOrder(node.right);
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
        public void search(String value){
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()){
                BinaryNode presentNode = queue.remove();
                if (presentNode.value == value){
                    System.out.println("The value-"+value+" is found in Tree");
                    return;
                }
                else {
                    if (presentNode.left != null){
                        queue.add(presentNode.left);
                    }
                    if (presentNode.right != null){
                        queue.add(presentNode.right);
                    }
                }
            }
            System.out.println("The value-"+value+" is not found in Tree");
        }

        // Insert Method
        public void insert(String value){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            if (root == null){
                root = newNode;
                System.out.println("Inserted new node at Root");
                return;
            }
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (!queue.isEmpty()){
                BinaryNode presentNode = queue.remove();
                if (presentNode.left == null){
                    presentNode.left = newNode;
                    System.out.println("Successfully Inserted");
                    break;
                }
                else if (presentNode.right == null){
                    presentNode.right = newNode;
                    System.out.println("Successfully Inserted");
                    break;
                }
                else{
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }
            }
        }

        // Get Deepest Node
        public BinaryNode getDeepestNode(){
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            BinaryNode presentNode = null;
            while (!queue.isEmpty()){
                presentNode = queue.remove();
                if (presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
            return presentNode;
        }

        // Delete Deepest Node
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode;
        BinaryNode presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null){
                presentNode.right = null;
                return;
            }
            if (presentNode.right == null){
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // Delete Given Node
    public void deletePartiNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted!");
                return;
            }
            else {
                if (presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The node does not exist in this BT");
    }

    // Delete Binary Tree
    public void deleteBT() {
        root = null;
        System.out.println("BT has been successfully deleted!");
    }


    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.levelOrder();
//        System.out.println(binaryTree.getDeepestNode().value);
//        binaryTree.deleteDeepestNode();
//        binaryTree.deletePartiNode("N3");
//        binaryTree.levelOrder();
//        binaryTree.deleteBT();


    }
}
