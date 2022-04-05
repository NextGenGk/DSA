package Graph.DisjointSet;

import java.util.ArrayList;

public class DisjointSet {

    private ArrayList<WeightedNode> nodeList = new ArrayList<>();
    private String name;

    // Make Set
    public static void makeSet(ArrayList<WeightedNode> nodeList) {
        for (WeightedNode node : nodeList) {
            DisjointSet set = new DisjointSet();
            set.nodeList.add(node);
            node.set = set;
        }
    }

    // Find Set
    public static DisjointSet findSet(WeightedNode node) {
        return node.set;
    }

    // Union Set
    public static DisjointSet union(WeightedNode node1, WeightedNode node2) {
        if (node1.set.equals(node2.set)) {
            return null;
        } else {
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;

            if (set1.nodeList.size() > set2.nodeList.size()) {
                ArrayList<WeightedNode> nodeSet2 = set2.nodeList;
                for (WeightedNode node : nodeSet2) {
                    node.set = set1;
                    set1.nodeList.add(node);
                }
                return set1;
            } else {
                ArrayList<WeightedNode> nodeSet1 = set1.nodeList;
                for (WeightedNode node : nodeSet1) {
                    node.set = set2;
                    set2.nodeList.add(node);
                }
                return set2;
            }
        }
    }

    // Print All Nodes Of This Set
        public void printAllNodesOfThisSet() {
            System.out.println("Printing all nodes of the set: ");
            for (WeightedNode node : nodeList) {
                System.out.print(node + " ");
            }
            System.out.println();
        }


    // Main Class
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));

        DisjointSet.makeSet(nodeList);
        WeightedNode firstNode = nodeList.get(0);
        WeightedNode secondNode = nodeList.get(1);
        DisjointSet output = DisjointSet.findSet(secondNode);
        output.printAllNodesOfThisSet();

        DisjointSet.union(firstNode,secondNode);
        output = DisjointSet.findSet(secondNode);
        output.printAllNodesOfThisSet();

    }
}
