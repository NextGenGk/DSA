package BinaryTree.SimpleTree;

import java.util.ArrayList;

public class Tree {

    public static class TreeNode{
        String data;
        ArrayList<TreeNode> children;


        public TreeNode(String data){
            this.data = data;
            this.children = new ArrayList<TreeNode>();
        }

        public void addChild(TreeNode node){
            this.children.add(node);
        }

        public String print(int level){
            String ret;
            ret = " ".repeat(level) + data + "\n";
            for (TreeNode node : this.children){
                ret = ret + node.print(level+1);
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");

        drinks.addChild(hot);
        drinks.addChild(cold);
        cold.addChild(wine);
        cold.addChild(beer);
        hot.addChild(tea);
        hot.addChild(coffee);

        System.out.println(drinks.print(1));
    }
}
