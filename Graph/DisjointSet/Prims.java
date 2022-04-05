package Graph.DisjointSet;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {

    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    // Constructor
    public Prims(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    // add a weighted undirected edge between two nodes
    public void addWeightedUndirectedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightOfMap.put(second,d);
        second.weightOfMap.put(first, d);
    }

    // Prim's algorithm from source node
    void prims(WeightedNode node) {
        for (int counter = 0; counter < nodeList.size(); counter++) {
            nodeList.get(counter).distance = Integer.MAX_VALUE;
        }
        node.distance=0; // Setting '0' distance for Source Vertex


        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();

        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode presentNode = queue.remove(); // Remove vertex which has min distance


            for (WeightedNode neighbor : presentNode.neighbors) {
                if (queue.contains(neighbor)) {//If vertex is not processed, only then enter in if-else
                    //If known weight of this �adjacent vertex� is more than current edge,
                    //then update �adjacent vertex�s� distance and parent
                    if (neighbor.distance > presentNode.weightOfMap.get(neighbor)) {
                        neighbor.distance = presentNode.weightOfMap.get(neighbor);
                        neighbor.parent = presentNode;
                        queue.remove(neighbor); // Refresh the priority queue
                        queue.add(neighbor);
                    }//end of if-else
                }//end of if-else
            }//end of for loop
        }//end of while loop

        int cost = 0;
        // print table of node with minimum distance and shortest path from source
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node " + nodeToCheck + ", key: " + nodeToCheck.distance + ", Parent: " + nodeToCheck.parent);
            cost = cost + nodeToCheck.distance;
        }//end of for loop

        System.out.println("\nTotal cost of MST: " + cost);
    }//end of method

//end of class

    // Main Class
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeArrayList = new ArrayList<>();
        nodeArrayList.add(new WeightedNode("A"));
        nodeArrayList.add(new WeightedNode("B"));
        nodeArrayList.add(new WeightedNode("C"));
        nodeArrayList.add(new WeightedNode("D"));
        nodeArrayList.add(new WeightedNode("E"));

        Prims graph = new Prims(nodeArrayList);
        graph.addWeightedUndirectedEdge(0,1,5);
        graph.addWeightedUndirectedEdge(0,2,13);
        graph.addWeightedUndirectedEdge(0,4,15);
        graph.addWeightedUndirectedEdge(1,2,10);
        graph.addWeightedUndirectedEdge(1,3,8);
        graph.addWeightedUndirectedEdge(2,3,6);
        graph.addWeightedUndirectedEdge(2,4,20);

        System.out.println("Running Prims Algorithm on the graph : ");
        graph.prims(nodeArrayList.get(1));

    }
}
