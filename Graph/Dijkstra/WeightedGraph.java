package Graph.Dijkstra;

import Graph.AdjancyMatrix.GraphNode;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    // Constructor
    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    // Dijkstra Method
    void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while(!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            for (WeightedNode neighbor : currentNode.neighbors) {
                if(queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightOfMap.get(neighbor)) {
                        neighbor.distance = (currentNode.distance + currentNode.weightOfMap.get(neighbor));
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        // Print Shortest Path
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " +nodeToCheck+", distance: "+nodeToCheck.distance+", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    public static void pathPrint(WeightedNode node) {
        if (node.parent  != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    // Add Weighted Edge
    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightOfMap.put(second, d);
    }

    // Bellman Ford Algorithm
    void bellmanFord(WeightedNode sourceNode) {
        sourceNode.distance = 0;
        for (int i=0; i<nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbor : currentNode.neighbors) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightOfMap.get(neighbor)) {
                        neighbor.distance = currentNode.distance + currentNode.weightOfMap.get(neighbor);
                        neighbor.parent = currentNode;
                    }
                }
            }
        }
        System.out.println("Checking for Negative Cycle..");
        for (WeightedNode currentNode : nodeList) {
            for (WeightedNode neighbor : currentNode.neighbors ) {
                if(neighbor.distance > currentNode.distance + currentNode.weightOfMap.get(neighbor)) {
                    System.out.println("Negative cycle found: \n");
                    System.out.println("Vertex name: " + neighbor.name);
                    System.out.println("Old cost: " + neighbor.distance);
                    int newDistance = currentNode.distance + currentNode.weightOfMap.get(neighbor);
                    System.out.println("new cost: " + newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative Cycle not found");

        // Print Shortest Path
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " +nodeToCheck+", distance: "+nodeToCheck.distance+", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    // Floyd Warshall
    void floydWarshall() {
        int size = nodeList.size();
        int[][] V = new int[size][size];
        // update the cells to zero in case of nodes which shows the distance between it.
        // update the cells in which we have a direct links and then we are going to update the cells to infinity
        // in which we have connections or not
        // Initializing Distance table from adjacency list
        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                if (i == j) {
                    V[i][j] = 0;
                } else if (first.weightOfMap.containsKey(second)) { //we have direct edge between i & j
                    V[i][j] = first.weightOfMap.get(second);
                } else { //no direct edge between i & j, so mark it as infinity [divided by 10 to avoid arithmetic overflow]
                    V[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }

        // Floyd Warshall's Algorithm
        for (int k = 0; k < nodeList.size(); k++) { // k = viaX
            for (int i = 0; i < nodeList.size(); i++) {  // i = column index
                for (int j = 0; j < nodeList.size(); j++) { // j = row index
                    if (V[i][j] > V[i][k] + V[k][j]) {  // if update possible, then update path
                        V[i][j] = V[i][k] + V[k][j];    // this will keep a track on path
                    }
                }
            }
        }

        // Print table of node with minimum distance and shortest path from each source
        for (int i = 0; i < size; i++) {
            System.out.print("Printing distance list for node " + nodeList.get(i) + ": ");
            for (int j = 0; j < size; j++) {
                System.out.print(V[i][j] + " ");
            }
            System.out.println();
        }
//
//        // Add Weighted Edge
//        public void addWeightedEdge(int i, int j, int d) {
//            WeightedNode first = nodeList.get(i);
//            WeightedNode second = nodeList.get(j);
//            first.neighbors.add(second);
//            first.weightOfMap.put(second, d);
//        }
    }


    // Main Class
    public static void main(String[] args) {
//        ArrayList<WeightedNode> nodeList = new ArrayList<>();
//        nodeList.add(new WeightedNode("A", 0));
//        nodeList.add(new WeightedNode("B", 1));
//        nodeList.add(new WeightedNode("C", 2));
//        nodeList.add(new WeightedNode("D", 3));
//        nodeList.add(new WeightedNode("E", 4));
//        nodeList.add(new WeightedNode("F", 5));
//        nodeList.add(new WeightedNode("G", 6));
//
//        WeightedGraph graph = new WeightedGraph(nodeList);
//        graph.addWeightedEdge(0,1,2);
//        graph.addWeightedEdge(0,2,5);
//        graph.addWeightedEdge(1,2,6);
//        graph.addWeightedEdge(1,3,1);
//        graph.addWeightedEdge(1,4,3);
//        graph.addWeightedEdge(2,5,8);
//        graph.addWeightedEdge(3,4,4);
//        graph.addWeightedEdge(4,6,9);
//        graph.addWeightedEdge(5,6,7);

//        System.out.println("Printing Dijkstra from source : A");
//        graph.dijkstra(nodeList.get(0));

//        System.out.println("Printing Bellman Ford from source : A");
//        graph.bellmanFord(nodeList.get(0));

        // Floyd Warshall's
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));
        nodeList.add(new WeightedNode("E", 4));
        nodeList.add(new WeightedNode("F", 5));
        nodeList.add(new WeightedNode("G", 6));

        WeightedGraph graph = new WeightedGraph(nodeList);
        graph.addWeightedEdge(0,3,1);
        graph.addWeightedEdge(0,1,8);
        graph.addWeightedEdge(1,2,1);
        graph.addWeightedEdge(2,0,4);
        graph.addWeightedEdge(3,1,2);
        graph.addWeightedEdge(3,2,9);

        System.out.println("Printing Floyd Warshall's Algorithm from source : A");
        graph.floydWarshall();

    }
}
